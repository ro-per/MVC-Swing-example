package listeners;

import java.awt.event.*;
import model.Model;

public class View1HogerListener implements ActionListener {
	Model m;

	public View1HogerListener(Model m) {
		this.m = m;
	}

	public void actionPerformed(ActionEvent e) {
		m.setWaarde(m.getWaarde() + 1);
	}
}