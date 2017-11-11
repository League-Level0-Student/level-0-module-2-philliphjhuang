package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {


	public static void main(String[] args) {
		String y = "";
			for (int i = 0; i < 5; i++) {
			
		
int x =  new Random().nextInt(60)+1;
y = y+"    "+ Integer.toString(x);
}
		
		JOptionPane.showMessageDialog(null, "Your lottery ticket is "+ y +"  .");

}
}