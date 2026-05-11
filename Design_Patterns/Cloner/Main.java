package Design_Patterns.Cloner;

public class Main {
    public static void main(String[] args) {
        // create a classroom
        Classroom original = new Classroom("CS101");

        // add some students
        original.addStudent(new Student("Alice", "1"));
        original.addStudent(new Student("Bob", "2"));
        original.addStudent(new Student("Charlie", "3"));

        // clone the classroom
        Classroom clone = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);

        // prove its a deep clone - mutating clone doesn't affect original
        clone.addStudent(new Student("Dave", "4"));
        System.out.println("\nAfter adding Dave to clone:");
        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);
    }
}