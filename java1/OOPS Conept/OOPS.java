
class Pen {
    String Name;
    String Color;
    String Brand;

    public void printName() {
        System.out.println("Pen Color: " + this.Name);
    }
    
    public void printColor() {
        System.out.println("Pen Color: " + this.Color);
    }

    public void printBrand() {
        System.out.println("Pen Brand: " + this.Brand);
    }
}

public class OOPS {

    public static Pen createObject(String name, String color, String brand) {
        Pen p = new Pen();
        p.Name = name;
        p.Color = color;
        p.Brand = brand;
        return p;
    }
    public static void main(String args[]) {
        Pen p1 = createObject("abc", "Blue", "Parker");
        Pen p2 = createObject("Red Pen", "Red", "Pilot");

        p1.printName();
        p2.printName();
    }
}
