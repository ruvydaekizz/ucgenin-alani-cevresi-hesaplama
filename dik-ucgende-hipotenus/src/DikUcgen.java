import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
       /*
       Dik Üçgen Alan= (a+b)/2;
       Hipotenüs Formül = c2=a2+b2;  --- cnin karesininin gitmesi için karekökünü alırız  Math.sqrt ile
       */


        //değişkenlerimizi oluşturalım
        int a, b;
        double c;

        //kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);

        System.out.print("a değerini giriniz:");
        a= girdi.nextInt();
        System.out.print("b değerini giriniz:");
        b= girdi.nextInt();

        double alan= (a*b) /2;   //dik üçgen ALAN formülü
        System.out.println("Alan: " + alan);

        c= Math.sqrt((a*a) +(b*b) );       //Hipotenüs hesaplama
        System.out.println("Hipotenüs: "+ c );


        System.out.println("------------------------------------------------------------");
        /*
        ÖDEV
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                    𝑢 = (a+b+c) / 2
          Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        // Değişkenleri tanımlama
        double kenar1, kenar2, kenar3;

        // Kullanıcıdan veri alma
        System.out.print("Kenar1: ");
        kenar1= girdi.nextDouble();

        System.out.print("Kenar2: ");
        kenar2=girdi.nextDouble();

        System.out.print("Kenar3: ");
        kenar3=girdi.nextDouble();

        double dikalan= (kenar1+kenar2) / 2;                  //Dik Üçgen alanını hesaplama
        System.out.println("Dik Üçgen Alanı :" + dikalan);

    
        double cevre= (kenar1+kenar2+kenar3) / 2;          //Üçgenin Çevresi  =2u =a+b+c  , u=(a+b+c)/2
        System.out.println("Üçgenin Çevresi: " + cevre);


        double alan2= Math.sqrt(cevre * (cevre-kenar1) * (cevre-kenar2) * (cevre-kenar3));  //Üçgenin alanı -----alanın karekökünü aldık
        System.out.println("Üçgenin Alanı: " + alan2);
























    }
}
