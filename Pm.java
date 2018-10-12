public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Selamat Gaji Anda Bulan Ini Sebesar = "+gaji);
		}else{
			System.out.println("Maaf Gaji Anda Tidak Sesuai Dengan UMR");
		}
	}
}