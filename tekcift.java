import java.util.Scanner;
 
 
public class tekcift {
  
    public static void main(String[] args) {
        
        Scanner giris=new Scanner(System.in);
        int sayi;
        System.out.print("Bir tane Tam Sayı Girin :");
        sayi=giris.nextInt();
         
        if (sayi %2==0) {
            System.out.println(sayi+" Sayısı Çift Sayıdır");
             
        }
        else {
        System.out.println(sayi+" Sayısı Tek Sayıdır");
        }
    } 
}