
public class Films {
    private String filmadi;
    private String filmtürü;
    private String filmyonetmeni;
    private String filmseansi;
    private String filmid;

    public Films(String filmadi, String filmtürü, String filmyonetmeni, String filmseansi, String filmid) {
        this.filmadi = filmadi;
        this.filmtürü = filmtürü;
        this.filmyonetmeni = filmyonetmeni;
        this.filmseansi = filmseansi;
        
        this.filmid = filmid;
    }

    public String getFilmadi() {
        return filmadi;
    }

    public void setFilmadi(String filmadi) {
        this.filmadi = filmadi;
    }

    public String getFilmtürü() {
        return filmtürü;
    }

    public void setFilmtürü(String filmtürü) {
        this.filmtürü = filmtürü;
    }

    public String getFilmyonetmeni() {
        return filmyonetmeni;
    }

    public void setFilmyonetmeni(String filmyonetmeni) {
        this.filmyonetmeni = filmyonetmeni;
    }

    public String getFilmseansi() {
        return filmseansi;
    }

    public void setFilmseansi(String filmseansi) {
        this.filmseansi = filmseansi;
    }

    public String getFilmid() {
        return filmid;
    }

    public void setFilmid(String filmid) {
        this.filmid = filmid;
    }

}