package whileIf;
import java.util.Scanner;

/**
 *
 * @author mateus.perpetuo
 */
public class whileIf {

    public static void main(String args[]) {
        
        
        // declaring variables
        
        Scanner scan = new Scanner(System.in);
        char keepGoing = 'Y';
        
        // Checking condition
        while (keepGoing == 'Y'  || keepGoing =='y'){
            
            System.out.println("Enter a Number: ");
            int number = scan.nextInt();
            
            
         //Determining what will happen
            
            if (number == 0){
                
                System.out.println("This number is Zero!"); 
                
            } else {
                
                if (number >0){
                    
                    System.out.println("This number is Positive!");
                    
                } else {
                    
                    System.out.println("This number is Negative!");
                    
                }
            }
            
            // Asking how to proceed
            System.out.println("DO you with to continue?");
            System.out.println("Y - Yes / N - NO");
            keepGoing = scan.next().charAt(0);
        }
        
        System.out.println("This run has ended!");
                
    }

  
}
