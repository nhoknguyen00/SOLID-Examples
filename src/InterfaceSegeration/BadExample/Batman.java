package InterfaceSegeration.BadExample;

public class Batman implements SuperHero {

	@Override
	public void deleteVilians() {
		// TODO Auto-generated method stub
		System.out.println("I delete vilians by money;");
	}

	@Override
	public void fly() {
		try {
			throw new NullPointerException("because i'm not a alien!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I can't fly");
			throw e;
		}
	}

}
