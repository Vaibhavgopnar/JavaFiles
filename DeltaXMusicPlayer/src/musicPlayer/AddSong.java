package musicPlayer;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

public class AddSong extends JFrame implements ActionListener {

	JPanel p1, p2, p3;
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2;
	JButton bt1, bt2, bt3, bt4;
	Font f1, f2;
	JComboBox cb;
	JCheckBox ch1, ch2, ch3, ch4, ch5;
	
	String[] artists = {"Sonu Nigam", "Kumar Sanu", "Neha Kakkar", "Udit Narayan" };
	
	AddSong() {

		super("Home");
		setLocation(200, 100);
		setSize(600, 300);

		f1 = new Font("Arial", Font.BOLD, 20);
		f2 = new Font("Arial", Font.PLAIN, 18);

		l1 = new JLabel("Adding a new Song");
		l2 = new JLabel("Song Name");
		l3 = new JLabel("Date Released");
		l4 = new JLabel("Artwork");
		l5 = new JLabel("Artists");

		tf1 = new JTextField();
		tf2 = new JTextField();

		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);

		tf1.setFont(f2);
		tf2.setFont(f2);

		bt1 = new JButton("Upload Image");
		bt2 = new JButton("Add Artists");
		bt3 = new JButton("Cancel");
		bt4 = new JButton("Save");

		bt1.setFont(f2);
		bt2.setFont(f2);
		bt3.setFont(f2);
		bt4.setFont(f2);

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		
	//	JCheckComboBox ccb = new JCheckComboBox();

		cb = new JComboBox(artists);

		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);

		p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 2, 10, 10));
		p2.add(l2);
		p2.add(tf1);
		p2.add(l3);
		p2.add(tf2);
		p2.add(l4);
		p2.add(bt1);

		p3 = new JPanel();
		p3.setLayout(new GridLayout(2, 3, 10, 10));
		p3.add(l5);
		p3.add(cb);
		p3.add(bt2);
		p3.add(bt3);
		p3.add(bt4);

		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");
		add(p3, "South");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String songname = tf1.getText();
		String releasedate = tf2.getText();
		String artwork = bt1.getText();
		String artist =cb.getSelectedItem().toString();

		if (e.getSource() == bt1) {

			
		}
		if (e.getSource() == bt2) {

			new AddArtists().setVisible(true);

		}
		if (e.getSource() == bt3) {

			new Home().setVisible(true);
			this.setVisible(false);

		}
		if (e.getSource() == bt4) {
			try {

				ConnectionClass con = new ConnectionClass();
				String query = "insert into Songs(Name,DateofRelease,Artwork,Artist) value('" + songname + "' , '"
						+ releasedate + "' , '" + artwork + "' , '" + artist + "')";

				con.stm.executeUpdate(query);
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		new AddSong().setVisible(true);
	}
}
