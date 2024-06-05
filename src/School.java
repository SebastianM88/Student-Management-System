import java.util.List;

public class School {

    // define each variable that we will use
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int  totalMoneySpent;

    // Constructor that aims to call the parameters in our case they are of the type of Array
    public School(List<Teacher> teachers, List<Student> students) {

        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // All the getters have the meaning to access the values of variables
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // // Our add-type setters have the meaning of updating the values of the variables
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // Method that has the sole purpose to apply the amount of money obtained
    public static void updateTotalMoneyEarned(int MoneyEarned) {
         totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // The method that aims to subtract the amount of the den from the total amount
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
