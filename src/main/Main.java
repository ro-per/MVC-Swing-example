package main;
import view.View1;
import model.Model;
import view.ViewSlider;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		Model m = new Model();
		View1 v1 = new View1(m);
		ViewSlider v2 = new ViewSlider(m);
		m.addObserver(v1); // Connect the View to the Model
		m.addObserver(v2);
		
	}

}
