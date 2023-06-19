public class Ogretmen {
    
    String isim;
    String soyIsim;
    private int ogretmenNo;
    String Bolum; // --> Bölüm

    
    //Constructor
    public Ogretmen(String isim, String soyIsim, int ogretmenNo, String Bolum) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.ogretmenNo = ogretmenNo;
        this.Bolum = Bolum;
    }
    
    
    public void ogretmenBilgiGoster(){
        
        System.out.println("-------------------------------");
        System.out.println("Öğretem İsim : " + this.isim);
        System.out.println("Öğretmen Soyisim : " + this.soyIsim);
        System.out.println("Öğretmen No : " + this.ogretmenNo);
        System.out.println("Bölüm : " + this.Bolum);
        System.out.println("-------------------------------");   
    }
   
    
}
