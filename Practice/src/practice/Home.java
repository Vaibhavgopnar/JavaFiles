package practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel p1, p2;
	JLabel l1;
	JButton bt1, bt2, bt3, bt4;
	Font f, f1;

	Home() {
		super("Employee Details");
		setLocation(400, 100);
		setSize(500, 300);

		f = new Font("Arial", Font.BOLD, 20);
		f1 = new Font("Arial", Font.PLAIN, 18);

		l1 = new JLabel("Employee Details");
		bt1 = new JButton("Insert");
		bt2 = new JButton("Read");
		bt3 = new JButton("Update");
		bt4 = new JButton("Delete");

		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f);
		bt1.setFont(f1);
		bt2.setFont(f1);
		bt3.setFont(f1);
		bt4.setFont(f1);

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);

		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);

		p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 4, 30, 10));
		p2.add(bt1);
		p2.add(bt2);
		p2.add(bt3);
		p2.add(bt4);

		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == bt1) 
		{
			new AddEmployee().setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == bt2) 
		{
			new Displaydata().setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == bt3) 
		{
	//		new Updatedata().setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == bt4) 
		{
			new Delete().setVisible(true);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new Home().setVisible(true);
	}

}