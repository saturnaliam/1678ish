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

    // a significantly dumbed down version of the way they implemented it btw
    public class ButtonCheck {
        private int buttonNumber;
        boolean buttonCheck = false;
        boolean buttonActive = false;
        boolean hasBeenPressed = true;
        boolean activationReported = true;

        public ButtonCheck(int id) {
            buttonNumber = id;
        }
    
        public boolean wasActivated() {
            if (buttonActive && !activationReported) {
                activationReported = false;
                return true;
            }

            return false;
        }

        public boolean released() {
            if (hasBeenPressed) {
                hasBeenPressed = false;
                return true;
            }

            return false;
        }

        public boolean isBeingPressed() {
            return buttonActive;
        }

        public void update() {
            buttonCheck = getRawButton(buttonNumber);

            if (buttonCheck) {
                buttonActive = true;
                activationReported = false;
            } else {
                buttonActive = false;
                activationReported = true;
                hasBeenPressed = true;
            }
        }
    }

    public void update() {
        aButton.update();
        bButton.update();
        xButton.update();
        yButton.update();
    }
}
