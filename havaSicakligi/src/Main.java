import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner sicaklik = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        heat = sicaklik.nextInt();

        if(heat < 5){
            System.out.println("Hava kayak yapmak için mükemmel");
        } else if (heat <= 25) {
            if(heat <= 15){
                System.out.println("Tam sinemalık hava");
            }
            if(heat >= 10){
                System.out.println("Bizi bu havalar mahvedecek, haydi pikniğe");
            }
        }else {
            System.out.println("Hararetimizi ancak çay alır, haydi yüzmeye");
        }
    }
}