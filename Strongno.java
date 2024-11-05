import java.util.Scanner;
public class Strongno{
    static void calculateStrongno(int num){
        int rem,sum=0,temp;
        temp=num;
        while(num>0)
        {
            rem=num%10;
            int f= factorial(rem);//factorial invoke
            sum+=f;
            num=num/10;

        }
        if(sum==temp)
        {
            System.out.println(temp+ " Strong number ");
        }
        else
        System.out.println(temp+ " Not a Strong number ");
    }
    static int factorial (int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        calculateStrongno(20);
    }
}