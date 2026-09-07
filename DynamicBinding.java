class Animal {
    void sound() {
     System.out.printf("Animal sound - "); 
   }
}
class Dog extends Animal {
    Animal a = new Animal();
    void sound() { 
        a.sound();
        System.out.println("Bark"); 
  }
}
class Cat extends Animal{
    void sound(){
        Animal cat = new Animal();
        cat.sound();
        System.out.println("Meow........");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Animal a = new Dog(); // Dynamic Binding
        a.sound(); // Output: Bark (Determined at runtime)
        Cat a2 = new Cat();
        a2.sound();
    }
}
