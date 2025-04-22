package oops;

// class Student{
//     String name;
//     int rollNo;

//     public Student(){

//     }
// }

class Bike{
    String engineType;
    String color;
    int horsePower;

    Bike(String engineType,
    String color,
    int horsePower){
        this.engineType = engineType;
        this.color = color;
        this.horsePower = horsePower;
        System.out.println("this enginetype :" + engineType + ", horse power: " + horsePower + ",color:" + color);
    }
    public void honk(){
        System.out.println("powwwwwwww");
    }
    public void color(String color){
        this.color = color;
        System.out.println("new color is:" + color);
    }
    public void doubleHorsePower(int horsePower){
        int x = horsePower*2;
        System.out.println("power doubled to" + x);
    }
}
public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike("xyz", "red", 123);
        b1.color("blue");
        b1.doubleHorsePower(123);
    }
}
