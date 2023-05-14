// School Management System

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vandehorn", 600);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(melissa);
        teachersList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student raksith = new Student(2, "Raksith Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(raksith);
        studentList.add(rabbi);

        School ghs = new School(teachersList,studentList);

        tamasha.payFees(5000);
        raksith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


        System.out.println("---- Making SCHOOL PAY SALARY ----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        + " and now has " + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
        + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(raksith);

        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);
    }

}