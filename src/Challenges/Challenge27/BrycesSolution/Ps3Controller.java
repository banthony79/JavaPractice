package Challenges.Challenge27.BrycesSolution;

public class Ps3Controller extends Controller {

    private Button triangleButton = new Button("Triangle");
    private Button circleButton = new Button("Circle");
    private Button squareButton = new Button("Square Button");
    private Button xButton = new Button("X Button");
    private Button rightTrigger = new Button("R1");
    private Button leftTrigger = new Button("L1");
    private Button R3 = new Button("R3");
    private Button L3 = new Button("L3");
    private Joystick rightJoystick = new Joystick("Right Joystick");
    private Joystick leftJoystick = new Joystick("Left Joystick");


    public Button triangleButton() {
        return triangleButton;
    }

    public Button circleButton() {
        return circleButton;
    }

    public Button squareButton() {
        return squareButton;
    }

    public Button xButton() {
        return xButton;
    }

    public Button rightTrigger() {
        return rightTrigger;
    }

    public Button leftTrigger() {
        return leftTrigger;
    }

    public Button R3() {
        return R3;
    }

    public Button L3() {
        return L3;
    }

    public Joystick rightJoystick() {
        return rightJoystick;
    }

    public Joystick leftJoystick() {
        return leftJoystick;
    }
}
