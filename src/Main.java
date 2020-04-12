//import SingleResponsibility.BadExample.Developer;
//import SingleResponsibility.GoodExample.*;
//import OpenClosed.BadExample.*;
//import OpenClosed.GoodExample.*;
//import LiskovSubstitution.BadExample.*;
//import LiskovSubstitution.GoodExample.*;
//import InterfaceSegeration.BadExample.*;
//import InterfaceSegeration.GoodExample.*;
//import DependencyInversion.BadExample.*;
import DependencyInversion.GoodExample.*;

public class Main {
	public static void main(String[] args) {
		/* Single Responsibility Principle:
		 * A class should have one and only one reason to change,
		 * meaning that a class should have only one job*/
		//Single Responsibility Principle - Bad Example
		/*Developer dev = new Developer();
		dev.codeBackend();
		dev.codeFrontend();
		dev.codeDevops();*/
		
		//Single Responsibility Principle - Good Example
		/*BackendDeveloper backendDev = new BackendDeveloper();
		FrontendDeveloper frontendDev = new FrontendDeveloper();
		DevopsDeveloper devopsDev = new DevopsDeveloper();
		backendDev.code();
		frontendDev.code();
		devopsDev.code();*/
		
		
		/* Open-Closed Principle:
		 * Objects or entities should be open for extension, but closed for modification */
		//Open-Closed Principle - Bad Example
		/*Developer devs[] = {new BackendDeveloper(), new FrontendDeveloper()};
		
		SalaryCalculator salCal = new SalaryCalculator();
		salCal.calculateAllSalary(devs);
		salCal.getAllSalary();*/
		
		//Open-Closed Principle - Good Example
		/*Developer devs[] = {new BackendDeveloper(), new FrontendDeveloper()};
		SalaryCalculator salCal = new SalaryCalculator();
		salCal.calculateAllSalary(devs);
		salCal.getAllSalary();*/
		
		/*Liskov Substitution Principle:
		 * Let q(x) be a property provable about objects of x of type T.
		 * Then q(y) should be provable for objects y of type S where S is a subtype of T.
		 * */
		//Liskov Substitution Principle - Bad Example
		/*SuperHero superHeroes[] = {new Superman(), new Batman()};
		superHeroes[0].beSuperHero();
		superHeroes[0].beRich(); //beRich will throw exception here
		superHeroes[1].beSuperHero();
		superHeroes[1].beRich();*/
		
		//Liskov Substitution Principle - Good Example
		/*SuperHero superHeroes[] = {new Superman(), new Batman()};
		superHeroes[0].beSuperHero();
		superHeroes[1].beSuperHero();
		((Batman) superHeroes[1]).beRich();*/
		
		//Interface Segregation Principle:
		/*A client should never be forced to implement an interface
		 *that it doesn't use or clients shouldn't be forced to depend on methods they do not use.
		 * */
		//Interface Segregation Principle - Bad Example
		/*Superman superman = new Superman();
		superman.deleteVilians();
		superman.fly();
		
		Batman batman = new Batman();
		batman.deleteVilians();
		batman.fly();*/
		
		//Interface Segregation Principle - Good Example
		/*Superman superman = new Superman();
		superman.deleteVilians();
		superman.fly();
		
		Batman batman = new Batman();
		batman.deleteVilians();*/
	
		//Dependency Inversion Principle:
		/*Entities must depend on abstractions not on concretions.
		 *It states that the high level module must not depend on the low level module,
		 *but they should depend on abstractions.
		* */
		//Dependency Inversion Principle - Good and Bad example
		//Change package above to see the example
		Batman batman = new Batman();
		int batPower = batman.get_power();
		System.out.println("Batman power is " + batPower);
	}
}
