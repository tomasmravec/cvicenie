package prvypriklad;

import java.util.Scanner;

public class PrvyPriklad {

    public static void main(String[] args) {
       
        int[] cisla;
        String[] hodnoty;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej èísla pro seøazení (oddìlená èárkou):");
        String zadanyRetezec = scanner.nextLine();
        
        hodnoty = zadanyRetezec.split(",");
        
        cisla = new int[hodnoty.length];
        int index = 0;
        for (String string : hodnoty) {
            string = string.trim();
            cisla[index] = Integer.parseInt(string);
            index++;
        }
        int temp, min;
        for (int i = 0; i < (cisla.length - 1); i++) {
            min = cisla.length - 1;            
            for (int j = i; j < (cisla.length - 1); j++)
            if (cisla[min] > cisla[j])
                min = j;            
            temp = cisla[min];
            cisla[min] = cisla[i];
            cisla[i] = temp;
        }
        String[] ulozeneHodnoty = new String[cisla.length];
        for (int i = 0; i < cisla.length; i++) {
            ulozeneHodnoty[i] = Integer.toString(cisla[i]);
        }
        String vysledok = String.join(", ", ulozeneHodnoty);
        System.out.println("Seøazená èísla:\n" + vysledok);
    }   
}
