package practice;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

public class Delete extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel p1, p2;
	JLabel l1,l2;
	JButton bt1, bt2;
	Font f, f1;
	JTextField tf1;

	
	Delete() {
		super("Employee Details");
		setLocation(400, 100);
		setSize(500, 200);

		f = new Font("Arial", Font.BOLD, 20);
		f1 = new Font("Arial", Font.PLAIN, 18);

		l1 = new JLabel("Employee Details");
		l2 = new JLabel("Enter Department id");
		tf1=new JTextField();
		bt1 = new JButton("Delete");
		bt2 = new JButton("Cancel");

		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f);
		l2.setFont(f1);
		tf1.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);

		p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 2, 30, 10));
		p2.add(l2);
		p2.add(tf1);
		p2.add(bt1);
		p2.add(bt2);

		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String id = tf1.getText();
		if (e.getSource() == bt1) 
		{
			try {
			ConnectionClass obj = new ConnectionClass();
			String q = "delete from employee where departmentid=' "+id+" ' ";
			obj.stm.executeQuery(q);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			this.setVisible(false);
		}

		if (e.getSource() == bt2) 
		{
			new Home().setVisible(true);
			this.setVisible(false);
		}
}
	public static void main(String[] args) {
		new Delete().setVisible(true);
	}
	
	
	
}
