package LiskovSubstitution.BadExample;

public class Superman extends SuperHero {
	//Superman can be super hero but he can't be rich because his parents are not :(
	@Override
	public void beRich() {
		try {
			throw new NullPointerException("because my parents are not rich!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I'm not rich");
			throw e;
		}
	}
}
