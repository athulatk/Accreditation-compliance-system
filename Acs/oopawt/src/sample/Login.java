package sample;
import java.awt.*;
import java.util.logging.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login{
	
	JLabel jlab1,jlab2;
	JTextField  text1,text2;
	private JLabel label;
	private JLabel label_2;
	private JLabel lblSince;
	
    Login(){

    JFrame jfrm= new JFrame("Accreditation Compliance System");
    jfrm.getContentPane().setBackground(Color.WHITE);
    jfrm.getContentPane().setLayout(null);
    jfrm.setBounds(600,250,904,564);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setResizable(false);
    jlab1 = new JLabel("Username");
    jlab1.setBounds(500,96,80,15);
    jfrm.getContentPane().add(jlab1);
    text1 = new JTextField();
    text1.setBounds(498,135,289,30);
    jfrm.getContentPane().add(text1);
    jlab2 = new JLabel("Password");
    jlab2.setBounds(500,227,100,15);
    jfrm.getContentPane().add(jlab2);
    text2 = new JPasswordField();
    text2.setBounds(498,264,289,30);
    jfrm.getContentPane().add(text2);
    JButton submit = new JButton("Login");
    submit.setBackground(new Color(241,57,83));
    submit.setForeground(Color.WHITE);
    submit.setBounds(566,369,170,35);
    submit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	String value1=text1.getText();
        String value2=text2.getText();
    	if (value1.equals("principalcet") && value2.equals("Princi@99")) {
    		  new NextPage();
    		  jfrm.dispose();
    		  }
    	    	
    	else {
    	
    	 PreparedStatement ps1;
         ResultSet rs1;
         
         String query = "SELECT * FROM `dept.login` WHERE `Username` =? AND `Password` =?";
         
         try {
             ps1 = MyConnection.getConnection().prepareStatement(query);
             
             ps1.setString(1, value1);
             ps1.setString(2, value2);
             
             rs1 = ps1.executeQuery();
             
             if(rs1.next())
             {
            	 	if("D01".equals(rs1.getString(1)))
            	 	{
            	 		Csdept1 sr = new Csdept1();
            	 		sr.createUI(); 
                     jfrm.dispose();
            	 	}
            	 	if("D02".equals(rs1.getString(1)))
            	 	{
            	 		Me sr = new Me();
            	 		sr.createUI(); 
                     jfrm.dispose();
            	 	}
            	 	if("D03".equals(rs1.getString(1)))
            	 	{
                        Ece sr = new Ece();
                        sr.createUI();
                        jfrm.dispose();
               	 	}
            	 	if("D04".equals(rs1.getString(1)))
            	 	{
                        Eee sr = new Eee();
                        sr.createUI();
                        jfrm.dispose();
               	 	}
            	 	if("D05".equals(rs1.getString(1)))
            	 	{
                        Civil sr = new Civil();
                        sr.createUI();
                        jfrm.dispose();
               	 	}
            	 	
             }
             
             else{
       		  System.out.println("The username and password does not match!!");
       		  JOptionPane.showMessageDialog(jfrm,"Incorrect Username or Password",
       		  "Error",JOptionPane.ERROR_MESSAGE);
       		  }
             
         } catch (SQLException ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
    	
    	
    	}
    	

    }
    });
    jfrm.getContentPane().add(submit);
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.GRAY);
    panel.setBounds(0, -11, 412, 596);
    jfrm.getContentPane().add(panel);
    panel.setLayout(null);
    
    label = new JLabel("");
    label.setBounds(206, 5, 0, 0);
    panel.add(label);
    
    JLabel label_1 = new JLabel("");
    label_1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/Cet_emblem(1).jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
    label_1.setBounds(161, 368, 91, 93);
    panel.add(label_1);
    
    JLabel lblCollegeOfEngineering = new JLabel("ATK UNIVERSITY");
    lblCollegeOfEngineering.setForeground(Color.WHITE);
    lblCollegeOfEngineering.setBounds(145, 460, 140, 15);
    panel.add(lblCollegeOfEngineering);
    
    label_2 = new JLabel("");
    label_2.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/uni.jpg")).getImage().getScaledInstance(450, 500, Image.SCALE_DEFAULT)));
    label_2.setBounds(0, 5, 423, 346);
    panel.add(label_2);
    
    lblSince = new JLabel("Estd. 1999");
    lblSince.setFont(new Font("DejaVu Serif", Font.ITALIC, 10));
    lblSince.setForeground(Color.WHITE);
    lblSince.setBounds(171, 483, 100, 15);
    panel.add(lblSince);
    jfrm.setVisible(true);
    }
	
    public static void main(String args[]) {
    	// Create the frame on the event dispatching thread.
    	SwingUtilities.invokeLater(new Runnable() {
    	public void run() {
    	new Login();
    	}
    	});
    	}
    	}

