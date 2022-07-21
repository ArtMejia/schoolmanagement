package school.management.system;

//This class is responsible for keeping track of teachers ID, names and salary

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

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
        this.salaryEarned = 0;
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

    /**
     * Adds salaryEarned
     * removes from total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Teachers name ").append(name).append(" ");
        sb.append("Total salary earned so far $").append(salaryEarned);
        sb.append("");
        return sb.toString();
    }
}
