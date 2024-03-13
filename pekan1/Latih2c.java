package pertemuan1;

public class Latih2c {

	public static void main(String[] args) {
		
		double diameter = 5;
		double tinggi = 10;
		double jarijari= diameter/2;
		double phi = 3.14;
		
		
		double volume= phi * Math.pow(jarijari,2) * tinggi;
		
		System.out.println("Menghitung Volume Tabung");
		System.out.println("Diketahaui sebuah tabung memiliki: ");
		System.out.println("Diameter: "+diameter);
		System.out.println("Jari-Jari: "+jarijari);
		System.out.println("Tinggi: "+tinggi);
		System.out.println("Jadi volume tabung tersebut adalah= "+volume);

	}

}
