// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controller.ControlBoard;

public class Robot extends TimedRobot {
    private final ControlBoard controlBoard = ControlBoard.getInstance();

    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */
    @Override
    public void robotInit() {
        
    }

    @Override
    public void robotPeriodic() {}

    @Override
    public void autonomousInit() {}

    /** This function is called periodically during autonomous. */
    @Override
    public void autonomousPeriodic() {}

    /** This function is called once when teleop is enabled. */
    @Override
    public void teleopInit() {}

    /** This function is called periodically during operator control. */
    @Override
    public void teleopPeriodic() {
        controlBoard.update();
        
        if (controlBoard.goRed()) {

        } else if (controlBoard.goBlue()) {

        } else if (controlBoard.goGreen()) {

        } else if (controlBoard.goWhite()) {

        } else if (controlBoard.goPink()) {

        } else if (controlBoard.goPurple()) {

        } else if (controlBoard.goOrange()) {

        } else if (controlBoard.goCyan()) {
            
        }
    }

    /** This function is called once when the robot is disabled. */
    @Override
    public void disabledInit() {}

    /** This function is called periodically when disabled. */
    @Override
    public void disabledPeriodic() {}

    /** This function is called once when test mode is enabled. */
    @Override
    public void testInit() {}

    /** This function is called periodically during test mode. */
    @Override
    public void testPeriodic() {}

    /** This function is called once when the robot is first started up. */
    @Override
    public void simulationInit() {}

    /** This function is called periodically whilst in simulation. */
    @Override
    public void simulationPeriodic() {}
}
