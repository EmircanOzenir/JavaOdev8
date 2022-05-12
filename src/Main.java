import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2, select, toplam, cikarim, carpim, istisna;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz: ");
        select = input.nextInt();
        istisna = (n2==0)?11:10;
        toplam = (n1+n2);
        cikarim = (n1-n2);
        carpim = (n1*n2);

        switch (select) {
            case 1:
                System.out.print("Toplama Isleminizin Sonucu: " + toplam);
                break;
            case 2:
                System.out.print("Cikarma Isleminizin Sonucu: " +cikarim);
                break;
            case 3:
                System.out.print("Carpma Isleminizin Sonucu: " +carpim);
                break;
            case 4:
                switch (istisna) {
                    case 11:
                        System.out.print("Bir Sayi 0'a Bolunemez!");
                        break;
                    case 10:
                        System.out.print("Bolme Isleminizin Sonucu: " +(n1/n2));
                        break;
                }
                break;
            default:
                System.out.print("Hatali Giris Gerceklestirdiniz.");

        }
    }
}
