package OpenClosed.BadExample;
import OpenClosed.BadExample.Developer;
import OpenClosed.BadExample.BackendDeveloper;
import OpenClosed.BadExample.FrontendDeveloper;

public class SalaryCalculator {
	private int allSalary = 0;
	
	public void calculateAllSalary(Developer[] devs) {
		for (Developer dev : devs) {
			if (dev instanceof BackendDeveloper) {
				allSalary += 1000;
			}
			
			if (dev instanceof FrontendDeveloper) {
				allSalary += 900;
			}
		}
	}
	
	public void getAllSalary() {
		System.out.println("All Salary: " + allSalary);
	}
}
