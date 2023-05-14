import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //New school object is created
    //teachers list of teachers in school
    //students list of students in school
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
    }

    //Return the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //Adds teacher to the school
    //teacher to the teacher to be added
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //Returns the list of students in the school
    public List<Student> getStudents(){
        return students;
    }

    //Adds students to the school
    //Argument says the student to be added
    public void addStudents(Student student) {
        students.add(student);
    }

    //Returns the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //Adds the total money earned by the school
    //Argument MoneyEarned money that is supposed to be added
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    //Returns total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //Updates the money spent in salaries to the teacher
    public static void updateTotalMoneySpent(int moneySpent) {

        totalMoneyEarned -= moneySpent; // same as totalMoneyEarned = totalMoneyEarned - moneySpent

    }


}
