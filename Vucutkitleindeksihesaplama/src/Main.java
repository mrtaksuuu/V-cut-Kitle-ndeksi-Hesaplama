import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kılo;
        double boy, vkı;
        Scanner kb = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = kb.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kılo = kb.nextInt();
        vkı = kılo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:" + vkı);



    }
}
