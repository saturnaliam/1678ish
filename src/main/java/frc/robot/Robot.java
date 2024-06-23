// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controller.ControlBoard;
import frc.robot.led.TimedLEDState;
import frc.robot.LEDs;

public class Robot extends TimedRobot {
  private final ControlBoard controlBoard = ControlBoard.getInstance();
  private final LEDs ledController = new LEDs();

    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */
    @Override
    public void robotInit() {
        
    }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    controlBoard.update();
    ledController.updateState();

    if (controlBoard.goRed()) {
      ledController.runState(TimedLEDState.RED);
    } else if (controlBoard.goBlue()) {
      ledController.runState(TimedLEDState.BLUE);
    } else if (controlBoard.goGreen()) {
      ledController.runState(TimedLEDState.GREEN);
    } else if (controlBoard.goWhite()) {
      ledController.runState(TimedLEDState.WHITE);
    } else if (controlBoard.goPink()) {
      ledController.runState(TimedLEDState.PINK);
    } else if (controlBoard.goPurple()) {
      ledController.runState(TimedLEDState.PURPLE);
    } else if (controlBoard.goOrange()) {
      ledController.runState(TimedLEDState.ORANGE);
    } else if (controlBoard.goCyan()) {
      ledController.runState(TimedLEDState.CYAN);
    }
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {
  }

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {
  }

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {
  }

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {
  }

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {
  }
}
