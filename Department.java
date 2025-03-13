public class Department {
    
    String deptName;
    String inchargeName;
    int no_of_labs;

    // Constructor
    Department(String deptName, String inchargeName, int no_of_labs) {
        this.deptName = deptName;
        this.inchargeName = inchargeName; // Fixed typo
        this.no_of_labs = no_of_labs;
    }

    // Method to display department details
    public void displayDeptInfo() {
        System.out.println("The Name of the Dept is: " + deptName);
        System.out.println("The Name of the Incharge of the department is: " + inchargeName);
        System.out.println("The no. of the Labs in the department is: " + no_of_labs);
    }
}
