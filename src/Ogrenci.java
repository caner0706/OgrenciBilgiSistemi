public class Ogrenci {
    
    private String isim;
    private String soyisim;
    private int ogrenciNo;
    private Ders matematik;
    private Ders fizik;
    private Ders kimya;
    private double ortalama;

    
    //Constructor
    public Ogrenci(String isim, String soyisim, int ogrenciNo, Ders matematik, Ders fizik, Ders kimya) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.ogrenciNo = ogrenciNo;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        
    }
    
    
    
    //Öğrenci not ortalaması

    public void ortalamaHesapla(int matematik,int matematikSozlu,int fizik,int fizikSozlu, int kimya, int kimyaSozlu){
        
        int matematikOrtalama = (int) ((matematik * 0.8 ) + (matematikSozlu * 0.2));
        int fizikOrtalama = (int) ((fizik * 0.8 ) + (fizikSozlu * 0.2));
        int kimyaOrtalama = (int) ((kimya * 0.8 ) + (kimyaSozlu * 0.2));
        ortalama = (matematikOrtalama + fizikOrtalama + kimyaOrtalama)/ 3;
       
        System.out.println("-------------------------------");
        System.out.println("Öğrencinin Ortalaması : " + ortalama);
        System.out.println(ogrenciNo + "'lu Öğrencinin Dönem Notları ");
        System.out.println("Matematik : " + matematikOrtalama);
        System.out.println("Fizik : " + fizikOrtalama);
        System.out.println("Kimya : " + kimyaOrtalama);
        System.out.println("-------------------------------");
                
        if(ortalama > 50){
            System.out.println("Sınıfı Geçti...");
        }
        else{
            System.out.println("Sınıfı Geçemedi...");
        }
        
    }
    
    
    
    
}
