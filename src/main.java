import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        /*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
         yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         Örnek
         Basamak Sayısı : 10

         *******************
          *****************
           ***************
            *************
             ***********
              *********
               *******
                *****
                 ***
                  *
         */

        int basamak;

        Scanner inp = new Scanner(System.in);

        System.out.println("Basamak sayisini giriniz = ");

        basamak = inp.nextInt();

        for (int i=basamak;i>0;i--){
            for (int j=basamak-i;j>0;j--){
                System.out.print(" ");
            }

            for (int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }






    }
}
