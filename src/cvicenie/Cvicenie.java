package cvicenie;

public class Cvicenie {

    public static void main(String[] args) {

        Osoba jano = new Osoba("Jano", "Bratislava");
        Osoba fero = new Osoba("Fero", "Humenne");
        Pes dunco = new Pes("Dunco", 4);
        Pes punto = new Pes("Punto", 8);
        Buda drevenaChata = new Buda("drevena chata");
        
        
        fero.pes = punto;
        punto.buda = drevenaChata;
        fero.pes.buda = drevenaChata;
        //fero.pes.buda = drevenaChata;

        System.out.println(fero);
        System.out.println(punto);

    }
}
