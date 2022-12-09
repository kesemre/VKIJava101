import java.util.Scanner;
public class VKI_Java101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vki,boy,kilo;
        System.out.print("lütfen boyunuzu giriniz");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz");
        kilo = input.nextDouble();
        vki = kilo/(boy*boy);
        System.out.print("Vucüt kitke indeksiniz " + vki);
    }
}
