import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Sanjana");
        Name.add("Saarya");
        Name.add("Rihaana");

        System.out.println(Name);
        Name.add(0, "Priyansh");
        System.out.println(Name);
        Name.add(4, "Shivansh");
        System.out.println(Name);

        Name.remove(4);             //removing data at particular index
        System.out.println(Name);
        Name.set(0,"Ankit");            //Replace any data
        System.out.println(Name);

        System.out.println(Name.get(2));       //fetch any particular data

        Name.clear();                     //deleting complete array data
        System.out.println(Name);

        LinkedList<String> Country = new LinkedList<String>();      //LinkedList
        Country.add("USA");
        Country.add("India");
        Country.add("Canada");
        System.out.println(Country);
        Country.addLast("China");
        System.out.println(Country);
        Country.addFirst("Dubai");
        System.out.println(Country);
        Country.add(3,"Srilanka");
        System.out.println(Country);

        Country.remove();               //By default it removes the first elements
        System.out.println(Country);
        Country.removeFirst();
        System.out.println(Country);
        Country.removeLast();
        System.out.println(Country);
        Country.remove(1);
        System.out.println(Country);

        for(String str:Country)                          //Printing using for loop
        {
            System.out.println(str);
        }

        Stack<String> Relation = new Stack<String>();   //Creating stack object LIFO
        Relation.push("Mother");                    //Adding elements in stack
        Relation.push("Father");
        Relation.push("Daughter");
        System.out.println(Relation);

        Relation.pop();
        System.out.println(Relation);

        ArrayDeque<String> Fabric = new ArrayDeque<>(); {       //Creating Deque object "FIFO"
        Fabric.push("Cotton");                               //Adding elements in Dequeue
        Fabric.push("Linen");
        Fabric.push("Woolen");
        System.out.println(Fabric);

        Fabric.pop();
        System.out.println(Fabric);

        }

    }
}