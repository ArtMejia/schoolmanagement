package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(john);

        Student tamara = new Student(1, "Tamara", 4);
        Student jayson = new Student(2, "Jayson", 12);
        Student marcus = new Student(3, "Marcus", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(jayson);
        studentList.add(marcus);

        School chs = new School(teacherList, studentList);

        Teacher megan = new Teacher(4,"Megan", 900);

        chs.addTeachers(megan);


        tamara.payFees(5000);
        marcus.payFees(6000);
        System.out.println("CHS has earned $" + chs.getTotalMoneyEarned());

        System.out.println("----MAKE SCHOOL PAY SALARY----\n");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("CHS has spent for salary to " + lizzy.getName() + " and now has $" + chs.getTotalMoneyEarned());
        john.receiveSalary(john.getSalary());
        System.out.println("CHS has spent for salary to " + john.getName() + " and now has $" + chs.getTotalMoneyEarned());

        System.out.println(marcus);

        melissa.receiveSalary(melissa.getSalary());

        System.out.println(melissa);
    }
}
