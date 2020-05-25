package sample;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NextPage {
	
	JLabel jlab1,jlab3,jlab4;
	JTextField  text1,text2;

	
    NextPage(){

    JFrame jfrm= new JFrame("Accreditation Compliance System");
    jfrm.getContentPane().setBackground(UIManager.getColor("Desktop.background"));
    jfrm.getContentPane().setLayout(null);
    jfrm.setBounds(600,250,922,582);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setResizable(false);
    jlab4 = new JLabel("Welcome");
    jlab4.setBounds(412,85,100,50);
    jfrm.getContentPane().add(jlab4);
    jlab3 = new JLabel("Principal, ATK UNIVERSITY");
    jlab3.setBounds(360,125,800,50);
    jfrm.getContentPane().add(jlab3);
    jlab1 = new JLabel("Choose a department");
    jlab1.setBounds(117,197,800,50);
    jfrm.getContentPane().add(jlab1);
    String dept[]={"Computer Science and Engineering","Electronics and Communication Engineering","Mechanical Engineering","Electrical and Electronics Engineering","Civil Engineering"};        
    JComboBox cb=new JComboBox(dept);    
    cb.setForeground(UIManager.getColor("FormattedTextField.selectionForeground"));
    cb.setBackground(Color.WHITE);
    cb.setBounds(117,255,450,30);    
    jfrm.getContentPane().add(cb);        
    JButton submit = new JButton("Continue");
    submit.setForeground(Color.WHITE);
    submit.setBackground(new Color(241,57,83));
    submit.setBounds(613,393,150,35);
    submit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
        	
        	if(cb.getItemAt(cb.getSelectedIndex())=="Computer Science and Engineering")
        	{	
        		Pcse sr=new Pcse();
        		sr.createUI();
        		jfrm.dispose();
        	}
        	else if(cb.getItemAt(cb.getSelectedIndex())=="Electronics and Communication Engineering")
        	{
        		Pece sr=new Pece();
        		sr.createUI();
        		jfrm.dispose();
        	}
        	else if(cb.getItemAt(cb.getSelectedIndex())=="Mechanical Engineering")
        	{
        		Pme sr=new Pme();
        		sr.createUI(); 
        		jfrm.dispose();
        	}
        	else if(cb.getItemAt(cb.getSelectedIndex())=="Electrical and Electronics Engineering")
        	{
        		Peee sr=new Peee();
        		sr.createUI(); 
        		jfrm.dispose();
        	}
        	else if(cb.getItemAt(cb.getSelectedIndex())=="Civil Engineering")
        	{
        		Pcivil2 sr=new Pcivil2();
        		sr.createUI(); 
        		jfrm.dispose();
        	}
        }
        });
    jfrm.getContentPane().add(submit);
    
    
    JPanel panel = new JPanel();
    panel.setBackground(Color.GRAY);
    panel.setBounds(-5, -29, 943, 102);
    jfrm.getContentPane().add(panel);
    panel.setLayout(null);
    
    
    JLabel lblCollegeOfEngineering = new JLabel("ATK UNIVERSITY");
    lblCollegeOfEngineering.setForeground(Color.WHITE);
    lblCollegeOfEngineering.setBounds(110, 61, 281, 10);
    panel.add(lblCollegeOfEngineering);
    
    JLabel label = new JLabel("");
    label.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/Cet_emblem(1).jpg")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
    label.setBounds(49, 36, 81, 54);
    panel.add(label);
    
    JButton btnLogout = new JButton("Logout");
    btnLogout.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/logout.jpg")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
    btnLogout.setBounds(807, 48, 110, 30);
    panel.add(btnLogout);
    
   
    btnLogout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	
    		  int a=JOptionPane.showConfirmDialog(jfrm,"Are you sure?",
    		  "Logout",JOptionPane.ERROR_MESSAGE);
    		  if(a==JOptionPane.YES_OPTION){  
    			    jfrm.dispose();
    			    new Login();
    			}      		  	  
    }
    });
    jfrm.setVisible(true);
    }
	
    public static void main(String args[]) {
    	// Create the frame on the event dispatching thread.
    	SwingUtilities.invokeLater(new Runnable() {
    	public void run() {
    	new NextPage();
    	}
    	});
    	}
    	}

