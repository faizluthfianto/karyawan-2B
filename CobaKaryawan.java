public class CobaKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("=== Jabatan PM ===");
	Pm p = new Pm();
	p.setNama("Faiz Luthfianto");
	p.setAlamat("Bekasi");
	p.setGaji(110);
	System.out.println(" ");

	System.out.println("=== Jabatan Programmer ===");
	Program pr = new Program();
	pr.setNama("Zaki Amansyah");
	p.setAlamat("Cirebon");
	p.setGaji(90);
	System.out.println(" ");

	System.out.println("=== Jabatan Desainer ===");
	Desain d = new Desain();
	d.setNama("Rama Alfareza");
	d.setAlamat("Indramayu");
	d.setGaji(50);
	}
}