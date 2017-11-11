package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
	int y=0;
	String x = JOptionPane.showInputDialog("How tall are you? (in Inches)");
	y = Integer.parseInt(x);
	if(y>=48) {
		JOptionPane.showMessageDialog(null, "You can ride the rollercoaster.");
	}
	else {
		JOptionPane.showMessageDialog(null,"You need to grow taller to ride the rollercoasters.");
	}
}
}
