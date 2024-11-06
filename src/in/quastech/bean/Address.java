package in.quastech.bean;

public class Address {
	
	private String loc;
	private int pin;
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [loc=" + loc + ", pin=" + pin + "]";
	}
	
	

}
