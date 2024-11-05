import java.util.Scanner;
public class Lab1c{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int number=sc.nextInt();

        System.out.print("Enter the bit position");
        int n = sc.nextInt();
        boolean isCheck = (number &(1<<n))!=0;
        if(isCheck){
            System.out.println("the bit is set 1");
        }
        else{
            System.out.println("the bit is set 0");
        }
    }
}
 
