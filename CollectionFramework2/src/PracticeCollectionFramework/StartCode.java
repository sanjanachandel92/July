package PracticeCollectionFramework;
import java.util.*;

public class StartCode {
    public static void main(String[] args) {

        /*
        Creating collection:-
        Safe Type: same type of element can be added
        Unsafe Type : Different type of elements cann be added
         */

        //Type Safe Collection (Here Arraylist of string type)
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Sanjh");
        Names.add("Ram");
        // Names.add(100);       We cant add any integer as it is Type Safe coz "<>" we have mentioned type
        Names.add("Rahul");
        Names.add("Soha");
        Names.add("Rahul");     //Duplicates are allowed

        System.out.println(Names);
        System.out.println(Names.get(0));

        Names.remove("Rahul");
        System.out.println(Names);
        Names.remove(2);
        System.out.println(Names);
        System.out.println("Size : " +Names.size());
        System.out.println(Names.contains("Rita"));
        System.out.println(Names.isEmpty());
        Names.set(1,"Ram");                 //Replace
        System.out.println(Names);
        Names.add(1,"Laxmi");      //add
        System.out.println(Names);
       // Names.clear();

        //Unsafe Type Collection (Lets take an example of Linked list)
        LinkedList Windows = new LinkedList();
        Windows.add("Dell");                //string
        Windows.add(10);                    //Integer
        Windows.add(23456.9876);            //long
        Windows.add(true);                  //boolean
        System.out.println(Windows);

        //Vector type safe Example
        Vector<String> v = new Vector<>();
        v.addAll(Names);
        System.out.println(v);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        HashSet<Double> nms = new HashSet<>();
        nms.add(124.454);
        nms.add(14.44);
        nms.add(23.4567);
        nms.add(46.990);
        nms.add(46.990);   //Not added as it is duplicate
        nms.add(5.3);
        System.out.println(nms); //in Hash set order is not preserved, no index colllection like get() etc, duplicates not allowed

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);       //Here elements will be sorted


    }
}
