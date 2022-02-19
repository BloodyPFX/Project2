//Programmers: Lukas
//purpose: main player screen

import javax.swing.*;
import java.awt.*;

public class MainScreen {
    JFrame MS;
    JButton Storet; //button that opens the store
    JButton Action; //opens actions menu
    JButton Rest; //rest
    JButton Inv; //opens inventory
    JButton Comb; //fights
    JTextField Text; //input text
    JButton Ent; //enter button for text field
    JLabel Muns; //currency label
    JLabel HP; //health label
    JLabel SP; //stamina label
    Container con; //component that can contain other AWT components. it has many layers, with content pane being the one that holds the objects

    public static int munsey = 0;
    
    public void setMunsey(int x){
        munsey = x;
    }
    public static void add2Munsey(int x){
        munsey += x;
    }

    public int getMunser(){
        return munsey;
    }


    MainScreen(){
        MS = new JFrame(); 
        Icon Enter = new ImageIcon("enter.png");
        

        MS = new JFrame();
        MS.setSize(800,600);
        MS.setExtendedState(JFrame.MAXIMIZED_BOTH);
        MS.setLayout(null);
        MS.setVisible(true);
        MS.setResizable(false);
        MS.setExtendedState(Frame.NORMAL);
        //MS.getContentPane().setBackground(Color.black); //with this line, you are modifying an object with a method. according to the rule that concerns modifying objects
        //with methods, the object will always be to the left side of the period, while your method will always be found on the right. in this case, our object is getContenPane, 
        //which retrieves the content pane so that you may add objects to it. setBackground would be our method; although technically we are not adding an object, we are
        //modifying the color of the pane itself.
        con = MS.getContentPane();
        MS.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Storet = new JButton("Shop");
        Storet.setBounds(20, 500, 132, 50);
        MS.add(Storet);
        Storet.addActionListener((e) ->{
            Store.main(null);
        } );

        Action = new JButton("Actions");
        Action.setBounds(172, 500, 132, 50);
        MS.add(Action);
        Action.addActionListener((e) ->{
            /*MS.dispose();
            main(null);*/
        } );

        Rest = new JButton("Rest");
        Rest.setBounds(324, 500, 132, 50);
        MS.add(Rest);

        Inv = new JButton("Inventory");
        Inv.setBounds(476, 500, 132, 50);
        MS.add(Inv);
        Inv.addActionListener((e) -> {
            inventory.main(null);
        });

        Comb = new JButton("Fight");
        Comb.setBounds(628, 500, 132, 50);
        MS.add(Comb);

        Text = new JTextField();
        Text.setBounds(160, 430, 400,50);
        MS.add(Text);

        Ent = new JButton(Enter);
        Ent.setBounds(570, 430, 50, 50);
        MS.add(Ent);

        HP = new JLabel("Health");
        HP.setBounds(20, 340, 150, 30);
        //HP.setText(String.valueOf(characterVariables.));
        MS.add(HP);

        SP = new JLabel("Stamina");
        SP.setBounds(20, 380, 150, 30);
        MS.add(SP);
        MS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Muns = new JLabel();
        
        Muns.setBounds(20, 300, 150, 30);
        Muns.setText("$" + String.valueOf(munsey));
        MS.add(Muns);        

    }

    
    // main for testing purposes
    public static void main(String[] args) {
        new MainScreen();
        characterVariables.startupsetup(null);
        //playScreen.main(args);
        //playScreen seee = new playScreen();

    }
}