package listeners;

import java.awt.event.*;
import model.Model;

public class View1LagerListener implements ActionListener {
	Model m;

	public View1LagerListener(Model m) {
		this.m = m;
	}

	public void actionPerformed(ActionEvent e) {
		m.setWaarde(m.getWaarde() - 1);
	}
}