class Num extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Lab9b {
    public static void main(String[] args) {
        Num numberPrinter = new Num();
        
        numberPrinter.start();
    }
}