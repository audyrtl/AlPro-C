import javax.swing.JOptionPane;

	public class JavaLibs5026211103 {
	public static void main(String[] Args) {

	String Nama, AsalSMP, AsalSMA, PerguruanTinggi, Jurusan;
	int TahunLahir, Umur, MapelSMP, MapelSMA, LulusSMP, LulusSMA;
	double UNSMP, UNSMA, TotalSMP, TotalSMA;

	JOptionPane.showMessageDialog(null,"Haloo!");
	JOptionPane.showMessageDialog(null,"Catat riwayat sekolahmu yukk!");

	Nama = JOptionPane.showInputDialog(null,"Dengan Siapa ini?");
	TahunLahir = Integer.parseInt(JOptionPane.showInputDialog(null,"Lahir tahun berapa nihh?"));
	Umur = 2022-TahunLahir;

	JOptionPane.showMessageDialog(null,"Sekarang Umur " + Umur + " nihh berartii");

	AsalSMP = JOptionPane.showInputDialog(null,"Dari SMP mana nihh?");
	LulusSMP = Integer.parseInt(JOptionPane.showInputDialog(null,"Lulus SMP tahun berapa?"));
	UNSMP = Double.parseDouble(JOptionPane.showInputDialog(null,"Nilai UN SMPNYA berapa? Kalau nggaada UN bisa total nilai rapot."));
	MapelSMP = Integer.parseInt(JOptionPane.showInputDialog(null,"Dari berapa mapel nihh nilainya?"));
	TotalSMP = UNSMP/MapelSMP;

	JOptionPane.showMessageDialog(null,"Wahh rata-ratanya " + TotalSMP + " dongg yaa");

	AsalSMA =  JOptionPane.showInputDialog(null,"Kalau SMA nya darimana?");	
	LulusSMA = Integer.parseInt(JOptionPane.showInputDialog(null,"Kalau lulus SMA nya tahun berapa?"));
	UNSMA = Double.parseDouble(JOptionPane.showInputDialog(null,"UN SMA nilainya berapa? Kalau nggaada UN bisa total nilai rapot."));
	MapelSMA = Integer.parseInt(JOptionPane.showInputDialog(null,"Dari berapa mapel nihh nilainya?"));
	TotalSMA = UNSMA/MapelSMA;

	JOptionPane.showMessageDialog(null, "Wahh rata-ratanya " + TotalSMA + " dongg yaa");

	PerguruanTinggi = JOptionPane.showInputDialog(null,"Kuliahnya dimana sekarang?");
	Jurusan = JOptionPane.showInputDialog(null,"Ambil jurusan apa nihh?");

	JOptionPane.showMessageDialog(null,"Wahh keren bangett dehh " + Nama + " !");
	JOptionPane.showMessageDialog(null,"Sampai ketemu lagii yaa " + Nama + " ! See youu!");

	}
}
