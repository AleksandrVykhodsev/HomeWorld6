public class Main {
    public static void main(String[] args) {
        //Задание 1/1
        System.out.println("Задание 1/1 !!!");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 1/2
        System.out.println("Задание 1/2 !!!");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 1/3
        System.out.println("Задание 1/3 !!!");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 1/4
        System.out.println("Задание 1/4 !!!");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
        //Задание 2/1
        System.out.println("Задание 2/1 !!!");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        //Задание 2/2
        System.out.println("Задание 2/2 !!!");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //Задание 2/3
        System.out.println("Задание 2/3 !!!");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //Задание 3/1
        System.out.println("Задание 3/1 !!!");
        int amountPerMonth = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + amountPerMonth;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей.");
        }
        //Задание 3/2
        System.out.println("Задание 3/2 !!!");
        int amountPerMonth1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + amountPerMonth1;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println("Спасибо за проверку!!!");
    }
}