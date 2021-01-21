
public class Bilet {
    private String ad;
    private String soyad;
    private String koltukno;
    private String filmid;

    public Bilet(String ad, String soyad, String koltukno, String filmid) {
        this.ad = ad;
        this.soyad = soyad;
        this.koltukno = koltukno;
        this.filmid = filmid;
    }

    Bilet(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKoltukno() {
        return koltukno;
    }

    public void setKoltukno(String koltukno) {
        this.koltukno = koltukno;
    }

    public String getFilmid() {
        return filmid;
    }

    public void setFilmid(String filmid) {
        this.filmid = filmid;
    }
}
