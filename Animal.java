import java.util.Scanner;

// Superclass Animal
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Program started..."); // Debugging print to ensure code runs
        
        // Create instances of each class
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        // Call the makeSound() method for each object
        animal.makeSound();  // Calls Animal's makeSound()
        cat.makeSound();     // Calls Cat's overridden makeSound()
        dog.makeSound();     // Calls Dog's overridden makeSound()
        
        System.out.println("Program ended..."); // Debugging print to verify the end of execution
    }
}


