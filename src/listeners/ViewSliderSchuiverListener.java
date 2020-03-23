package listeners;

import javax.swing.JSlider;
import javax.swing.event.*;
import model.Model;

public class ViewSliderSchuiverListener implements ChangeListener {
	Model m;

	public ViewSliderSchuiverListener(Model m) {
		this.m = m;
	}

	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider) e.getSource();
		int waarde = (int) source.getValue();
		m.setWaarde(waarde);
	}
}