package sample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Pme{
JFrame frame;
JLabel jlab1,jlab2;
JLabel j1;
JLabel label;
JButton button,validate;
JPanel panel;
static JTable table;
int count=0;
String driverName = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost/accreditation";
String userName = "athul";
String password = "Athul.1999";
String[] columnNames = {"Sl.No","Documents","Status"};

private JTable table_1;
private JProgressBar progressBar;

public void createUI()
{
frame = new JFrame("Accreditation Compliance System");
frame.getContentPane().setBackground(new Color(255, 255, 255));
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.getContentPane().setLayout(null);
label = new JLabel("Department of Mechanical Engineering, ATK UNIVERSITY");
label.setBounds(420, 111, 1000, 20);
j1 = new JLabel("Progress:");
j1.setBounds(179, 154, 110, 30);
frame.getContentPane().add(j1);

validate = new JButton("Validate");
validate.setBackground(new Color(241,57,83));
validate.setForeground(Color.WHITE);
validate.setBounds(563,726,120,40);


progressBar = new JProgressBar();
progressBar.setForeground(UIManager.getColor("Tree.selectionBorderColor"));
progressBar.setStringPainted(true);
progressBar.setBounds(179, 205, 893, 30);
frame.getContentPane().add(progressBar);

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
btnLogout.setBounds(1183, 48, 110, 30);
panel.add(btnLogout);
JButton button_1 = new JButton("");
button_1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/back.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
button_1.setBounds(12, 12, 50, 101);
panel.add(button_1);
button_1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	
    		       new NextPage();
    		       frame.dispose();
    			}      		  	  
    
    });

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


try
{ 

String sql10 = "select * from mechdocs";
PreparedStatement ps10 = MyConnection.getConnection().prepareStatement(sql10);
ResultSet rs10 = ps10.executeQuery();

while(rs10.next())
{
	if("Completed".equals(rs10.getString(3)))
		count++;
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}

if(count==0)
	progressBar.setValue(0);
if(count>0 && count<4)
	progressBar.setValue(25);
if(count==4)
	progressBar.setValue(50);
if(count>4 && count<8)
	progressBar.setValue(75);
if(count==8)
	progressBar.setValue(100);

validate.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
    	if(count==8)
    	{
    		
    		try
    		{ 

    		String sql11 = "select * from mechdocs";
    		PreparedStatement ps11 = MyConnection.getConnection().prepareStatement(sql11);
    		ResultSet rs11 = ps11.executeQuery();
    		try {
                FileWriter writer = new FileWriter("/home/athulatk/Desktop/Validations/Mech.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("Department Id : D02");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.write("Department Name : Mechanical Engineering");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                bufferedWriter.write("Documents Completed: ");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
             while(rs11.next())
             { 
                bufferedWriter.write(rs11.getInt(1) + ". " + rs11.getString(2));
                bufferedWriter.newLine();
             }
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    		}
    		catch(Exception ex)
    		{
    		JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
    		JOptionPane.ERROR_MESSAGE);
    		}
    		JOptionPane.showMessageDialog(frame,"Validated successfully.."); 
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(frame,"Some documents are pending!!");  
    	}
    	
    }});


frame.getContentPane().add(label);

frame.getContentPane().add(validate);
table_1 = new JTable();
frame.setVisible(true);
frame.setBounds(400,100,1300,920); 
 
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
columnModel.getColumn(1).setPreferredWidth(500);
columnModel.getColumn(2).setPreferredWidth(50);

JScrollPane scrollPane = new JScrollPane(table_1);
scrollPane.setBounds(172, 293, 900, 350);
frame.getContentPane().add(scrollPane);
scrollPane.setViewportView(table_1);
int slno;
String name= "";
String status="";
try
{ 

String sql = "select * from mechdocs";
PreparedStatement ps = MyConnection.getConnection().prepareStatement(sql);
ResultSet rs = ps.executeQuery();

while(rs.next())
{
slno=rs.getInt("Sl.No");
name = rs.getString("Documents");
status = rs.getString("Status");
model.addRow(new Object[]{slno,name,status});
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
Pme sr = new Pme();
sr.createUI(); 
}
}
