
@FunctionalInterface
interface A {
    void show();
}
/*
class B implements A{
    @Override
    public void show() {
        System.out.println("Hi");
    }*/

public class Main {
    public static void main(String[] args) {
       /*A obj = new B();            //we cannot create obj of any interface but here we implemented A in class B n creating obj of b
        obj.show();                 //now its working fine but why to have one extra class "B" which might use just one in a program
                                    //So LAmbda Expression ca,me into picture

        */

        //LAmbda Expression
        A obj = () -> System.out.println("Hi in show");
        obj.show();

    }
}