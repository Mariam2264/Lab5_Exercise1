/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package course;
import java.util.ArrayList;
public class Course {
    private String courseName;
    private int noofStudents;
    private String teacher;
    public static int instances = 0;
    private ArrayList<Student> studentList;
  public Course() {
      instances++;
      this.noofStudents = 0;
      this.courseName = "Not Set";
      this.teacher = "Not set";
      this.studentList = new ArrayList<Student>();
  } 
  public Course(int noofStudents, String courseName, String teacher){
      instances++;
      this.studentList = new ArrayList<Student>();
      this.courseName = courseName;
      this.teacher = teacher;
      this.noofStudents = noofStudents;
  }
  public String getCourseName(){
      return this.courseName;
  }
  public int getNo0fStudents(){
      return this.noofStudents;
  }
  public String getTeacher(){
      return this.teacher;
  }
  public void setCourseName(String course){
      this.courseName = courseName;
  }
  public void setNoOfStudents(int noofStudents){
      this.noofStudents = noofStudents;
  }
  public void setTeacher(String teacher){
  this.teacher = teacher;
  }
  public boolean addStudent(Student student){
      if(student == null || studentList.contains(student)){
          return false;
      }
      studentList.add(student);
      return true;
  }
  public void printStudents(){
      for(Student s : studentList){
System.out.println(s.getName()+ ",with" + s.getAge()+ "year(s)");
      }
  }
      public static class Student {
        private int number;
        private String name;
        private int age;

        public Student(int number, String name,int age){
            this.number = number;
            this.name = name;
            this.age = age;
        }

        public int getNumber() {
            return this.number;
        }

        public String getName(){
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
      }
public static void main(String[] args){
    Course oop = new Course(6, "Object Oriented Programming", "LeBron James");
    oop.addStudent(new Course.Student(6, "Michael Jordan", 56));
    oop.addStudent(new Course.Student(23, "Kyrie Irving", 24));
    oop.addStudent(new Course.Student(14, "Kevin Love", 27));
    System.out.println(oop.getCourseName() + " has the following students");
    oop.printStudents();
}
    }
  


