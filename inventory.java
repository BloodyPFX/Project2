import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class inventory {
    public static void backpack(){
        JFrame screen = new JFrame();

        printFoodInv();


        JLabel crispy = new JLabel();
        crispy.setText(characterVariables.foodInv.toString());

        JPanel crisp = new JPanel();
        

        crisp.add(crispy);
        screen.add(crisp);

        screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screen.setVisible(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[]args){
        backpack();
        
    }
}
