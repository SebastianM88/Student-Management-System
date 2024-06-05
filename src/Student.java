public class Student {

    // define each variable that we will use
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Constructor which has the reason to call the parameters
    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // The setter has the meaning of updating the values of the variables
    public void setGrade(int grade) {

        this.grade = grade;
    }

    // The method that has as sole purpose to update the amount of money held after the collection of the fee
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    // All the getters have the meaning to access the values of variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    // The method has the meaning to print a message with the name and with the fee paid
    @Override
    public String toString() {
        return " Name of the Student " + name +
                " Total fees paid so far $" + feesPaid;
    }
}