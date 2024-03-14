package practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JButton bt1,bt2;
	Font f1,f2;
	
	AddEmployee() {
		
		super("Employee Details");
		setLocation(400,100);
		setSize(500,400);
		
		f1 = new Font("Arial",Font.BOLD,20);
		f2 = new Font("Arial",Font.PLAIN,18);
		
		l1 = new JLabel("Add Employee");
		l2 = new JLabel("Employee Name");
		l3 = new JLabel("Employee City");
		l4 = new JLabel("Date of Birth");		
		l5 = new JLabel("Professor");
		l6 = new JLabel("Department");
		l7 = new JLabel("Department Id");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		tf6 = new JTextField();
		
		bt1 = new JButton("SAVE");
		bt2 = new JButton("CANCEL");
		
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		l6.setFont(f2);
		l7.setFont(f2);
		tf1.setFont(f2);
		tf2.setFont(f2);
		tf3.setFont(f2);
		tf4.setFont(f2);
		tf5.setFont(f2);
		tf6.setFont(f2);
		bt1.setFont(f2);
		bt2.setFont(f2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1,5,1,1));
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(9,2,1,1));
		p2.add(l2);
		p2.add(tf1);
		p2.add(l3);
		p2.add(tf2);
		p2.add(l4);
		p2.add(tf3);
		p2.add(l5);
		p2.add(tf4);
		p2.add(l6);	
		p2.add(tf5);
		p2.add(l7);	
		p2.add(tf6);
		p2.add(bt1);
		p2.add(bt2);
		
		setLayout(new BorderLayout(1,1));
		add(p1,"North");
		add(p2,"Center");
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		String name = tf1.getText().trim();
		String city = tf2.getText().trim();
		String dob = tf3.getText().trim();
		String professor = tf4.getText().trim();
		String department = tf5.getText().trim();
		String departmentid = tf6.getText().trim();
		
				
//		JComboBox cb = new JComboBox();
		if(e.getSource() == bt1)
		{
			try {
				
				ConnectionClass obj = new ConnectionClass();
				String q1 = "insert into employee(name,city,birthdate,professor,department,departmentid) value('"+name+"','"+city+"','"+dob+"','"+professor+"','"+department+"', ' "+departmentid+" ') ";
				
				int rest = obj.stm.executeUpdate(q1);
				if(rest == 1)
				{
					this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Employee details not Inserted");
				}
				
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			
			
		}
		if(e.getSource() == bt2)
		{
			this.setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		new AddEmployee().setVisible(true);
	}
}