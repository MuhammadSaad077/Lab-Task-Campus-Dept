public class Computer{
    int id;
    String version;
    String ramSize;
    String diskSize;

    
    Computer(int id, String version, String ramSize, String diskSize) {
        this.id = id;
        this.version = version;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
    }

        public void displayPCInfo() {
        System.out.println("ID: " + id + ", Version: " + version + ", RamSize: " + ramSize + ", DiskSize: " + diskSize);
    }
}
