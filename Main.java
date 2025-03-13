public class Main {
    public static void main(String args[]) {
        Campus campus = new Campus("Shahid Bhatti", "Bahria Town", 10);
        campus.name = "COMSATS UNIVERSITY ISLAMABAD";  
System.out.println("---------------------------------------");
        campus.displayCampInfo();          
        Department[] department = new Department[5];
        department[0] = new Department("Computer Science", "Shahid Jutt", 5);
        department[1] = new Department("Mathematics", "Muhammad Abdullah", 5);
        department[2] = new Department("English", "Muhammad Saad", 5);
        department[3] = new Department("BBA", "Ahtesham Jutt", 5);
        department[4] = new Department("Civics", "Ali", 5);

       
        for (int i = 0; i < department.length; i++) 
	{
System.out.println("---------------------------------------");

            department[i].displayDeptInfo();
	 Labs[] labs=new Labs[department[i].no_of_labs];

	for(int j=0;j<department.length;j++)
	{
	labs[j]=new Labs(j+1,"SHERA",50);
	labs[j].displayLabInfo();

	}
		}

    
	}
		}
