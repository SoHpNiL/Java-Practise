package Design_Patterns.Cloner;

public class Student implements Cloner {
    private String name;
    private String upi;

    public Student(String name, String upi) {
      this.name = name;
      this.upi = upi;
    }
    @Override
    public Student clone(){
        System.out.println("Cloned" + this.name);
        return new Student(this.name, this.upi);
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "' upi='" + upi + "'}";
    }
}