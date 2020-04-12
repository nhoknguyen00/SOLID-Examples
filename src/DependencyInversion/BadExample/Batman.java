package DependencyInversion.BadExample;

public class Batman {
	//If batman has a new gear, we have to implement a new class :(
	private int _power;
	private BatMobile _batMobile;
	private BatSuit _batSuit;
	
	public Batman() {
		set_power(0);
		this._batMobile = new BatMobile();
		this._batSuit = new BatSuit();
	}

	public int get_power() {
		this._power = this._batMobile.getPower() + this._batSuit.getPower();
		return _power;
	}

	public void set_power(int _power) {
		this._power = _power;
	}
}
