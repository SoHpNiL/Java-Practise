import java.util.ArrayList;
public class CR3 {
    public static void main(String[] args) {
        Accumulator acc4 = new Accumulator();
        acc4.addValue(4);
        acc4.addValue(-3);
        if (acc4.getSum()){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }
    }

}


class Accumulator {
    ArrayList<Integer> NumList = new ArrayList<Integer>();

    public Accumulator(){
        // in the future intialize within constructors and declare on fields instead
    }

    public void addValue(int value) {
        if (value < 0){
            return;
        }
        NumList.add(value);
    }

    public boolean getSum() {
        int sum = 0;
        for (int i = 0; i < NumList.size(); i++) {
            sum += NumList.get(i);
        }
        if (sum == 5){
            return true;
        }

        return false;
}

    
}