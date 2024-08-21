//package university.management.system;
//import javax.swing.*;
//import java.awt.*;
//
//public class Splash extends JFrame implements Runnable{
//    Thread t;
//    Splash(){
//        
//        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
//        Image i2 =i1.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
//        ImageIcon i3=new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        add(image);
//        
//        t=new Thread (this);
//        t.start();
//         setVisible(true);
//        
//         int x=1;
//         for(int i=2;i<600;i+=4,x+=1){
//        setLocation(600-((i+x)/2),350-(i/2));
//        setSize(i+3*x,i+x/2);
//       
//        try{
//            Thread.sleep(10);
//            
//        }catch(Exception e){
//            
//        }}
//    }
//    //multithreading method  not normal method 
//   @Override
//    public void run(){
//        try{ Thread.sleep(7000);
//        setVisible(false);
//        //nextframe
//        
//        new Login();
//        
//        }
//        catch(Exception e){
//        }
//    }
//    
//    
//    public static void main(String[] args){
//    new Splash();
//    }
//}
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    private static final int INITIAL_WIDTH = 1540;
    private static final int INITIAL_HEIGHT = 750;
    private static final int LOCATION_X = 600;
    private static final int LOCATION_Y = 350;
    private static final int SLEEP_TIME = 7000;

    private Thread t;

    Splash() {
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/GoaUniversity.jpg"));
        Image image = icon.getImage().getScaledInstance(INITIAL_WIDTH, INITIAL_HEIGHT, Image.SCALE_DEFAULT);
        icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(icon);
        add(imageLabel);

        t = new Thread(this);
        t.start();
        setVisible(true);

        for (int i = 2; i < INITIAL_WIDTH; i += 4) {
            int x = 1;
            setLocation(LOCATION_X - ((i + x) / 2), LOCATION_Y - (i / 2));
            setSize(i + 3 * x, i + x / 2);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Handle or log the exception
            }
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(SLEEP_TIME);
            setVisible(false);
            dispose(); // Release system resources
            new Login(); // Next frame
        } catch (InterruptedException e) {
            // Handle or log the exception
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
