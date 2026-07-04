
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton yes,no,eyes,eno;
    JComboBox incomc,edc,occ,religionc,categoryc;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
       
       
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion: ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBackground(Color.WHITE);
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valRel[]={"Hindu","Muslim","Sikh","Christian","other"};
       religionc=new JComboBox(valRel);
       religionc.setBounds(300,140,400,30);
        add(religionc);
      
        
        
        JLabel category=new JLabel("Category: ");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[]={"General","OBC","BC","SC","ST","Other"};
        categoryc=new JComboBox(valCategory);
        categoryc.setBackground(Color.WHITE);
        categoryc.setBounds(300,190,400,30);
        add(categoryc);
        
        JLabel income=new JLabel("Income : ");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valInc[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
       incomc=new JComboBox(valInc);
       incomc.setBackground(Color.WHITE);
       incomc.setBounds(300,240,400,30);
        add(incomc);
        
        
        JLabel education=new JLabel("Educational: ");
       education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,290,200,30);
        add(education);
        
 
        
        JLabel qualification=new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String valEd[]={"Non Graduate","Graduate","Post Graduate","Doctrate","Other"};
       edc=new JComboBox(valEd);
       edc.setBackground(Color.WHITE);
       edc.setBounds(300,315,400,30);
        add(edc);
        
       
        
        JLabel occupation=new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String valOcc[]={"Salaried","self-employed","Business","Student","Retired","Other"};
      occ=new JComboBox(valOcc);
       occ.setBackground(Color.WHITE);
       occ.setBounds(300,390,400,30);
        add(occ);
       
        
       
        
        JLabel pan=new JLabel("PAN No: ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
       pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField=new JTextField();
       panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel aadhar=new JLabel("Aadhar No: ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel senior=new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Raleway",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
        
        yes=new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no=new JRadioButton("No");
        no.setBounds(450,540,100,30);
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(yes);
        seniorgroup.add(no);
        
        
        JLabel acc=new JLabel("Existing Account: ");
        acc.setFont(new Font("Raleway",Font.BOLD,20));
        acc.setBounds(100,590,200,30);
        add(acc);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existgroup=new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
        
     
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);
        
     
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(100,10);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
        
        String sreligion=(String) religionc.getSelectedItem();
        String scategory=(String) categoryc.getSelectedItem();
        String sincome=(String) incomc.getSelectedItem();
        String seducation=(String) edc.getSelectedItem();
        String socc=(String) occ.getSelectedItem(); 
        String seniorciti=null;
        String exiacc=null;
        if(yes.isSelected())
        {
            seniorciti="Yes";
        }
        else if(no.isSelected())
        {
            seniorciti="No";
                   
        }
        
        if(eyes.isSelected())
        {
            exiacc="Yes";
        }
        else if(eno.isSelected())
        {
           exiacc="No";
                   
        }
        String span=panTextField.getText();
        String sadhar=aadharTextField.getText();
     
        try
        {
            if(span.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+socc+"','"+seniorciti+"','"+exiacc+"','"+span+"','"+sadhar+"')";
                c.s.executeUpdate(query);
                
                //signUp3 object
            }
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
            
        }catch(Exception e)
        {
            System.out.println(e);
        
        }
    }
    public static void main (String args[])
    {
        new SignupTwo("");
    }
}
