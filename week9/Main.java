package week9;

public class Main
{
    public static void main(String[] args)
    {
        BangunDatar BangunDatar = new BangunDatar(0, 0);

        System.out.println("---BANGUN DATAR---");
        System.out.println("Luas Persegi: " + BangunDatar.luas(3));
        System.out.println("Luas Persegi Panjang: " + BangunDatar.luas(7, 4));
        System.out.println("Luas Segitiga: " + BangunDatar.luas(5.3, 7.7));
        System.out.println("Luas Lingkaran: " + BangunDatar.luas(6.0));


        BangunRuang BangunRuang = new BangunRuang(0);

        System.out.println("---BANGUN RUANG---");
        System.out.println("Volume Tabung : " + BangunRuang.volume(8.0, 3.0));
        System.out.println("Volume Kubus : " + BangunRuang.volume(9));
        System.out.println("Volume Balok : " + BangunRuang.volume(7,6,4));
        System.out.println("Volume Prisma : " + BangunRuang.volume(7.5, 4.3, 5.0));
    }
}