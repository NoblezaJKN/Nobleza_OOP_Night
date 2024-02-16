package IvanaAlawi;

import java.util.Scanner;

public class LabAct2Nobleza  {
    
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the message: ");
        String forIvana = scan.nextLine();
        
        int misFinal = 0;
        
        for (int i = 1; i < forIvana.length(); i++){
            char pchar = forIvana.charAt (i - 1);
            char cchar = forIvana.charAt(i);
            
            if ((!Character.isUpperCase(cchar) || !Character.isLetter(cchar)) || Character.isWhitespace(pchar))
            { 
            } else {
                misFinal = misFinal + 1;
                break; 
            } 
        }
        if (misFinal == 1){
            System.out.println("JEJE!");
        } else { System.out.println("uWu");
        }
    }
}
        