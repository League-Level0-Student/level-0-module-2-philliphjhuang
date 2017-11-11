package random;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		int y=0;
		String x = JOptionPane.showInputDialog("How old are you?");
		y = Integer.parseInt(x);
		if(y>=18) {
			JOptionPane.showMessageDialog(null, "Who is the next president?");
		}
		else {
			JOptionPane.showMessageDialog(null,"No one cares what you think.");
		}
}
}
