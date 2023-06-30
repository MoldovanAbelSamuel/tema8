package org.fasttrackit.com;

public class Student {
    private String name;
    private double grade;

    private static double sum = 0;

    public static int getTotalStudents() {
        return totalStudents;
    }

    private static int totalStudents = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
        sum += this.grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double average (){
        return sum / totalStudents;
    }
}
