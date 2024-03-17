package mainPackage;

import editorPackage.TextEditor;
import editorPackage.PrintTextEditor;
import editorPackage.AdvancedTextEditor;
import java.util.Scanner;

public class noblezaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();
        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();
        TextEditor editor;

        if (editorType == 2) {
            editor = new AdvancedTextEditor(initialText);
        } else {
            editor = new PrintTextEditor(initialText);
        }

        Tester.test(editor);
    }
}
        
        

    