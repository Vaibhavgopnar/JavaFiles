package musicPlayer;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Home extends JFrame implements ActionListener{

	JPanel p1,p2,p3,p4;
	JLabel l1,l2,l3,l4,l5;
	JTextField tf1;
	JButton bt1;
	Font f1,f2;
	JTable t1,t2;
	JScrollPane sp1,sp2;
	
	String[] x = {"Artwork","Song","Date of Release","Artist","Rate"};
	String[] p = {"Name", "DOB", "Bio"};
	String[][] y = new String[10][5];
	String[][] q = new String[10][3]; 
	int i=0,j=0;
	
	Home() {
		
		super("Home");
		setLocation(200,100);
		setSize(800,900);
		
		f1 = new Font("Arial",Font.BOLD,20);
		f2 = new Font("Arial",Font.PLAIN,18);
		
		l1 = new JLabel("Top 10 Songs");
		l2 = new JLabel("Top 10 Artists");
		bt1 = new JButton("Add Song");
		
		l1.setFont(f1);
		l2.setFont(f1);
		bt1.setFont(f2);
		
		bt1.addActionListener(this);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2,10,10));
		p1.add(l1);
		p1.add(bt1);
		
		try {

			ConnectionClass obj = new ConnectionClass();
			String q = "select * from Songs";

			ResultSet rest = obj.stm.executeQuery(q);
			while (rest.next()) {
				y[i][j++] = rest.getString("Artwork");
				y[i][j++] = rest.getString("Song");
				y[i][j++] = rest.getString("DateofRelease");
				y[i][j++] = rest.getString("Artist");
				y[i][j++] = rest.getString("Rate");

				i++;
				j = 0;
			}

		t1 = new JTable(y, x);
		t1.setFont(f2);

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		sp1 = new JScrollPane(t1);
		add(sp1);
		
		
		
		try {

			ConnectionClass obj = new ConnectionClass();
			String query = "select * from Artists";

			ResultSet rest = obj.stm.executeQuery(query);
			while (rest.next()) {
				q[i][j++] = rest.getString("Name");
				q[i][j++] = rest.getString("DOB");
				q[i][j++] = rest.getString("Bio");

				i++;
				j = 0;
			}

		t2 = new JTable(q, p);
		t2.setFont(f2);

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		sp2 = new JScrollPane(t2);
		add(sp2);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1,2,2));
		p2.add(sp1);
		p2.add(l2);
		
		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");
		add(sp2, "South");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bt1) {
			
			new AddSong().setVisible(true);
			this.setVisible(false);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new Home().setVisible(true);
	}
}
