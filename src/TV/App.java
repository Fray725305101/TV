package TV;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main (String[] args) {

        //Часть значений сгенерим, часть введём руками
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Опишите телевизор в гостиной");
        //Дабы не множить сущности, выносим определение аргументов в отдельные методы
        String manufacturer = manufacturer(scanner);
        int diagonal = diagonal(random);
        String color = color(random);

        TV tv_living_room = new TV(color, diagonal, manufacturer); //Определяем состояние экземпляра

        if (tv_living_room.isItBigTV()) { //Ну надо же где-то использовать этот метод, зря я его что ли писал :-)
            System.out.println("У вас большой телевизор в гостиной!");
        }

        String channel = channel(scanner);
        if (channel.isEmpty()) {
            tv_living_room.isWork(false);
        } else {
            int channel_int = Integer.parseInt(channel);
            tv_living_room.isWork(channel_int);
        }

        System.out.println();
        System.out.println("Теперь опишите телевизор в спальне");
        //Переопределяем переменные
        manufacturer = manufacturer(scanner);
        diagonal = diagonal(random);
        color = color(random);

        TV tv_bedroom = new TV(color, diagonal, manufacturer); //Создаём новый экземпляр того же класса

        //Ниже всё по аналогии, но с другим экземпляром

        if (tv_bedroom.isItBigTV()) {
            System.out.println("У вас большой телевизор в спальне!");
        }

        channel = channel(scanner);
        if (channel.isEmpty()) {
            tv_bedroom.isWork(false);
        } else {
            int channel_int = Integer.parseInt(channel);
            tv_bedroom.isWork(channel_int);
        }
    }

    public static String manufacturer(Scanner scanner) {
        System.out.print("Введите производителя телевизора: ");
        return scanner.nextLine();
    }

    public static int diagonal(Random random) {
        int[] diagonalArr = {43, 50, 55, 60, 65, 70, 75, 80, 95, 110};
        int diagonalIdx = random.nextInt(9);
        int diagonal = diagonalArr[diagonalIdx];
        System.out.println("Диагональ телевизора (сгенерировано): "+diagonal);
        return diagonal;
    }

    public static String color(Random random) {
        String[] colorArr = {"белый", "черный", "серый", "сюзюлевый"};
        int colorIdx = random.nextInt(3);
        String color = colorArr[colorIdx];
        System.out.println("Цвет телевизора (сгенерировано): "+color);
        return color;
    }

    public static String channel(Scanner scanner) {
        System.out.print("Какой канал сейчас включен? Если телевизор выключен, то нажмите Ввод: ");
        return scanner.nextLine();
    }
}
