public class Ders {
    
    private Ogretmen dersOgretmeni;
    private String dersAdi;
    private String dersKodu;

    public Ders(String dersAdi, String dersKodu) {
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
    }
    
    
    public void ogretmenEkle(Ogretmen ogretmen){
        
        if(dersAdi.equals(ogretmen.Bolum)){
            dersOgretmeni = ogretmen;
        }
        
        else{
             System.out.println(ogretmen.isim + " "+ ogretmen.soyIsim + " Akademisyeni bu dersi veremez.");
        }
    }
    
        
}
