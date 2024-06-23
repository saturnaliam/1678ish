package frc.robot;

import frc.robot.led.TimedLEDState;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class LEDs {
  Spark rgbControl = new Spark(9);
  TimedLEDState currentState = TimedLEDState.OFF;

  public void runState(TimedLEDState state) {
    state.resetTimestamp();
    rgbControl.set(state.blinkinValue);
    this.currentState = state;
  }

  public void updateState() {
    if (this.currentState.initTimestamp + this.currentState.interval >= Timer.getFPGATimestamp()) {
      this.destroyState();
    }
  }

  public void destroyState() {
    this.currentState = TimedLEDState.OFF; 
    rgbControl.set(this.currentState.blinkinValue);
  }
}
