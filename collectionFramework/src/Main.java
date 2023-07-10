import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> body = new ArrayList<>();
        body.add("Head");
        body.add("Shoulder");
        body.add("Knees");
        body.add("Toe");
        body.add("Belly");
        traverse(body);
        System.out.println("_________________________________________________");

        LinkedList<String> color = new LinkedList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Orange");
        color.add("Black");
        color.add("White");

        display(color);

        HashMap<String, Integer> emp = new HashMap<>();
        emp.put("Sanjh", 300000);
        emp.put("Raj ",403000 );
        emp.put("Priya ",250000 );
        emp.put(" Kiran ", 860000);

        mapTraverse(emp);

    }
    public static void display(LinkedList<String> color){

        for (String s : color)
        {
            System.out.print(s+"  ");
        }
    }
    public static void traverse(ArrayList<String> body){
        for(String s : body)
        {
            System.out.print(s+"  ");
        }
        System.out.println(" ");
    }
    public static void mapTraverse(HashMap<String, Integer> emp){
        for (Map.Entry<String,Integer> val : emp.entrySet()){
            System.out.println(val.getKey()+ " has "+val.getValue()+" salary.");
        }
    }

}