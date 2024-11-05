import java.util.Scanner;
public class Lab4a{
    public static void main(String args[]){     
        int[] arr=new int[100];
        for(int i=0; i< arr.length;i++){
            arr[i]=i+1;
        }
        try{
            for(int i=0;i<=arr.length;i++){
                System.out.print(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index Out of Bounds");
        }
    }
}
