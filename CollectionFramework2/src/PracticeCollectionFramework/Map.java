package PracticeCollectionFramework;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String,Integer> courses = new HashMap<>();

        //adding elements
        courses.put("JAVA",4000);
        courses.put("Python",3000);
        courses.put("Spring",8000);
        courses.put("Android",9000);
        courses.put("Android",7000);        //Duplicates not allowed
        courses.put("php",5600);

        System.out.println(courses);        //ordeers not maintained

        courses.forEach((e1,e2)->{
            System.out.println(e1+" :  "+e2);
        });
    }
}
