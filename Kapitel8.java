import javax.swing.*;

public class Kapitel8{
	public static void main(String[] args){
		/*String rs = JOptionPane.showInputDialog(null, "Vad e radien?");
		double r = Double.parseDouble(rs);
		double A, O;
		A = Cirkel.area(r);
		O = Cirkel.omk(r);
		JOptionPane.showMessageDialog(null, "Omkrets: " + O + "\nArea: " + A);*/

		/*String ys = JOptionPane.showInputDialog(null, "Vilket ar ar det?");
		int y = Integer.parseInt(ys);
		boolean yb = Kalender.skottar(y);
		if(yb == true){
			JOptionPane.showMessageDialog(null, "Det ar skottar!");
		}else if(yb == false){
			JOptionPane.showMessageDialog(null, "Inte skottar!");
		}*/
		String ns = JOptionPane.showInputDialog(null, "Vilket heltal vill du fakultera?");
		int n = Integer.parseInt(ns);
		long fn = nfak(n);
		JOptionPane.showMessageDialog(null, "Fakulteten blir " + fn);

	}
	public static long nfak(int n){
		long a;
		for(a = 1; n>0; n--){
			a = (int) a * n;
			
		}
		return a;
	}
}
/*
class Cirkel{
	public static double area(double a){
		return a * a * Math.PI;
	}
	public static double omk(double a){
		return a * 2 * Math.PI;
	}
}*/
/*class Kalender{
	public static boolean skottar(int Year){
		if(Year%4 == 0 && Year%400 != 0){
			return true;
		}else {
			return false;
		}
	}
}*/