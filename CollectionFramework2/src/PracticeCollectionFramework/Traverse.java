package PracticeCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Traverse {
    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<>();
        Names.add("Sanjh");
        Names.add("Rahul");
        Names.add("Soha");
        Names.add("Rahul");
        Names.add("Ram ");

        //Traversing using for each loop
        for(String str:Names){
            System.out.print(str +"\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

        //Travesrsing using iterartor:FORWARD TRAVERSING
        Iterator<String> itr = Names.iterator();     //((((( type:"Names.iterator()" alt+Enter>add )))))

        while (itr.hasNext())
        {
            String nextname = itr.next();
            System.out.println(nextname);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        //BAckward traversal of Collection  LISTITERATOR
        ListIterator<String> litr = Names.listIterator(Names.size()); // Names.size() coz cursor shud be at the end

        while(litr.hasPrevious())
        {
            String prevName = litr.previous();
            System.out.println(prevName);

        }

        //Enumeration
        System.out.println("~~~~~~~~~~~~~~~~For each(Lambda)~~~~~~~~~~~~~~~~~~~~~~~~~");
        // for each method
        Names.forEach(str->{
            System.out.println(str);
        });

        System.out.println("~~~~~~~~~~~~~~~~For each(Lambda) in treeset SORTING OF ELEMENTS, DUPLICATES WILL ALSO REMOVES as it is set~~~~~~~~~~~~~~~~~~~~~~~~~");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(Names);
        set.forEach(e->{
            System.out.println(e);
        });

        //Comparable <For custom sorting logic>
        //comparator <For custom sorting logic>

    }
}
