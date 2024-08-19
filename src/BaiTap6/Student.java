package BaiTap6;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentId;
    private String studentName;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    // Constructor
    public Student(String studentId, String studentName, double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    // toString method
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Student Name: " + studentName +
                ", Math Score: " + mathScore + ", Physics Score: " + physicsScore +
                ", Chemistry Score: " + chemistryScore;
    }
}
