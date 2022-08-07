public class Main {
    public static void main(String[] args) {

        var clientOS = 1;//Задание №1
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOs=0;//Задание №2
        int clientDeviceYear=2014;
        if (clientOs==1 && clientDeviceYear>2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs==1 && clientDeviceYear<=2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (clientOs==0 && clientDeviceYear>2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs==0 && clientDeviceYear<=2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        int year=2020;//Задание №3
            boolean z = (year%4==0 && year%100!=0 || year%400==0);
        if (z) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");}

        int deliveryDistance=95;//Задание №4
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: " + " 1");
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется дней: " + " 2");
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней: " + " 3");
        }

        var deliveryDistance1=81.0;//Задание №4 (Второй вариант решения)
        var n = (deliveryDistance1 + 20) / 40;//Определяем в каком диапазоне расстояний
        // находится клиент=срок доставки в днях исходя из формулы max расстояния диапазона:
        // deliveryDistance1=(40n-20)
        System.out.println("Delivery through - "+Math.ceil(n)+" days");

        int monthNumber=9;//Задание №5
        switch (monthNumber){
            case 1,2,12:
                System.out.println("Сезон зима");
                break;
            case 3,4,5:
                System.out.println("Сезон весна");
                break;
            case 6,7,8:
                System.out.println("Сезон лето");
                break;
            case 9,10,11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Введите корректный номер месяца!");
        }

        int monthNumber1=10;//Задание №5 (Второй вариант без switch)
        if (monthNumber1==1||monthNumber1==2||monthNumber1==12){
            System.out.println("Winter month");
        } if (monthNumber1==3||monthNumber1==4||monthNumber1==5) {
            System.out.println("Spring month");
        } if (monthNumber1==6||monthNumber1==7||monthNumber1==8) {
            System.out.println("Summer month");
        } if (monthNumber1==9||monthNumber1==10||monthNumber1==11) {
            System.out.println("Autumn month");
        } else if (monthNumber1>12||monthNumber1<1) {
            System.out.println("Programm is not possible");
        }



    }

    }







