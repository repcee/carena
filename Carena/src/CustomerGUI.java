import java.awt.*;
import java.awt.event.*;

public class CustomerGUI extends Frame {
	
	
	public CustomerGUI() {

		setLayout(new FlowLayout());
		setTitle("Test");
		setSize(300, 300);
		setVisible(true);
		
	}


	   // The entry main() method
	   public static void main(String[] args) {
	      // Invoke the constructor (to setup the GUI) by allocating an instance
	      CustomerGUI customers = new CustomerGUI();
	   }

	

}
