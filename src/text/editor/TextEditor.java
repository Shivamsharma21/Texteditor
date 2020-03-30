
package text.editor;

/**
 *
 * @author shivam
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            TextEditorGUI texteditor = new TextEditorGUI();
            texteditor.setVisible(true);
            texteditor.setBounds(40,100,400,400);
            texteditor.setTitle("Xpad");
    }
    
}
