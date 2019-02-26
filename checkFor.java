/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;

/**
 *
 * @author UDWONDER
 */
public class checkFor {
    
    public void restart(){
        this.start();
    }
        public void start(){
            System.out.println("Enter Word, phrase, sentence or a number to check if its a palindrome:\n");
            
            Scanner read = new Scanner(System.in);
            String str = read.nextLine();
            String reverse = "";
            
            System.out.println("The length of this word is \n" + str.length());
            for (int i = str.length() - 1;
                    i >= 0;
                    i--){
                reverse = reverse + str.charAt(i);
                
            }
            if (reverse.equals(str))
                System.out.println(str + " is a palindrome\n");
            else
                System.out.println(str + " is not a palindrome\n");
            this.restart();
        }
   

}
       
    
    

