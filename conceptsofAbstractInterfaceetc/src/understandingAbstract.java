//You cannot create the object of abstract class
 //It is not necesary to have abstract methods in abstract class
//but abstract method shud be in abstract class
//it is compulsary to define all methods in a class which is extends abstract class
// you can create obj of concrete class not of object class
abstract class  Car
{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("in music");
    }
}
class WagonR extends Car        //Concrete class
{
    public void drive() {
        System.out.println("Driving");
    }
    public void fly(){
        System.out.println("Flying");
    };
}
public class understandingAbstract {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }

}
