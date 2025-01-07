
import java.util.Scanner;

class calculator{
    public static void sum(int x,int y){
        System.out.println(x+y);
    }
    public static void subtract(int x,int y) {
      System.out.println(x-y);
    }
    /*public static void multiply(int x,int y) {
    System.out.println(x*y);
        
    }
    public static void division(int x,int y) {
    System.out.println(x/y);  
    }*/

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.print("enter first no:");
    int a=sc.nextInt();
    System.out.println("enter 2nd no: ");
    int b=sc.nextInt();
    sum(a,b);
    subtract(a,b);
    //multiply(a,b);
    //division(a,b);

        
    }
}