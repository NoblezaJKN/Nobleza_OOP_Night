package mainCLASS;

import EDITORSNOBLEZA.TextEditor;
import EDITORSNOBLEZA.PrintTextEditor;
import EDITORSNOBLEZA.AdvancedTextEditor;
import java.util.Scanner;

public class MAINNOBLEZA {
    public static void main (String[] args){
        String initialText;
        int editorType;
        
        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter initial text: ");
        initialText = scan.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        editorType = scan.nextInt();

        TextEditor editor = null;
        if (editorType == 1) {
            editor = new PrintTextEditor(initialText);
        } else if (editorType == 2) {
            editor = new AdvancedTextEditor(initialText);
        }
        
        System.out.print("Enter code: ");
        int code = new java.util.Scanner(System.in).nextInt();

        if (code == 1) {
  if (editor instanceof PrintTextEditor) {
  }   
    } else {
       if (editor instanceof AdvancedTextEditor) {
                ((AdvancedTextEditor) editor).undo();
            } else {
                System.out.println(((PrintTextEditor) editor).getText());  
                System.out.println("New Text");
            }
        }
        System.out.println("SUCCESS");
    }
 }

