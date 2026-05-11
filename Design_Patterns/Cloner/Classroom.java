package Design_Patterns.Cloner;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Cloner{
  private String id;
  private List<Student> students;

  public Classroom(String id) {
    this.id = id;
    this.students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  @Override
  public Classroom clone(){
     Classroom newClone = new Classroom(this.id);
     for (Student current: students){
      newClone.addStudent(current.clone());
     }
     return newClone;
  }

  @Override
  public String toString() {
    return "Classroom{id='" + id + "', students=" + students.toString() + "}";
  }
}
