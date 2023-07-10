//Interface just show the design by declaring the methods and not defining it
//For defining we shud implement the intercae and define the method
//Interface doesnt have any memory in heap
//If we implement interface in any class it only implements methods but not variables as variables are final and static in interface and we must delare thr itself

interface A{
    int age=24;         //by default variables in interface are final and static
    String area="Raipur";
    void show();        //by default methods in interface are "public abstract". we can write and we cannot both are fine
    void config();

}
class B implements A{
    public void show() {
        System.out.println("in show");
    }

        public void config() {
        System.out.println("in config");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

    }
}