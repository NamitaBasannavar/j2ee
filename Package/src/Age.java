import java.util.*;
public class Age {

       public static void main(String[] args) {
       
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter your age :");
              int age = sc.nextInt();
              
               try
              {
                     if(age < 18)
                           throw new AgeException("Not valid");
                     else
                           System.out.println("Welcome to vote");
              }
              catch(AgeException a)
              {
                     System.out.println(a);
              }
       }
}




