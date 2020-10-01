package July15;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String name;
    private String description;
    private Instructor insructor;
    private List<Registration> regList = new ArrayList<>();

    public Course(int id, String name, String description, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.insructor = instructor;
    }

    public void register(Registration reg, Student student){
        regList.add(reg);
        student.addToList(reg);

    }

    public void deRegister(Registration reg, Student student){
        int index = regList.indexOf(reg);
        regList.remove(index);
        student.removeFromList(reg);
    }

    public int getId() {
        return id;
    }
}