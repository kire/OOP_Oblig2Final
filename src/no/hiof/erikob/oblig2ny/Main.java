package no.hiof.erikob.oblig2ny;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Spurte Lars emil om jeg trengte 100 episoder og han sa nei. Starten er bare når jeg testet tv serier og episoder, selve oppgaven er lengere ned

        //Tv serier

        TVSerie dbz = new TVSerie("Dragonball Z", "Serien følger Goku og sønnen hans Gohan som må fighte mange bad guys", 1996);
        TVSerie pokemon = new TVSerie("Pokemon", "Serien følger Ash Sennep som skal fange bitches inni en ball", 1998);
        TVSerie seksento = new TVSerie("612", "Feteste narkisene fra Oslo", 2016);
        TVSerie office = new TVSerie("The Office", "Serien følger et papirselskap med navn Dunder Mifflin", 2005);
        TVSerie test = new TVSerie("Random tittel", "Jeg kommer ikke på noe", 1996);

        // Episoder
        Episode dbzep = new Episode(1, "Radditz skal fucke goku opp", 1, 22);
        Episode dbzep2 = new Episode(2, "Gohan fucker opp Radditz", 6, 22);

        Episode poke1 = new Episode(1,"Ash får scuffed Pikachu", 1, 13);
        Episode poke2 = new Episode(2,"Ash blir fucked av Pidgey", 1, 11);

        Episode seks12 = new Episode(1, "612 for alltid", 1, 3);
        Episode seks121 = new Episode(2, "GG Xandaler", 1, 3);

        Episode office1 = new Episode(1, "Micheal er retard", 1, 20);
        Episode office2 = new Episode(2, "Jeg vet ikke", 1, 20);


        // Denne lager 5 sesonger med 5 episoder i seg og gir spilletid et random tall. Her kunne jeg lagt til 5 tv serier og skrevet ut 20 episoder, hver men du skjønner poenget. Jeg kan fullføre hvis jeg vil
        int a;
        int b;
        for( a=1; a <= 5; a++ ){

            for ( b=1; b <= 5; b++ ){

                Random tilfeldig = new Random();
                Episode tilfeldigtall = new Episode(b, "helt random",a, tilfeldig.nextInt(11 ) + 20 );
                test.leggTilEnEpisode(tilfeldigtall);
            }
        }


        //Legger til episoder i tvseriene
        dbz.leggTilEnEpisode(dbzep);
        dbz.leggTilEnEpisode(dbzep2);


        pokemon.leggTilEnEpisode(poke1);
        pokemon.leggTilEnEpisode(poke2);


        seksento.leggTilEnEpisode(seks12);
        seksento.leggTilEnEpisode(seks121);


        office.leggTilEnEpisode(office1);
        office.leggTilEnEpisode(office2);


        // Printer ut overrida toStringen med values
        System.out.println(dbz);
        System.out.println(pokemon);
        System.out.println(test);

        // Her henter vi metoden som henter alle episoder fra sesong 4
        System.out.println(test.hentFraSesong(4));
        System.out.println("\n" + "Gjennomsnittlig spilletid for " +  test.getTittel() + " er: " + test.getGjennomsnittligSpilletid() + " minutter");





    }





}
