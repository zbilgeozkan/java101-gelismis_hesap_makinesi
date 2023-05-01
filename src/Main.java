import java.util.Scanner;

public class Main {

    static void plus() {    // toplama işlemi
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void minus() {   // çıkarma işlemi
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void times() {   // çarpma işlemi
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void divided() {    // bölme işlemi
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz. ");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void power() {   // üs alma işlemi
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void factorial() {   // faktöriyel işlemi
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
        System.out.print("\n");
    }

    static void mod() {    // mod alma işlemi
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scan.nextInt();
        System.out.print("Mod giriniz: ");
        int m = scan.nextInt();

        while (num >= m) {
            num -= m;
        }
        System.out.println("Sonuç: " + num);
        System.out.print("\n");
    }

    static void area() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun kenarın değerini giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("Kısa kenarın değerini giriniz: ");
        int num2 = scan.nextInt();

        System.out.println("Dikdörtgenin alanı: " + (num1 * num2));
        System.out.println("Dikdörtgenin çevresi: " + (2 * (num1 + num2)));

        System.out.print("\n");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, lütfen tekrar deneyiniz. ");
            }
        } while (select != 0);
        System.out.println("Bye!");

    }
}