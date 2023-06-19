package billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/ebilling.png"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
        
        int x = 5;
        for (int i = 5; i < 600; i+=4, x++) {
            setSize(150+i, 350+x);
            setLocation(1000 - ((i + x)/2), 400 - (i/2));
            try {
                Thread.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
    }
    
    public void run() {
        try {
            Thread.sleep(2000);
            setVisible(false);
            
//             login frame
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}