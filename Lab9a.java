class Num extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Lab9a {
    public static void main(String[] args) {
        Num numberPrinter = new Num();
        
                numberPrinter.start();
    }
}