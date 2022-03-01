import javax.swing.JOptionPane;

	public class ProcessAName5026211103{
		public static void main(String[] args) {

		String Name;

		Name = JOptionPane.showInputDialog(null,"Enter your name : ");

		JOptionPane.showMessageDialog(null,"Your name is : " + Name.split(" ")[1]+", " + Name.split(" ")[0].charAt(0)+".");
		
		}
	}
