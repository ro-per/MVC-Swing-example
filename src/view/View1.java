package view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import listeners.*;
import model.Model;

@SuppressWarnings("deprecation")
public class View1 extends JFrame implements Observer {

	Model m;

	private JLabel l;
	private JButton kUp, kDown;
	private JPanel p;

	public View1(Model m) {
		this.m = m;
		l = new JLabel();
		l.setText(String.valueOf(m.getWaarde()));
		kUp = new JButton("Up");
		kUp.addActionListener(new View1HogerListener(m));
		kDown = new JButton("Down");
		kDown.addActionListener(new View1LagerListener(m));
		p = new JPanel();
		p.add(l);
		p.add(kUp);
		p.add(kDown);

		this.getContentPane().add(p);
		this.setBounds(400, 200, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void update(Observable arg0, Object arg1) { // Called from the Model
		l.setText(String.valueOf(m.getWaarde()));
	}
}
