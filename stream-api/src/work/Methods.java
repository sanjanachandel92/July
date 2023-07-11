package work;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Methods {
    public static void main(String[] args) {

        //display only the names starting with R
        List<String> names = List.of("Rahul", "Shaan", "Shona","Rani", "Pihu");
        List<String> newNames = names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(newNames);

        //Gives the square of each element in new list
        List<Integer> num = List.of(2,3, 4,5,6,7,8,9,10);
        List<Integer> newNum = num.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(num);
        System.out.println(newNum);

        //traverse with for each
        names.stream().forEach(n ->{
            System.out.println(n);

        });

        //Shortcut of traveserse/print using double colon ::
        newNames.stream().forEach(System.out::println);

        //Sorted
        num.stream().sorted().forEach(System.out::println);

       //Comparator
        Integer res = num.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum value of num is "+res);

        Integer res1 = num.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Maximum value of num is " +res1);

    }
}
