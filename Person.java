public class Person{
    String firstNamez;
    String lastName;
    int age;
    
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduceSelf(){
        System.out.println("This is: " + firstName + " " + lastName+ ", he/she is " + age);
    }


    public static void main(String[] args){
        Person Sarah = new Person("Sarah", "Washington", 18);
        Sarah.introduceSelf();
    }

}