package editorPackage;

public class TextEditor {
    
    String text;

    public TextEditor(String text) {
        this.text = text; 
    }

    public TextEditor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String newText) {
        text += newText;
    }

    public void delete(int n) {
        if (n <= text.length()) {
            text = text.substring(0, text.length() - n);
        }
    }

    int length() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
