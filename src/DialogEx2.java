import  javax.swing.JOptionPane;
public class DialogEx2 {
    public static void main(String[] args) {

       String name =  JOptionPane.showInputDialog("What is your name");
       String message = String.format("Welcome, %s, to java programming ",name);

       JOptionPane.showMessageDialog(null,message);
    }
}
