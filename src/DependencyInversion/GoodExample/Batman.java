package DependencyInversion.GoodExample;

public class Batman {
	//now batman can have many gears and we dont have to create a new class in this class
	private int _power;
	private BatGear _batGears[] = {new BatMobile(), new BatSuit()};
	
	public Batman() {
		set_power(0);
	}

	public int get_power() {
		for (BatGear batGear : this._batGears) {
			this._power += batGear.getPower();
		}
		return _power;
	}

	public void set_power(int _power) {
		this._power = _power;
	}
}
