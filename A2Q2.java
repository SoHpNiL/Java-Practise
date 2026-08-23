import java.io.*;
import java.util.*;

public class A2Q2 {

  public static
  class Student { // utilize student class to store each student and then get their grades
    private String originalString;
    private int oldGrade;
    private int newGrade;

    public Student(String line, int o, int n) {
      this.originalString = line; // save original line so we may just call it immediatly
      this.oldGrade = o;
      this.newGrade = n;
    }

    public String getOriginalString() {
      return this.originalString;
    }

    public int getOldGrade() {
      return this.oldGrade;
    }

    public int getNewGrade() {
      return this.newGrade;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder finalOutput = new StringBuilder();
    boolean firstBlock = true;

    String line;
    while ((line = reader.readLine()) != null) {
      line = line.trim();
      if (line.isEmpty()) {
        continue;
      }

      int n = Integer.parseInt(line);

      Student[] students = new Student[n];
      for (int j = 0; j < n; j++) {
        String rawLine = reader.readLine().trim();
        StringTokenizer st = new StringTokenizer(rawLine);
        st.nextToken(); // Skip to grades
        int oldGrade = Integer.parseInt(st.nextToken());
        int newGrade = Integer.parseInt(st.nextToken());
        students[j] = new Student(rawLine, oldGrade, newGrade); // create a student
      }
      mergeSort(students, 0, n - 1);

      if (!firstBlock) {
        finalOutput.append("\n\n");
      }

      firstBlock = false;

      for (int j = 0; j < n; j++) {
        if (j > 0) finalOutput.append('\n');
        finalOutput.append(students[j].getOriginalString());
      }
    }

    System.out.print(finalOutput);
  }

  // Divide and conquer thingy idk from lectures tho
  private static void mergeSort(Student[] studentArray, int i, int j) {
    if (i < j) {
      int m = (i + j) / 2;
      mergeSort(studentArray, i, m);
      mergeSort(studentArray, m + 1, j);
      merge(studentArray, i, j, m + 1);
    }
  }

  private static boolean comesBefore(Student student1, Student student2) {
    if (student1.getNewGrade() != student2.getNewGrade()) {
      return student1.getNewGrade() > student2.getNewGrade();
    }

    return student1.getOldGrade() > student2.getOldGrade();
  }

  // Combine: merge both sorted halves into one sorted list
  private static void merge(Student[] studentArray, int l, int r, int s) {
    Student[] temporaryStudents = new Student[r - l + 1];
    int i = l, j = s, k = 0;

    while (i <= s - 1 && j <= r) {
      if (!comesBefore(studentArray[j], studentArray[i])) {
        temporaryStudents[k++] = studentArray[i++];
      } else {
        temporaryStudents[k++] = studentArray[j++];
      }
    }
    while (i <= s - 1) temporaryStudents[k++] = studentArray[i++];
    while (j <= r) temporaryStudents[k++] = studentArray[j++];

    for (int x = 0; x < temporaryStudents.length; x++) {
      studentArray[l + x] = temporaryStudents[x];
    }
  }
}
