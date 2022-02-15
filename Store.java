import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Store extends MainScreen{
  //  JFrame ST;
    static JFrame ST;


    public static void main(String[]args){
        ST = new JFrame();
        ST.setSize(800,600);
        ST.setLayout(null);
        ST.setVisible(true);
        ST.setResizable(false);
        ST.setExtendedState(Frame.MAXIMIZED_BOTH);
        ///////////food//////////////////food///////////////////////food/////////////////////food/////////////////////food/////////////food//////////////////
        
        JPanel coll = new JPanel();
        coll.setVisible(false);

        JLabel lilmon = new JLabel();
        
        JButton fromstore = new JButton();
        fromstore.setText("Back");
        fromstore.setBounds(900,900,100,100);
        fromstore.addActionListener((e) -> {
            ST.dispose();
            MainScreen.main(null);
        });
        
        
        JButton BuyPiclke = new JButton();
        BuyPiclke.setBounds(20, 20, ST.getWidth()/7, 80);
        BuyPiclke.setText("pickle $4");
        BuyPiclke.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 4){
                    add2Munsey(-4);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
            
                
            }
        });

        
        JButton Buymuffin = new JButton();
        Buymuffin.setBounds((BuyPiclke.getX()+ST.getWidth()/7+50),20,ST.getWidth()/7,80);
        Buymuffin.setText("muffin $10");
        Buymuffin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {


                if(munsey >= 10){
                    add2Munsey(-10);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }

                
            }
        });

        JButton Buycookie = new JButton();
        Buycookie.setBounds(Buymuffin.getX()+ST.getWidth()/7+50,20,ST.getWidth()/7,80);
        Buycookie.setText("cookie $10");
        Buycookie.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 10){
                    add2Munsey(-10);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buybread = new JButton();
        Buybread.setBounds(Buycookie.getX()+ST.getWidth()/7+50,20,ST.getWidth()/7,80);
        Buybread.setText("bread $5");
        Buybread.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                if(munsey >= 5){
                    add2Munsey(-5);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
               
                
            }
        });

        JButton Buycookedchicken = new JButton();
        Buycookedchicken.setBounds(Buybread.getX()+ST.getWidth()/7+50,20,ST.getWidth()/7,80);
        Buycookedchicken.setText("cookedchicken $20");
        Buycookedchicken.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 20){
                    add2Munsey(-20);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });
        ///////////Weapons//////////////////////Weapons////////////////////////////Weapons///////////////////////////Weapons///////////////////////////Weapons/////////////////////////////////////////////////

        JButton Buylongsword = new JButton();
        Buylongsword.setBounds(BuyPiclke.getX(),130,ST.getWidth()/7,80);
        Buylongsword.setText("longsword $20");
        Buylongsword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 20){
                    add2Munsey(-20);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buydagger = new JButton();
        Buydagger.setBounds(Buylongsword.getX()+ST.getWidth()/7+50,130,ST.getWidth()/7,80);
        Buydagger.setText("dagger $15");
        Buydagger.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 15){
                    add2Munsey(-15);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buypocketknife = new JButton();
        Buypocketknife.setBounds(Buydagger.getX()+ST.getWidth()/7+50,130,ST.getWidth()/7,80);
        Buypocketknife.setText("pocketknife $10");
        Buypocketknife.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 10){
                    add2Munsey(-10);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });
        ////////armor/////////////////armor///////////armor//////////////////////armor//////////////////////////armor///////////////////////////////////armor//////////////////

        JButton Buyiron = new JButton();
        Buyiron.setBounds(BuyPiclke.getX(),260,ST.getWidth()/7,80);
        Buyiron.setText("iron armor $20");
        Buyiron.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 20){
                    add2Munsey(-20);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buygold = new JButton();
        Buygold.setBounds(Buyiron.getX()+ST.getWidth()/7+50,260,ST.getWidth()/7,80);
        Buygold.setText("gold armor $30");
        Buygold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 30){
                    add2Munsey(-30);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buyleather = new JButton();
        Buyleather.setBounds(Buygold.getX()+ST.getWidth()/7+50,260,ST.getWidth()/7,80);
        Buyleather.setText("leather armor $5");
        Buyleather.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 5){
                    add2Munsey(-5);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });
////////////Potions////////////////////////////////Potions///////////////////////////////////////////Potions////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton Buyhealth = new JButton();
        Buyhealth.setBounds(BuyPiclke.getX(),390,ST.getWidth()/7,80);
        Buyhealth.setText("health potion $25");
        Buyhealth.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 25){
                    add2Munsey(-25);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buystamina = new JButton();
        Buystamina.setBounds(Buyhealth.getX()+ST.getWidth()/7+50,390,ST.getWidth()/7,80);
        Buystamina.setText("stamina potion $25");
        Buystamina.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(munsey >= 25){
                    add2Munsey(-25);
                  ST.dispose();
                  MainScreen.main(null);  
                  } else{
                      coll.setVisible(true);
                  }
                
                
            }
        });

        JButton Buydamage = new JButton();
        Buydamage.setBounds(Buystamina.getX()+ST.getWidth()/7+50,390,ST.getWidth()/7,80);
        Buydamage.setText("damage potion $30");
        Buydamage.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(munsey >= 30){
                  add2Munsey(-30);
                ST.dispose();
                MainScreen.main(null);  
                } else{
                    coll.setVisible(true);
                }
                
            }
        });
            //////////////////end of dem buttons//////////////////////////////////////////////////////////////////////////////////////////
        
        
            
       
        lilmon.setText("Not enough munsey");
        
        JButton back = new JButton();
        back.setText("Back");

        back.addActionListener((e) -> {
            coll.setVisible(false);
            /*ST.dispose();
            Store.main(null);*/
        });
        //back .setBounds(x, y, width, height);

        
        coll.setBackground(Color.red);
        coll.setBounds(ST.getWidth()/2,ST.getHeight()/3,300,200);
        coll.add(lilmon);
        coll.add(back);

        ST.add(BuyPiclke);
        ST.add(Buybread);
        ST.add(Buycookedchicken);
        ST.add(Buycookie);
        ST.add(Buydagger);
        ST.add(Buydamage);
        ST.add(Buygold);
        ST.add(Buyhealth);
        ST.add(Buyiron);
        ST.add(Buyleather);
        ST.add(Buylongsword);
        ST.add(Buymuffin);
        ST.add(Buypocketknife);
        ST.add(Buystamina);
        ST.add(coll);
        ST.add(fromstore);
    }

}