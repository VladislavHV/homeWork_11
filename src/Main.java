import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    //Задание №1

    public static void calculationLeapYear (int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Задание №2

    public static void installationOperatingSystem (byte version, short year){
        if (version == 0 && year < 2015) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (version == 1 && year < 2015) {
            System.out.println("Установите облегченную версию для Android");
        } else if (version == 1 && year >= 2015) {
            System.out.println("Установите обычную версию для Android");
        } else if (version == 0 && year >= 2015) {
            System.out.println("Установите обычную версию для iOS");
        }
    }

    //Задание №3

    public static String deliveryBankCard (byte deliveryDistance) {
        if (deliveryDistance < 20) {
            return ("Потребуется дней " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return ("Потребуется дней " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return ("Потребуется дней " + 3);
        } else {
            return ("Доставки нет");
        }
    }


    public static void main(String[] args) {
        /*
        Реализуйте метод, который получает в качестве параметра год, проверяет, является
        ли он високосным, и выводит результат в консоль.
        Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
        «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
         */

        System.out.println("Задача №1");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        calculationLeapYear(year);

        /*
        Напишите метод, куда подаются два параметра: тип операционной системы
        (0 — iOS, 1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию приложения
        (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
         */

        System.out.println("Задача №2");

        byte version = 0;
        short year2 = (short) LocalDate.now().getYear();
        installationOperatingSystem(version, year2);

        /*
        Ваша задача — доработать код, а именно написать метод,
        который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
         */

        System.out.println("Задача №3");

        byte distance = 40;
        deliveryBankCard(distance);
        System.out.println(deliveryBankCard(distance));
    }
}