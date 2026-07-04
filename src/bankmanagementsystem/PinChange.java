
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JButton change,back;
    JPasswordField pin,repin;
    String pinnumber;
    PinChange(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setForeground((Color.WHITE));
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
        JLabel pintext=new JLabel("NEW PIN");
        pintext.setForeground((Color.WHITE));
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
         pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);
        
        JLabel repintext=new JLabel("RE-ENTER NEW PIN");
        repintext.setForeground((Color.WHITE));
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
         repin=new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);
        
         change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
         back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == change)
        {
        try
        {
            String npin=pin.getText();
            String rpin=repin.getText();
            if(!npin.equals(rpin))
            {
                JOptionPane.showMessageDialog(null,"Entered Pin Doesn't Match");
                return;
            }
            
           if(npin.equals(""))
            {
             JOptionPane.showMessageDialog(null,"Please Enter Pin");
              return;
            }
            
           if (rpin.equals(""))
            {
              JOptionPane.showMessageDialog(null,"Please Enter Correct Pin");
              return;
            }
           
           Conn conn=new Conn();
           String q1="update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
           String q2="update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
           String q3="update signupthree set pinumber = '"+rpin+"' where pinumber = '"+pinnumber+"'";

           conn.s.executeUpdate(q1);
           conn.s.executeUpdate(q2);
           conn.s.executeUpdate(q3);
           
           JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
           
           setVisible(false);
           new Transaction(rpin).setVisible(true);
           
        }catch(Exception e)
        {
            System.out.println(e);
        }
        }
        else
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new PinChange("").setVisible(true);
    }
}
