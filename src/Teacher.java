
//This class keeps track of teacher's name, id, and salary
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /*Constructor
     *Creates a new Teacher object with id, name & salary
     */

    public Teacher(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    //Returns ID of Teacher
    public int getId() {
        return id;
    }

    //Returns name of Teacher
    public String getName() {
        return name;
    }

    //Returns salary of Teacher
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Adds to the salary earned & removes from total money earned from school
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name +
                " Total salary earned far: $" + salaryEarned;
    }
}
