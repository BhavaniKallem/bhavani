import java .util.Scanner;
import java.util.*;


class First
{
    int add(int x,int y)
    {
        return (x+y);
    }
    int add(int x,int y,int z)
    {
        return (x+y+z);
    }
    double add(double x,double y)
    {
        return (x+y);
    }
    int multiply(int x,int y)
    {
        return (x*y);
    }

}
interface Second 
{
public void division();
public void subtract();
}
class Third extends First implements Second
{
    int multiply(int x,int y){
        return (x*y*2);
            }
        public void subtract(){
            System.out.println("Method for subtraction");
        }
        public void division(){
            System.out.println("Method for division");
        }
}

public class Task1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        First f1=new First();
        int x=f1.add(2,3);
        System.out.println("the result of add(x,y) method in First class is  "+x);
        int y=f1.add(2,3,4);
        System.out.println("the result of add(x,y,z) method in First class is  "+y);
        double z=f1.add(2.34,4.56);
        System.out.println("the result of add double method in First class is  "+z);
        int p=f1.multiply(2,3);
        System.out.println("the result of multiply method in First class is  "+p);
       Third t1=new Third();
        int q=t1.multiply(2,3);
        System.out.println("this is overrding the multiply method in class First  "+q);
        t1.subtract();
        t1.division();
        
    }
}
