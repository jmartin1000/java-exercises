package school;

import java.util.HashMap;

class AbstractEntity {
    private static int iD = 0;
    private static HashMap<String, String> studentIDs = new HashMap<>();

    String assignStudentID (String name) {
        int intId = iD++;
        String strId = String.valueOf(intId);
        String newID = name.substring(0,2) + strId;
        studentIDs.put(newID, name);
        return newID;
    }

    private HashMap<String, String> getStudentIDs() {
        return studentIDs;
    }

}
