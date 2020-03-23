package model;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Model extends Observable {
	private int waarde;

	//
	//
	//
	public Model() {
		super();
		waarde = 10;
	}

	public Model(int waarde) {
		super();
		this.waarde = waarde;
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		this.waarde = waarde;
		setChanged();
		notifyObservers();
	}
}
