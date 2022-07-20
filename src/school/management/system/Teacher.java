package school.management.system;

//This class is responsible for keeping track of teachers ID, names and salary

public class Teacher {

    private int id;
    private String name;
    private int salary;

    /**
     * Creates new teacher object
     * @param id id for the teacher: unique
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
