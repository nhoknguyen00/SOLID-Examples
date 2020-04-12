package OpenClosed.GoodExample;

import OpenClosed.GoodExample.BackendDeveloper;
import OpenClosed.GoodExample.Developer;
import OpenClosed.GoodExample.FrontendDeveloper;

public class SalaryCalculator {
	private int allSalary = 0;
	
	public void calculateAllSalary(Developer[] devs) {
		for (Developer dev : devs) {
			allSalary += dev.getSalary();
		}
	}
	
	public void getAllSalary() {
		System.out.println("All Salary: " + allSalary);
	}
}
