public class Labs {
    int labID;
    String labName;
    int capacity;

        public Labs(int labID, String labName, int capacity) {
        this.labID = labID;
        this.labName = labName;
        this.capacity = capacity;
    }

       public void displayLabInfo() {
        System.out.println("Lab ID: " + labID);
        System.out.println("Lab Name: " + labName);
        System.out.println("Lab computers: " + capacity);
    }
}
