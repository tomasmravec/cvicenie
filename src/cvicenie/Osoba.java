package cvicenie;

import java.util.Scanner;

public class Osoba {

    private String menoOsoby;

    private String bydliskoOsoby;

    public Pes pes;
    
    public Buda buda;

    public Osoba(String menoOsoby, String bydliskoOsoby) {
        this.menoOsoby = menoOsoby;
        this.bydliskoOsoby = bydliskoOsoby;
    }
    
    @Override
    public String toString() {
        return String.format("Majitel s menom %s a bydliskom %s vlastni psa %s, ktory byva v %s", menoOsoby, bydliskoOsoby, pes, buda);
    }

}
