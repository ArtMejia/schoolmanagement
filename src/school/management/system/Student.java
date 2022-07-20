package school.management.system;

// This class is responsible for keeping track of students ID, names, grade fees and fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing the values
     * The fees for each student will be $30,000.
     * Fees paid initially is 0
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //We are not going to alter students name, student id

    /**
     * Used to update students grade
     * @param grade new grade of student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * feesPaid = $10,000 + $5,000 + $15,000
     * Keep adding to fee's to feesPaid field
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     * @param fees the fees that student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees for the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
