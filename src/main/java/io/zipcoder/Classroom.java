package io.zipcoder;

public class Classroom {
    private Student[] students;

    private int maxNumOfStudents = 0;

    public Classroom() {
    }

    public Classroom(Student[] students, int maxNumOfStudents) {
        this.students = students;
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }
}
