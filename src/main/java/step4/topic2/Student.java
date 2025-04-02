package step4.topic2;

import step4.topic1.personDemo.Person;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(getStudentId() + " ID");

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
