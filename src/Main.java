import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double taksimetreTutar;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        double mesafe;

        mesafe = girdi.nextDouble();

        taksimetreTutar = 10.0 + mesafe*(2.20) ;

        double sabit=20;
        double OdenecekTutar;
        boolean sonuc = (taksimetreTutar >= 20);

        OdenecekTutar = sonuc ? taksimetreTutar : sabit;


        System.out.println("Ödemeniz gereken bakiye: " + OdenecekTutar);







    }
}