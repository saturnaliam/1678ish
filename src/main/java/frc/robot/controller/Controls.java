package frc.robot.controller;

import frc.robot.Ports;

public class Controls {
    // boooo singleton :(
    private static Controls instance = null;
    
    public final CustomController driver;

    public static Controls getInstance() {
        if (instance == null) {
            instance = new Controls();
        }

        return instance;
    }
    
    private Controls() {
        driver = new CustomController(Ports.DRIVER_PORT);
    }
}
