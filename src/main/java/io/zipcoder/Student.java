package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private final Double[] testScores;
    private String firstName,lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }

    public Double[] getTestScores() {
        return testScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public Integer getAverageExamScores() {
        for (int i = 0; i < examScores.size(); i++) {


            return  i += (int) (examScores.get(i) / examScores.size());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "testScores=" + Arrays.toString(testScores) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }
}
