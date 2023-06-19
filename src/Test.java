
import java.util.Scanner;

public class Test {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        
        Ogretmen ogretmen1 = new Ogretmen("Mahmut","Şeker",1234567890,"Matematik");
        ogretmen1.ogretmenBilgiGoster();
        
        Ogretmen ogretmen2 = new Ogretmen("Ayla","Durmaz",1234567891,"Fizik");
        ogretmen2.ogretmenBilgiGoster();
        
        Ogretmen ogretmen3 = new Ogretmen("Abdullah","Süren",1234567891,"Kimya");
        ogretmen3.ogretmenBilgiGoster();
        
        Ders matematik = new Ders("Matematik","MAT101");
        matematik.ogretmenEkle(ogretmen1);
        
        Ders fizik = new Ders("Fizik","FZK101");
        fizik.ogretmenEkle(ogretmen2);
        
        Ders kimya = new Ders("Kimya","KMY101");
        kimya.ogretmenEkle(ogretmen3);
        
        Ogrenci ogrenci1 = new Ogrenci("Ali","Bulut",210542001,matematik,fizik,kimya);
        ogrenci1.ortalamaHesapla(90, 90, 90, 90, 90, 90);
        
        
        
        Ogrenci ogrenci2 = new Ogrenci("Turhan","Göksu",210542002,matematik,fizik,kimya);
        ogrenci2.ortalamaHesapla(12, 35, 89, 100, 100, 80);
        
        
        Ogrenci ogrenci3 = new Ogrenci("Taha","Alkan",210542003,matematik,fizik,kimya);
        ogrenci3.ortalamaHesapla(60, 65, 72, 34, 34, 44);
        
        
    }
    
}
