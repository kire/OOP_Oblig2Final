package no.hiof.erikob.oblig2ny;

import java.time.LocalDate;
import java.util.ArrayList;

public class TVSerie {
    private String tittel;
    private String beskrivelse;
    private int utgivelsesAar;
    private ArrayList<Episode> Episoder = new ArrayList<>();
    private int antallSesonger;
    private int gjennomsnittligSpilletid;

    //

    public TVSerie(String tittel, String beskrivelse, int utgivelsesAar) {
        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesAar = utgivelsesAar;
    }

    //Settere
    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setUtgivelsesAar(int utgivelsesAar) {
        this.utgivelsesAar = utgivelsesAar;
    }

    public void setEpisoder(ArrayList<Episode> episoder) {
        Episoder = episoder;
    }

    public void setAntallSesonger(int antallSesonger) {
        this.antallSesonger = antallSesonger;
    }


    //Gettere
    public String getTittel() {
        return tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public int getUtgivelsesAar() {
        return utgivelsesAar;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }

    public ArrayList<Episode> getEpisoder() {
        return Episoder;
    }

    public int getGjennomsnittligSpilletid() {
        return gjennomsnittligSpilletid;
    }

    // Metode som legger til episoder i en tv serie, har også en feil melding hvis episoden sin sesong er større enn antall sesonger +1 og hver gang en
    public void leggTilEnEpisode(Episode episode){
        if (episode.getSesong() > (antallSesonger +1)){
            System.out.println("Oppgave 8: Feil, ugylding sesong. Må være i rekkefølge. Denne episoden ble ikke lagt til i TVSerien: " + episode.getEpisodeTittel() +" i sesong " + episode.getSesong());
        }

        else {
            if (episode.getSesong() == (antallSesonger +1)) {
                antallSesonger += 1;
            }
                Episoder.add(episode);
            regnUtGjennomsnittligSpilletid();

        }

    }
    // Metode som henter ut episoder fra sesong x som vi må velge hva er i main. Så det x erlik blir sesong som blir tatt ut. Hadde ikke klart denne alene! teamwork makes dreamwork
    public ArrayList<Episode> hentFraSesong (int x){

        int i;

        ArrayList<Episode> episodes = new ArrayList<>();

        for ( i=0; i < Episoder.size(); i++ ){
            if ( Episoder.get(i).getSesong() == x ){
                episodes.add(Episoder.get(i));
            }
        }

        return episodes;
    }


    @Override
    public String toString() {
        return "\n" + "Serie: " + tittel + " |" + " Beskrivelse: " + beskrivelse + " |" + " Episoder: " + Episoder.size() + " | " + "Antall sesonger: " + antallSesonger + Episoder;
    }
    // Lager en metode for å regne ut gjennomsnittlig spilletid av episodene. Vi lager en som regner ut alle tilsammen (episoderlagtsammen) og så deler vi den på antall episder
    private void regnUtGjennomsnittligSpilletid(){
        int j;
        int episoderLagtSammen = 0;
        for (j=0;j< Episoder.size();j++){
            episoderLagtSammen+=Episoder.get(j).getSpilletid();
        }
        gjennomsnittligSpilletid = episoderLagtSammen/Episoder.size();
    }


}
