package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamObject {
    public static void main(String[] args) {
        //1)Blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });
        //2)creating stream array, object, collection
//        Stream names[] = {"Sanjana", "Ranjana","Ranu","Pyaarelal"};
//        Stream<String> stream1 = Stream.of(names));
//        stream1.forEach(e -> {
//            System.out.println(e);
//        });
        //3)builder pattern
        //5)List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(36);
        list2.add(99);
        list2.add(65);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });




    }
}
