
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         double armut = 2.14, elma= 3.67,domates = 1.11,muz = 0.95,patlıcan= 5.00;
         double kg,toplamtutar;
         int islem=0;
        Scanner input = new Scanner(System.in);
        System.out.println("******************Manav Kasa Programına Hoşgeldiniz!!**********************");
        System.out.println("1.Armut");
        System.out.println("2.Elma");
        System.out.println("3.Domates");
        System.out.println("4.Muz");
        System.out.println("5.Patlıcan");
        System.out.print("Almak istediğiniz ürünü seçiniz: ");
        islem = input.nextInt();
        System.out.print(" Kg giriniz: ");
        kg=input.nextDouble();
        switch(islem){
            case 1:
                 toplamtutar = kg*armut;
                System.out.print("Ödeyeceğiniz tutar: " +toplamtutar);
                break;
            case 2:
                 toplamtutar = kg*elma;
                System.out.print("Ödeyeceğiniz tutar: " +toplamtutar);
                break;
            case 3:
               toplamtutar = kg*domates;
                System.out.print("Ödeyeceğiniz tutar: " +toplamtutar);
                break;
            case 4:
                toplamtutar = kg*muz;
                System.out.print("Ödeyeceğiniz tutar: " +toplamtutar);
                break;
            case 5:
                 toplamtutar = kg*patlıcan;
                System.out.print("Ödeyeceğiniz tutar: " +toplamtutar);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız!");
                break;
        }



    }
}