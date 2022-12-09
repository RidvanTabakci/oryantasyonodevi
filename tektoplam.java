
import java.util.Scanner;
 
 
public class tektoplam {
  
    public static void main(String[] args) {
        
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Bir Sayı Girin: ");
 
        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int n = reader.nextInt();
 
	int toplam = 0;
 
        for(int i = 1; i <=n; i++){
            if(i%2!=0){
              toplam += i;  
              //System.out.println(i);
            }          
        }
        System.out.println("Tek Sayıların Toplamı = "+ toplam);
    } 
}
