package musicPlayer;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

import com.toedter.calendar.*;

public class AddArtists<JCalendar> extends JFrame implements ActionListener {

	JPanel p1, p2, p3;
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JButton bt1, bt2;
	Font f1;
	JDateChooser dc;

	AddArtists() {

		super("Add Artist");
		setLocation(200, 100);
		setSize(450, 200);

		f1 = new Font("Arial", Font.PLAIN, 18);

		l1 = new JLabel("Artists Name");
		l2 = new JLabel("Date of Birth");
		l3 = new JLabel("Bio");
		dc = new JDateChooser();
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		bt1 = new JButton("Cancel");
		bt2 = new JButton("Save");

		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);
		dc.setFont(f1);

		bt2.setAlignmentX(RIGHT_ALIGNMENT);
		bt1.setAlignmentX(RIGHT_ALIGNMENT);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2, 10, 10));
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(dc);
		p1.add(l3);
		p1.add(tf2);
		p1.add(bt1);
		p1.add(bt2);

		setLayout(new BorderLayout(10, 10));
		add(p1, "Center");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = tf1.getText();
		String birthdate = dc.getDateFormatString().toString();
		String bio = tf2.getText();

		if (e.getSource() == bt1) {

			// new AddSong().setVisible(true);
			this.setVisible(false);

		}
		if (e.getSource() == bt2) {

			try {

				ConnectionClass con = new ConnectionClass();
				String query = "insert into Artists(Name,DOB,Bio) value('" + name + "' , '" + birthdate + "' , '" + bio
						+ "')";

				int rest = con.stm.executeUpdate(query);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	
	public String artistname() {
		
		
		String name = tf1.getText();
		return name;
		
	}

	public static void main(String[] args) {

		new AddArtists().setVisible(true);
	}

}
