//This class keeps track of student fees, names, ID, grades & fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*Constructor-
    *Creates a new student by initializing ID, name and grade
    *Fees for every student is $30,000
    *Fees paid initially is 0.
    */
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    //Not going to alter a student's name, and ID

    //Used to update student's grade.
    public void setGrade(int grade) {
        this.grade=grade;
    }

    /*Keep adding fees to the feesPaid.
     *Add the fees to the fees paid.
     * The school is going to receive the funds.
    */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    //Returns student ID
    public int getId() {
        return id;
    }

    //Returns student name
    public String getName() {
        return name;
    }

    //Returns grade of student
    public int getGrade() {
        return grade;
    }

    //Returns fees paid by student
    public int getFeesPaid() {
        return feesPaid;
    }

    //Returns total fees of student
    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " Total fees paid so far: $" + feesPaid;
    }
}

