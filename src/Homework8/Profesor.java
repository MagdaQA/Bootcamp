package Homework8;

public class Profesor extends UniversityEmployee {
    private String grade;
    private String specialization;

    public void teachStudents() {

    }

    public void makeExam() {

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void goToUniversityCanteen() {
        System.out.println("Profesorowie jedzą od dostawcy y"); // dlaczego się nie wyświetla?
    }
}

