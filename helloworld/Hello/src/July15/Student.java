package July15;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Student extends Academic{


    private List<Registration> regList;

    public Student(int id) {
        this.regList = new ArrayList<>();

    }

    public int calcAverage(){
        int sum = 0;
        for (Registration reg: regList
        ) {
            sum += reg.getGrade();
        }
        return (sum/regList.size());
    }

    public void addToList(Registration reg){
        regList.add(reg);
    }

    public void removeFromList(Registration reg){
        int index = regList.indexOf(reg);
        regList.remove(index);
    }






}