import java.util.Scanner;
public class ortalama{
    //iki Sayının ortalamasını bulan uygulama
    public static void main(String[] args) {
        int sayi1=0;
        Scanner klavye=new Scanner (System.in);
        System.out.println("İlk sayıyı giriniz:");
        sayi1= klavye.nextInt();
        //ilk sayıyı girdik.

        int sayi2=0;
        Scanner klavye2=new Scanner (System.in);
        System.out.println("ikinci sayıyı giriniz:");
        sayi2=klavye2.nextInt();
        //ikinci say1y1 girdik.
        int ortalama=0;
        ortalama=(sayi1+sayi2)/2;
        System.out.println(" İki sayının ortalaması: "+ ortalama);

    }
}
