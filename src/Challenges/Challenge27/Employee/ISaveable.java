package Challenges.Challenge27.Employee;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> SavedValues);
}
