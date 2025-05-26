// public class Animal {
//     public void run() {
//         System.out.println("Iam running");
//     }
//     public void eat() {
//         System.out.println("Iam Eating");        
//     }
//     public static void main(String[] args) {
//         Animal buzzo = new Animal();
//         buzzo.run();
//         buzzo.eat();
//     }
// }


// ===============================inheritence=========================

class Animal {    
    void eat() {
        System.out.println("Iam Eating");
    }
}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog j = new Dog();
           j.eat();
    }
}