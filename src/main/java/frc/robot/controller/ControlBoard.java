package frc.robot.controller;

import frc.robot.Ports;

public class ControlBoard {
    // boooo singleton :(
    private static ControlBoard instance = null;
    
    public final CustomController driver;
    public final CustomController operator;

    public static ControlBoard getInstance() {
        if (instance == null) {
            instance = new ControlBoard();
        }

        return instance;
    }
    
    private ControlBoard() {
        driver = new CustomController(Ports.DRIVER_PORT);
        operator = new CustomController(Ports.OPERATOR_PORT);
    }

    public void update() {
        driver.update();
        operator.update();
    }

    // driver controls
    public boolean goRed() {
        return driver.aButton.isBeingPressed();
    }

    public boolean goBlue() {
        return driver.bButton.isBeingPressed();
    }

    public boolean goGreen() {
        return driver.xButton.isBeingPressed();
    }

    public boolean goWhite() {
        return driver.yButton.isBeingPressed();
    }

    // operator controls
    public boolean goPink() {
        return operator.aButton.isBeingPressed();
    }

    public boolean goPurple() {
        return operator.bButton.isBeingPressed();
    }

    public boolean goOrange() {
        return operator.xButton.isBeingPressed();
    }

    public boolean goCyan() {
        return operator.yButton.isBeingPressed();
    }
}
