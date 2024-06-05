import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creation of 3 teacher-type objects together with the salary of each individual
        Teacher daniela = new Teacher(1, "Daniela", 700);
        Teacher denisa = new Teacher(2, "Denisa", 750);
        Teacher alex = new Teacher(3, "Alex", 800);

        // creating our Array that will contain all the objects of the professors type
        List<Teacher> teachersList = new ArrayList<>();

        // adding the 3 objects to be implemented
        teachersList.add(daniela);
        teachersList.add(denisa);
        teachersList.add(alex);

        // Creation of 3 students-type objects together with their name and the register number
        Student cristi = new Student(1, "Cristi", 3);
        Student sandel = new Student(2, "Sandel", 4);
        Student costi = new Student(3, "Costi", 6);

        // creating our Array that will contain all the objects of the students type
        List<Student> studentsList = new ArrayList<>();

        // adding the 3 objects to be implemented
        studentsList.add(cristi);
        studentsList.add(sandel);
        studentsList.add(costi);

        // Our 'unib' object, which will aggregate the previous 2 objects and all their data
        School Unib = new School(teachersList, studentsList);

        // Fees paid by students
        cristi.payFees(5000);
        sandel.payFees(6000);

        // The total sum of money own by the school
        System.out.println("\nThe School has earned: " + Unib.getTotalMoneyEarned() + "$ from de students fees")  ;

        System.out.println("\n--------------- The amount of money left for our school after paying the salary to teachers ----------------\n");

        // Code to specify that the amount paid by the school to the teacher's account and specify the amount of money left
        daniela.receivedSalary(daniela.getSalary());
        System.out.println("Unib has spent for salaries to: "+ daniela.getName()
        + " and now it's left with the amount of " + Unib.getTotalMoneyEarned() + "$");

        // Code to specify that the amount paid by the school to the teacher's account and specify the amount of money left
        denisa.receivedSalary(denisa.getSalary());
        System.out.println("Unib has spent for salaries to: " + denisa.getName()
                + " and now it's left with the amount of " + Unib.getTotalMoneyEarned() + "$");
    }
}
