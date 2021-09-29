package Homework8;

public class Student extends Person {
    private String department;

    public void goForClass() {

    }


    @Override
    public void introducte() {
        System.out.println("Introducte from Student");
        //super.introducte(); // super - wywołanie z klasy bazowej, z której dziedziczymy
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

