package cvicenie;

public class Pes {

    private String menoPsa;

    private int vekPsa;
    
    public Buda buda;

    public Pes(String menoPsa, int vekPsa) {
        this.menoPsa = menoPsa;
        this.vekPsa = vekPsa;
    }

    @Override
    public String toString() {
        String a;
        if (vekPsa == 1) {
            a = String.format("%s - %d rok", menoPsa, vekPsa);
        } else if (vekPsa > 1 && vekPsa < 5) {
            a = String.format("%s - %d roky", menoPsa, vekPsa);
        } else {
            a = String.format("%s - %d rokov", menoPsa, vekPsa);
        }
        return String.format(a);
    }
}
