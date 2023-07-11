package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //Aim:Create a list and filter all even number

        List<Integer> list1 = List.of(2,4,8,3,6,7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(36);
        list2.add(99);
        list2.add(65);

        List<Integer> list3 = Arrays.asList(23, 765,89, 6, 45);

        //Without Stream : (Boiler plate code needs to be written)
        List<Integer> listEven = new ArrayList<>();

        for (Integer n : list1){
            if(n%2==0){
                listEven.add(n);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        //Using Stream : Printing even no. of list1
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(list1);
//        System.out.println(newList);

        //Using Stream : Printing even no. of list1
        List<Integer> newList = (List<Integer>) list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(newList);

        //Using Stream : Printing elements greater than 4
        List<Integer> newList1 = list1.stream().filter(i->i>4).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("Elements greater than 4 are:");
        System.out.println(newList1);





    }
}
