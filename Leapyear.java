import java.util.Scanner;
public class Leapyear{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    if(year%4==0)
    {
        if(year%100==0)
        {
            if(year%400==0) 
                1=true;
            else
                1=false;
        }
        else
            1=true;
    }
    else
    1=false;
    if(1==true)
    System.out.println(" is a Leap year");
    else
    System.out.println(" is  not a Leap year");
}
}