/*
Adım 1: Başla
Adım 2: Kullanıcıdan n sayısını al
Adım 3: int artır =1 , int toplam=0 değikenlerini tanımla
Adım 4: while dögüsü ile sayıların toplamını bul
Adım 5: toplamı ekrana yazdır.
Adım 6: Dur 
*/
package nsayisina_kadar_toplama;
import java.util.Scanner;

public class Nsayisina_kadar_toplama {

//Klavyeden alınan n sayısına kadar olan tek sayıların toplamını veren program .
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Toplanacak Olan Sayıyı Giriniz :");
        int girilen = input.nextInt();
        
        
            int artır =1;
            int toplam = 0;
  
            while (artır <= girilen) {
            toplam = toplam+artır;
            artır = artır+2;
              }   
          
        System.out.println("Sayıların toplamı :" +toplam);
        
    }
    
}
