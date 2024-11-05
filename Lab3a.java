import java.util.*;

class HillStations {
    void location() {
        System.out.println("Location is: ");
    }

    void famousfor() {
        System.out.println("Famous for: ");
    }

    class Manali extends HillStations {

        void location() {
            System.out.println("Manali is in Himachal Pradesh");
        }


        void famousfor() {
            System.out.println("It is Famous for Hadimba Temple and adventure sports.");
        }
    }

    class Mussorie extends HillStations {
       
        void location() {
            System.out.println("Mussorie is in Uttarakhand");
        }

        void famousfor() {
            System.out.println("It is Famous for education institutions.");
        }
    }

    class Gulmarg extends HillStations {
      
        void location() {
            System.out.println("Gulmarg is in J&K");
        }

     
        void famousfor() {
            System.out.println("It is Famous for skiing.");
        }
    }
}

public class Lab3a {
    public static void main(String[] args) {
        HillStations hillStations = new HillStations();

        HillStations.Manali m = hillStations.new Manali();
        HillStations.Mussorie mu = hillStations.new Mussorie();
        HillStations.Gulmarg g = hillStations.new Gulmarg();


        m.location();
        m.famousfor();

        mu.location();
        mu.famousfor();

        g.location();
        g.famousfor();
    }
}