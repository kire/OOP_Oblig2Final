package no.hiof.erikob.oblig2ny;

public class Episode {
    private int episodeNummer;
    private String episodeTittel;
    private int Sesong;
    private double spilletid; // Lagt opp i minutter

    public Episode(int episodeNummer, String episodeTittel, int sesong, double spilletid) {
        this.episodeNummer = episodeNummer;
        this.episodeTittel = episodeTittel;
        this.Sesong = sesong;
        this.spilletid = spilletid;
    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public String getEpisodeTittel() {
        return episodeTittel;
    }

    public int getSesong() {
        return Sesong;
    }

    public double getSpilletid() {
        return spilletid;
    }

    @Override
    public String toString() {
        return "\n" + "Episode " + episodeNummer + " |" + " Sesong " + Sesong + " |" + " Tittel: " + episodeTittel + " |" + " Spilletid: " + spilletid + " minutter";
    }

}
