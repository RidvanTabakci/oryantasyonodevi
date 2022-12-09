
import java.util.*;
public class negatif_pozitif {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int sayi = reader.nextInt();
        if(sayi<0) {

            System.out.println(sayi+" sayısı negatiftir.");

        }else if (sayi==0){
            System.out.println(sayi+" sayısı 0'a eşittir");

        }else{
            System.out.println(sayi+" sayısı pozitiftir.");

        }

    }
}