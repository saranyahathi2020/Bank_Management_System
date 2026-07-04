
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno)
    {
        this.formno=formno;
        JPanel panel = new JPanel();
        panel.setLayout(null);

        
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        panel.add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        panel.add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        panel.add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,150,20);
        panel.add(r2);
        
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        panel.add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        panel.add(r4);
        
        ButtonGroup grpacc=new ButtonGroup();
        grpacc.add(r1);
        grpacc.add(r2);
        grpacc.add(r3);
        grpacc.add(r4);
              
        JLabel cardno=new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway",Font.BOLD,22));
        cardno.setBounds(100,300,200,30);
        panel.add(cardno);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,200,30);
        panel.add(number);
        
        JLabel carddetails=new JLabel("Your 16 digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,200,20);
        panel.add(carddetails);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        panel.add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        panel.add(pnumber);
        
        JLabel pindetails=new JLabel("Your 4 digit pin Number");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,200,20);
        panel.add(pindetails);
        
        JLabel services=new JLabel("Services Required :");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        panel.add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        panel.add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        panel.add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        panel.add(c3);
        
        c4=new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        panel.add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        panel.add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        panel.add(c6);
        
        c7=new JCheckBox("I here by declare that the above entered details are correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        panel.add(c7);
        
        submit =new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        panel.add(submit);
        
        cancel =new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        panel.add(cancel);
        
        JScrollPane scrollPane = new JScrollPane(panel);
        panel.setPreferredSize(new Dimension(800, 1200));

        add(scrollPane);
        
        setSize(850,800);
        setLocation(100,10);
        setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==submit)
        {
            String accType=null;
            if(r1.isSelected())
            {
                accType="Saving Account";
            }
            else if(r2.isSelected())
            {
                accType="Fixed DEposit Account";
            }
            else if(r3.isSelected())
            {
                accType="Current Account";
            }
            else if(r4.isSelected())
            {
                accType="Recurring Deposit Account";
            }
      Random random= new Random();
      String cardnumber=""+Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
      String pinnumber=""+Math.abs((random.nextLong()%9000L) + 1000L);
      
      String facility="";
      if(c1.isSelected())
      {
          facility=facility+"ATM Card";
      }
      else if(c2.isSelected())
      {
          facility=facility+"Internet Banking";
      }
      else if(c3.isSelected())
      {
          facility=facility+"Mobile Banking";
      }
      else if(c4.isSelected())
      {
          facility=facility+"EMAIL & SMS Alerts";
      }
      else if(c5.isSelected())
      {
          facility=facility+"Cheque book";
      }else if(c6.isSelected())
      {
          facility=facility+"E-Statement";
      }
      
      
      try
      {
          if(accType.equals(""))
          {
              JOptionPane.showMessageDialog(null,"Account type is required");
          }
          else
          {
              Conn conn=new Conn();
              String query1="insert into signupthree values('"+formno+"','"+accType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
              String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

              conn.s.executeUpdate(query1);
              conn.s.executeUpdate(query2);
              
              JOptionPane.showMessageDialog(null,"Card number:"+cardnumber +"\n Pin:" +pinnumber);
              setVisible(false);
              new Deposit(pinnumber).setVisible(true);
              
          }
      }catch(Exception e)
      {
          System.out.println(e);
      }
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String args[])
    {
        new SignupThree("");
    }
}
