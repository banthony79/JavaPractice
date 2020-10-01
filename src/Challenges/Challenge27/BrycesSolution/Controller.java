package Challenges.Challenge27.BrycesSolution;

public class Controller {

    private Button upButton = new Button("Up button");
    private Button downButton = new Button("Down button");
    private Button rightButton = new Button("Right button");
    private Button leftButton = new Button("Left button");

    public Button UpButton() {
        return upButton;
    }

    public Button DownButton() {
        return downButton;
    }

    public Button RightButton() {
        return rightButton;
    }

    public Button LeftButton() {
        return leftButton;
    }

    public boolean pressButton(Button button) {
        button.isPressed();
        System.out.println(button.getLabel() + " is pressed.");
        return true;
    }
}
