package Lessons.Lesson17;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model) {
        this.model = model;
        String validModel = model.toLowerCase();
        if (validModel.equals("carerra") || validModel.equals("911")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
