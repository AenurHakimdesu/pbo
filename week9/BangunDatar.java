package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private double diameter;
    private int sisi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double diameter)
    {
        this.diameter = diameter;
    }

    public int luas(int sisi)
    {
        return sisi*sisi;
    }

    public int luas(int panjang, int lebar)
    {
        return panjang*lebar;
    }

    public double luas(double panjang, double lebar)
    {
        return (panjang*lebar)/2;
    }

    public double luas(double diameter)
    {
        double jari = diameter/2;
        return pi*(jari*jari);
    }
    //getTer
    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public int getSisi()
    {
        return sisi;
    }
    //setTer
    /*public void hslLuasPersegi()
    {
        System.out.println("Luas Persegi: " + luas(sisi));
    }

    public void hslLuasPersegiPanjang()
    {
        System.out.println("Luas Persegi Panjang: " + luas(panjang, lebar));
    }

    public void hslLuasSegitiga()
    {
        System.out.println("Luas Segitiga: " + luas(panjang, lebar));
    }

    public void hslLuasLingkaran()
    {
        System.out.println("Luas Lingkaran: " + luas(diameter));
    }*/
}