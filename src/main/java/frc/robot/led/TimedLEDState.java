package frc.robot.led;

import edu.wpi.first.wpilibj.Timer;

// rewrote this class to remove usage of the Color class, add built-in recognition of timeout

public class TimedLEDState {	
	public static final TimedLEDState OFF = new TimedLEDState("OFF", Double.POSITIVE_INFINITY, 0.99);
	public static final TimedLEDState RED = new TimedLEDState("RED", 1.0, 0.61);
	public static final TimedLEDState BLUE = new TimedLEDState("BLUE", 1.0, 0.87);
	public static final TimedLEDState GREEN = new TimedLEDState("GREEN", 1.0, 0.77);
	public static final TimedLEDState WHITE = new TimedLEDState("WHITE", 1.0, 0.93);
	public static final TimedLEDState PINK = new TimedLEDState("PINK", 1.0, 0.57);
	public static final TimedLEDState PURPLE = new TimedLEDState("PURPLE", 1.0, 0.91);
	public static final TimedLEDState ORANGE = new TimedLEDState("ORANGE", 1.0, 0.65);
	public static final TimedLEDState CYAN = new TimedLEDState("CYAN", 1.0, 0.81); // erm, it's actually aqua :nerd:
	

  public double blinkinValue;
  public double initTimestamp;
	public double interval; // time in seconds between states
	public String name; // name of state

	public TimedLEDState(String name, double interval, double blinkinValue) {
		this.blinkinValue = blinkinValue;
    this.interval = interval;
		this.name = name;
	}

  public void resetTimestamp() {
    this.initTimestamp = Timer.getFPGATimestamp();
  }
}
