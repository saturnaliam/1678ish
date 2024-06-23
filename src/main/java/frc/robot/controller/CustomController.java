package frc.robot.controller;

import edu.wpi.first.wpilibj.XboxController;

public class CustomController extends XboxController {
    public ButtonCheck aButton,
                       bButton,
                       xButton,
                       yButton;

    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;

    public CustomController(int usb) {
        super(usb);
        aButton = new ButtonCheck(A_BUTTON);
        bButton = new ButtonCheck(B_BUTTON);
        xButton = new ButtonCheck(X_BUTTON);
        yButton = new ButtonCheck(Y_BUTTON);
    }

    public class ButtonCheck {
        private int buttonNumber;
        boolean buttonCheck = false;
    
        public ButtonCheck(int id) {
            buttonNumber = id;
        }
    
        public void update() {
            buttonCheck = getRawButton(buttonNumber);
        }
    }
}
