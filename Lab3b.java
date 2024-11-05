class Animall{
    public void makeSound(){
        System.out.println("The animal makes a sound...");  
    }
    class Catt extends Animall{
        public void makeSound(){
            System.out.println("The Cat Meows...");  
        }
    }
    class Dogg extends Animall{
        public void makeSound(){
            System.out.println("The Dog Barks...");  
        }
    }
}
public class Lab3b{
    public static void main(String[] args){
        Animall animal=new Animall();
        Animall.Catt cat = animal.new Catt();
        Animall.Dogg dog = animal.new Dogg();

        // Catt cat=new Catt();
        // Dogg dog=new Dogg();
        cat.makeSound();
        dog.makeSound();
    }
}