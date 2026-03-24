
public class LeaveRequest {
    
    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status; // "Pending", "Approved", "Denied"
    private String reason;
    
    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }
    
    public void setRequestId(int requestId) {
        if (requestId > 0) {
            this.requestId = requestId;
        }
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
    public void setEmployee(Employee employee) {
        if (employee != null) {
            this.employee = employee;
        }
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        if (startDate != null && !startDate.isEmpty()) {
            this.startDate = startDate;
        }
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public void setEndDate(String endDate) {
        if (endDate != null && !endDate.isEmpty()) {
            this.endDate = endDate;
        }
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        if (status != null && (status.equals("Pending") || status.equals("Approved") || status.equals("Denied"))) {
            this.status = status;
        }
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setReason(String reason) {
        if (reason != null && !reason.isEmpty()) {
            this.reason = reason;
        }
    }
    
    // Constructor
    public LeaveRequest(int requestId, Employee employee, String startDate, 
                        String endDate, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending"; // Default status
        this.reason = reason;
    }
    
    // Overloaded constructor with minimal parameters
    public LeaveRequest(int requestId, Employee employee) {
        this.requestId = requestId;
        this.employee = employee;
        this.status = "Pending";
    }
    
    // Overloaded constructor with dates only
    public LeaveRequest(Employee employee, String startDate, String endDate) {
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
    }
    
    // Overloaded constructor with all parameters including status
    public LeaveRequest(int requestId, Employee employee, String startDate, 
                        String endDate, String reason, String status) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        if (status != null && (status.equals("Pending") || status.equals("Approved") || status.equals("Denied"))) {
            this.status = status;
        } else {
            this.status = "Pending";
        }
    }
    
    // Methods will be added here
}