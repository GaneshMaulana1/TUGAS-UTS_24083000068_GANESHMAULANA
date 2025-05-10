/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 11.78;

        // Hitung Luas //
        lingkaran.hitungLuas(r);

        // Hitung luas untuk format lainnya //
        double luas = 3.141592 * r * r;

        // Bilangan pecahan //
        System.out.println("Bilangan Pecahan: " + luas);

        // Bilangan bulat (type-casting) //
        int luasBulat = (int) luas;
        System.out.println("Bilangan Bulat: " + luasBulat);

        // Pembulatan //
        long pembulatan = Math.round(luas);
        System.out.println("Pembulatan: " + pembulatan);
    }
}

