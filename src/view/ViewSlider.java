package view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import listeners.*;
import model.Model;

@SuppressWarnings("deprecation")
public class ViewSlider extends JFrame implements Observer {

	Model m;

	private JLabel l;
	private JButton k;
	private JPanel p;
	private JSlider s;

	public ViewSlider(Model m) {
		this.m = m;
		l = new JLabel();
		l.setText(String.valueOf(m.getWaarde()));
		s = new JSlider(JSlider.VERTICAL, 0, 20, m.getWaarde());
		s.addChangeListener(new ViewSliderSchuiverListener(m));
		p = new JPanel();
		p.add(l);
		p.add(s);
		this.getContentPane().add(p);
		this.setBounds(700, 200, 200, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void update(Observable arg0, Object arg1) { // Called from the Model
		l.setText(String.valueOf(m.getWaarde()));
		s.setValue(m.getWaarde());
	}
}
