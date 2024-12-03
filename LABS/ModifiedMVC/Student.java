package model;

public class Student {
    private String name;
    private String ID;
    private double CGPA;

  
    public Student(String name, String ID, double CGPA) {
        this.name = name;
        this.ID = ID;
        this.CGPA = CGPA;
    }

  
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getCGPA() {
        return CGPA;
    }


    public String getData() {
        return "ID: " + ID + " | Name: " + name + " | CGPA: " + CGPA;
    }
}
