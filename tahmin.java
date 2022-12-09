import java.util.Scanner;
import java.util.Random;

public class tahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz!");
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");

        int tahmin = input.nextInt();
         int sayac= 0;
        int sayi = rnd.nextInt(101);
        while (tahmin != sayi) {
            if(tahmin < 0 || tahmin > 100 ) {
                System.out.println("1 ile 100 arasında bir değer giriniz ☺: ");
                tahmin = input.nextInt(); }
            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ☻");
                tahmin = input.nextInt(); }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ☻");
                tahmin = input.nextInt();}
        }

        System.out.println("Tebrikler, kazandınız!♥"); }
}