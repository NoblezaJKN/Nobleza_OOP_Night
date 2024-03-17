package editorPackage;

public class AdvancedTextEditor extends TextEditor {
    
    private String lastOperation;

    public AdvancedTextEditor(String text) {
        super(text);
        lastOperation = null;
    }

    @Override
    public void append(String newText) {
        lastOperation = "append(" + newText + ")";
        super.append(newText);
    }

    @Override
    public void delete(int n) {
        if (n <= text.length()) {
            lastOperation = "delete(" + n + ")";
            super.delete(n);
        }
    }

    public void undo() {
        if (lastOperation == null) {
            System.out.println("No operation to undo.");
            return;
        }

        if (lastOperation.startsWith("append")) {
            String textToRemove = lastOperation.substring(lastOperation.indexOf("(") + 1, lastOperation.indexOf(")"));
            text = text.substring(0, text.length() - textToRemove.length());
        } else if (lastOperation.startsWith("delete")) {
            int charsToDelete = Integer.parseInt(lastOperation.substring(lastOperation.indexOf("(") + 1, lastOperation.indexOf(")")));
            text += getText().substring(text.length() - charsToDelete);
        }

        lastOperation = null;
    }
   
}

