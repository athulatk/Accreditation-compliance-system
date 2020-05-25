package sample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Civil{
JFrame frame;
JLabel jlab1,jlab2;

JLabel label;
JButton button,update,clear;
JPanel panel;
static JTable table;

String driverName = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost/accreditation";
String userName = "athul";
String password = "Athul.1999";
String[] columnNames = {"Sl.No","Required Documents"};
private JTable table_1;
private JCheckBox checkbox1,checkbox2,checkbox3,checkbox4;
private JCheckBox checkbox5,checkbox6,checkbox7,checkbox8;
Statement ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8;


public void createUI()
{
frame = new JFrame("Accreditation Compliance System");
frame.getContentPane().setBackground(new Color(255, 255, 255));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.getContentPane().setLayout(null);
label = new JLabel("Department of Civil Engineering, ATK UNIVERSITY");
label.setBounds(396, 111, 1000, 20);
update = new JButton("Update");
update.setBackground(new Color(41, 208, 74));
update.setForeground(Color.WHITE);
update.setBounds(399,633,120,40);
clear = new JButton("Refresh");
clear.setBackground(new Color(226, 76, 74));
clear.setForeground(Color.WHITE);
clear.setBounds(676,633,120,40);
checkbox1 = new JCheckBox("");
checkbox1.setBounds(960, 195, 20, 50);
checkbox1.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox1);
checkbox2 = new JCheckBox("");
checkbox2.setBounds(960, 240, 20, 50);
checkbox2.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox2);
checkbox3 = new JCheckBox("");
checkbox3.setBounds(960, 280, 20, 50);
checkbox3.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox3);
checkbox4 = new JCheckBox("");
checkbox4.setBounds(960, 325, 20, 50);
checkbox4.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox4);
checkbox5 = new JCheckBox("");
checkbox5.setBounds(960, 365, 20, 50);
checkbox5.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox5);
checkbox6 = new JCheckBox("");
checkbox6.setBounds(960, 408, 20, 50);
checkbox6.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox6);
checkbox7 = new JCheckBox("");
checkbox7.setBounds(960, 450, 20, 50);
checkbox7.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox7);  
checkbox8 = new JCheckBox("");
checkbox8.setBounds(960, 490, 20, 50);
checkbox8.setBackground(Color.WHITE);
frame.getContentPane().add(checkbox8);


JPanel panel = new JPanel();
panel.setBackground(Color.GRAY);
panel.setBounds(-14, -29, 1314, 102);
frame.getContentPane().add(panel);
panel.setLayout(null);


JLabel lblCollegeOfEngineering = new JLabel("ATK UNIVERSITY");
lblCollegeOfEngineering.setForeground(Color.WHITE);
lblCollegeOfEngineering.setBounds(140, 58, 281, 10);
panel.add(lblCollegeOfEngineering);

JLabel label23 = new JLabel("");
label23.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/Cet_emblem(1).jpg")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
label23.setBounds(79, 36, 81, 54);
panel.add(label23);

JButton btnLogout = new JButton("Logout");
btnLogout.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/logout.jpg")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
btnLogout.setBounds(1083, 48, 110, 30);
panel.add(btnLogout);

btnLogout.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	
    		  int a=JOptionPane.showConfirmDialog(frame,"Are you sure?",
    		  "Logout",JOptionPane.ERROR_MESSAGE);
    		  if(a==JOptionPane.YES_OPTION){  
    			    frame.dispose();
    			    new Login();
    			}      		  	  
    }
    });

update.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	
    	if(checkbox1.isSelected())
    	{
            	try
            	{ 
           
            	String sql = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 1";
            	ps1 = MyConnection.getConnection().createStatement();
            	ps1.executeUpdate(sql);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox1.isSelected())
    	{
    		try
        	{ 
       
        	String sql = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 1";
        	ps1 = MyConnection.getConnection().createStatement();
        	ps1.executeUpdate(sql);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox2.isSelected())
    	{
            	try
            	{ 
           
            	String sql2 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 2";
            	ps2 = MyConnection.getConnection().createStatement();
            	ps2.executeUpdate(sql2);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox2.isSelected())
    	{
    		try
        	{ 
       
        	String sql2 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 2";
        	ps2 = MyConnection.getConnection().createStatement();
        	ps2.executeUpdate(sql2);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox3.isSelected())
    	{
            	try
            	{ 
           
            	String sql3 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 3";
            	ps3 = MyConnection.getConnection().createStatement();
            	ps3.executeUpdate(sql3);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox3.isSelected())
    	{
    		try
        	{ 
       
        	String sql3 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 3";
        	ps3 = MyConnection.getConnection().createStatement();
        	ps3.executeUpdate(sql3);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox4.isSelected())
    	{
            	try
            	{ 
           
            	String sql4 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 4";
            	ps4 = MyConnection.getConnection().createStatement();
            	ps4.executeUpdate(sql4);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox4.isSelected())
    	{
    		try
        	{ 
       
        	String sql4 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 4";
        	ps4 = MyConnection.getConnection().createStatement();
        	ps4.executeUpdate(sql4);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox5.isSelected())
    	{
            	try
            	{ 
           
            	String sql5 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 5";
            	ps5 = MyConnection.getConnection().createStatement();
            	ps5.executeUpdate(sql5);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox5.isSelected())
    	{
    		try
        	{ 
       
        	String sql5 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 5";
        	ps5 = MyConnection.getConnection().createStatement();
        	ps5.executeUpdate(sql5);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox6.isSelected())
    	{
            	try
            	{ 
           
            	String sql6 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 6";
            	ps6 = MyConnection.getConnection().createStatement();
            	ps6.executeUpdate(sql6);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox6.isSelected())
    	{
    		try
        	{ 
       
        	String sql6 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 6";
        	ps6 = MyConnection.getConnection().createStatement();
        	ps6.executeUpdate(sql6);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox7.isSelected())
    	{
            	try
            	{ 
           
            	String sql7 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 7";
            	ps7 = MyConnection.getConnection().createStatement();
            	ps7.executeUpdate(sql7);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox7.isSelected())
    	{
    		try
        	{ 
       
        	String sql7 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 7";
        	ps7 = MyConnection.getConnection().createStatement();
        	ps7.executeUpdate(sql7);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	
    	if(checkbox8.isSelected())
    	{
            	try
            	{ 
           
            	String sql8 = "UPDATE civildocs SET `status` = 'Completed' WHERE `Sl.No` = 8";
            	ps8 = MyConnection.getConnection().createStatement();
            	ps8.executeUpdate(sql8);
            	}
            	catch(Exception ex)
            	{
            	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
            	JOptionPane.ERROR_MESSAGE);
            	}
    	}
    	else if(!checkbox8.isSelected())
    	{
    		try
        	{ 
       
        	String sql8 = "UPDATE civildocs SET `status` = 'Pending' WHERE `Sl.No` = 8";
        	ps8 = MyConnection.getConnection().createStatement();
        	ps8.executeUpdate(sql8);
        	}
        	catch(Exception ex)
        	{
        	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
        	JOptionPane.ERROR_MESSAGE);
        	}
    		
    	}
    	JOptionPane.showMessageDialog(frame,"Updated successfully..");  
    }});


clear.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	try
    	{ 
   
    	String sql1 = "SELECT `Status` FROM `civildocs`";
    	ps1 = MyConnection.getConnection().createStatement();
    	ResultSet rs1= ps1.executeQuery(sql1);
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox1.setSelected(true);
    	}
    	else
    	{
    		checkbox1.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox2.setSelected(true);
    	}
    	else
    	{
    		checkbox2.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox3.setSelected(true);
    	}
    	else
    	{
    		checkbox3.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox4.setSelected(true);
    	}
    	else
    	{
    		checkbox4.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox5.setSelected(true);
    	}
    	else
    	{
    		checkbox5.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox6.setSelected(true);
    	}
    	else
    	{
    		checkbox6.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox7.setSelected(true);
    	}
    	else
    	{
    		checkbox7.setSelected(false);
    	}
    	rs1.next();
    	if("Completed".equals(rs1.getString(1)))
    	{
    		checkbox8.setSelected(true);
    	}
    	else
    	{
    		checkbox8.setSelected(false);
    	}
    	
    	}
    	catch(Exception ex)
    	{
    	JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
    	JOptionPane.ERROR_MESSAGE);
    	}
    		  	  	  
    }
    });

frame.getContentPane().add(label);
frame.getContentPane().add(update);
frame.getContentPane().add(clear);
table_1 = new JTable();
frame.setVisible(true);
frame.setBounds(400,100,1200,820); 
 
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
table_1= new JTable();
table_1.setModel(model); 
table_1.setForeground(Color.BLACK);
table_1.setBackground(new Color(245, 245, 245));
table_1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table_1.setRowHeight(table_1.getRowHeight() + 25);
table_1.setFillsViewportHeight(true);
TableColumnModel columnModel = table_1.getColumnModel();
columnModel.getColumn(0).setPreferredWidth(2);
columnModel.getColumn(1).setPreferredWidth(670);

JScrollPane scrollPane = new JScrollPane(table_1);
scrollPane.setBounds(172, 183, 770, 350);
frame.getContentPane().add(scrollPane);
scrollPane.setViewportView(table_1);
String name= "";

try
{ 
//Class.forName(driverName); 
//Connection con = DriverManager.getConnection(url, userName, password);
String sql = "select * from civildocs";
PreparedStatement ps = MyConnection.getConnection().prepareStatement(sql);
ResultSet rs = ps.executeQuery();

while(rs.next())
{
int sno=rs.getInt("Sl.No");
name = rs.getString("Documents");
model.addRow(new Object[]{sno,name});
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame.getContentPane().add(scrollPane);



}

public static void main(String args[])
{
Civil sr = new Civil();
sr.createUI(); 
}
}
