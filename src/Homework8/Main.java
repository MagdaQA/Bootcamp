package Homework8;
import Homework8.Person;
import Homework8.Profesor;
import Homework8.Student;
import Homework8.AdministrationEmployee;

public class Main {

    public static void main(String[] args) {


        Person person = new Person();
        person.introducte();

        Profesor profesor = new Profesor();
        profesor.introducte();
        profesor.signingContractWithUniversity();
        profesor.goToUniversityCanteen();

        AdministrationEmployee administrationEmployee1 = new AdministrationEmployee();
        AdministrationEmployee administrationEmployee2 = new AdministrationEmployee();

        administrationEmployee1.signingContractWithUniversity();
        administrationEmployee1.setNumberOfCasesWeekly(52);
        administrationEmployee2.setNumberOfCasesWeekly(64);

        System.out.println("Liczba spraw u praktykanta administracji: " + administrationEmployee1.getNumberOfCasesWeekly());
        System.out.println("Liczba spraw u praconwnika Jana K.: " + administrationEmployee2.getNumberOfCasesWeekly());


        System.out.println("----------");

        Student student = new Student();
        student.introducte();
        student.setDepartment("History");
        System.out.println("Wydział studenta: " + student.getDepartment());

        UniversityEmployee universityEmployee1 = new UniversityEmployee();
        universityEmployee1.signingContractWithUniversity();

    }
}

