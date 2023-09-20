import java.util.Scanner;

public class NumberConversion {

     /*
    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
    kod yazınız. Google'dan dönüşümler için formülleri bulunuz.

    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km"
    yazmalıdır (sayı dinamik olacak)

    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)

    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz
    "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         */

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value you want to convert:");
        double value = scanner.nextDouble();

        System.out.println("Enter the conversion operator (miles toKm, seconds toHours, fahrenheitanCelsius):");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "mildenKme":
                result = value * 1.60934;
                System.out.println(result + " km");
                break;
            case "second to hour":
                result = value / 3600;
                System.out.println(result);
                break;
            case "fahrenhaytdanSantigrata":
                result = (value - 32) * 5 / 9;
                System.out.println(result + " santigrat");
                break;
            default:
                System.out.println("You entered an invalid operator");
        }




        System.out.print("enter an integer");
        int number = scanner.nextInt();

        boolean isItPrime = true;

        if (number <= 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isItPrime = false;
                    break;
                }
            }
        }

        if (isItPrime) {
            System.out.println(number + "Prime number");
        } else {
            System.out.println(number + "not prime number");
        }


    }

}
