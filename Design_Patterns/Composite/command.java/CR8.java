import java.util.ArrayList;
import java.util.List;

class Microwave {
  private boolean turnedOn = false;

  public void turnOn() {
    turnedOn = true;
    System.out.println("Microwave is now turned on.");
  }

  public void turnOff() {
    turnedOn = false;
    System.out.println("Microwave is now turned off.");
  }

  public boolean isOn() {
    return turnedOn;
  }
}

class Oven {
  private boolean turnedOn = false;

  public void turnOn() {
    turnedOn = true;
    System.out.println("Oven is now turned on.");
  }

  public void turnOff() {
    turnedOn = false;
    System.out.println("Oven is now turned off.");
  }

  public boolean isOn() {
    return turnedOn;
  }
}

interface Command {
  void undo();

  void execute();
}

class StartMicrowaveCommand implements Command {
  private Microwave microwave;

  StartMicrowaveCommand(Microwave microwave) {
    this.microwave = microwave;
  }

  @Override
  public void execute() {
    if (microwave.isOn()) {
      System.out.println("Microwave already on!");
    } else {
      this.microwave.turnOn();
    }
  }

  @Override
  public void undo() {
    if (microwave.isOn()) {
      this.microwave.turnOff();
    } else {
      System.out.println("Microwave already off!");
    }
  }
}

class PreheatOvenCommand implements Command {
  private Oven oven;

  PreheatOvenCommand(Oven oven) {
    this.oven = oven;
  }

  @Override
  public void execute() {
    if (oven.isOn()) {
      System.out.println("Oven already on!");
    } else {
      this.oven.turnOn();
    }
  }

  @Override
  public void undo() {
    if (oven.isOn()) {
      this.oven.turnOff();
    } else {
      System.out.println("Oven already off!");
    }
  }
}

class KitchenRemoteControl {
  private List<Command> historyCommands;
  private List<Command> queueCommands;

  public KitchenRemoteControl() {
    historyCommands = new ArrayList<>();
    queueCommands = new ArrayList<>();
  }

  public void setCommand(Command command) {
    queueCommands.add(command);
  }

  public void pressButton() {
    if (queueCommands.isEmpty()) {
      System.out.println("No command to do.");
    } else {
      Command doCommand = queueCommands.get(0);
      doCommand.execute();
      historyCommands.add(doCommand);
      queueCommands.remove(0);
    }
  }

  public void undoButton() {
    if (historyCommands.isEmpty()) {
      System.out.println("No command to undo.");
    } else {
      historyCommands.get(historyCommands.size() - 1).undo();
    }
  }
}
