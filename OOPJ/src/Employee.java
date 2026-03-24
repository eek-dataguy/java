public class Employee {
    // Properties (attributes)
    private int employeeId;
    private String name;
    private String department;
    private String email;
    private int leaveBalance = 20; // Annual leave balance in days

    // Getters and Setters for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Employee ID must be positive.");
        }
    }

    // Getters and Setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    // Getters and Setters for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Department cannot be empty.");
        }
    }

    // Getters and Setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.trim().isEmpty()) {
            this.email = email;
        } else {
            System.out.println("Email cannot be empty.");
        }
    }

    // Getters and Setters for leaveBalance
    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            System.out.println("Leave balance cannot be negative.");
        }
    }

    // Method to calculate remaining leave balance after a request
    public int requestLeave(int days) {
        if (days <= 0) {
            System.out.println("Leave days must be positive.");
            return leaveBalance;
        }
        if (days > leaveBalance) {
            System.out.println("Insufficient leave balance. Available: " + leaveBalance + " days.");
            return leaveBalance;
        }
        leaveBalance -= days;
        System.out.println("Leave request approved. Remaining balance: " + leaveBalance + " days.");
        return leaveBalance;
    }

        // Constructor
    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
    }
    // Methods will be added here
}