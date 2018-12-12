package exercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StudentsByID {
    public static void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Begin input (ENTER '0' to finish):");

        // get student ID and name
        do{
            System.out.println("ID:");
            newStudentId = in.nextInt();

            if (newStudentId > 0){
                System.out.println("Student Name:");
                String newStudentName = in.next();
                students.put(newStudentId, newStudentName);
            }

        } while(newStudentId > 0);

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }


    }
}
