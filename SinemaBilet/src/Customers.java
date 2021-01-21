
public class Customers{
   
    private String ad;
    private String soyad;
    private String kullaniciadi;
    private String kullanicisifre;
    private String kullanicimail;
    private String kullaniciphone;
 
    
    public Customers(String ad,String soyad,String kullaniciadi,String kullanicisifre,String kullanicimail,String kullaniciphone){
        
        this.ad=ad;
        this.soyad=soyad;
        this.kullaniciadi=kullaniciadi;
        this.kullanicisifre=kullanicisifre;
        this.kullanicimail=kullanicimail;
        this.kullaniciphone=kullaniciphone;
    }

    Customers(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the kullaniciadi
     */
    public String getKullaniciadi() {
        return kullaniciadi;
    }

    /**
     * @param kullaniciadi the kullaniciadi to set
     */
    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    /**
     * @return the kullanicisfire
     */
    public String getKullanicisifre() {
        return kullanicisifre;
    }

    /**
     * @param kullanicisfire the kullanicisfire to set
     */
    public void setKullanicisifre(String kullanicisifre) {
        this.kullanicisifre = kullanicisifre;
    }

    /**
     * @return the kullanicimail
     */
    public String getKullanicimail() {
        return kullanicimail;
    }

    /**
     * @param kullanicimail the kullanicimail to set
     */
    public void setKullanicimail(String kullanicimail) {
        this.kullanicimail = kullanicimail;
    }

    /**
     * @return the kullaniciphone
     */
    public String getKullaniciphone() {
        return kullaniciphone;
    }

    /**
     * @param kullaniciphone the kullaniciphone to set
     */
    public void setKullaniciphone(String kullaniciphone) {
        this.kullaniciphone = kullaniciphone;
    }
    
}
