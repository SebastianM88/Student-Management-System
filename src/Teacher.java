public class Teacher {

    // define each variable that we will use
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Constructor which has the reason to call the parameters
    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // All the getters have the meaning to access the values of variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // The setter has the meaning of updating the values of the variables
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // The method has the meaning to update the salary and the sum of money which was spent
    public void receivedSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    // The method has the meaning to print a message with the name and the salary earned
    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                + " Total salary earned so far $"
                + salaryEarned;
    }
}

