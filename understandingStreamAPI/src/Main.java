import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//       List<Integer> l = new ArrayList<>();
//       l.add(1);
//       l.add(2);
//       l.add(6);
//       l.add(8);
//       l.add(4);
        List<Integer> l = Arrays.asList(1, 2, 6, 8, 4);

//        for(int i=0; i<l.size() ;i++){
//            System.out.println(l.get(i));
//        }
//                OR
//        for(int n : l){
//            System.out.println(n);
//        }        OR

        l.forEach(n -> System.out.println(n));

//        int sum=0;
//        for(int n : l)
//        {
//            if(n%2==0)
//            {
//                n=n*2;
//                sum=sum+n;
//            }
//        }
//        System.out.println(sum);





    }
}