package TV;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Опишите телевизор в гостиной");
        String manufacturer = manufacturer(scanner);
        int diagonal = diagonal(random);
        String color = color(random);

        TV tv_lr = new TV(color, diagonal, manufacturer);

        if (tv_lr.isItBigTV()) {
            System.out.println("У вас большой телевизор в гостиной!");
        }

        String channel = channel(scanner);
        if (channel.isEmpty()) {
            tv_lr.isWork(false);
        } else {
            int channel_int = Integer.parseInt(channel);
            tv_lr.isWork(channel_int);
        }

        System.out.println("Теперь опишите телевизор в спальне");
        manufacturer = manufacturer(scanner);
        diagonal = diagonal(random);
        color = color(random);

        TV tv_br = new TV(color, diagonal, manufacturer);

        if (tv_br.isItBigTV()) {
            System.out.println("У вас большой телевизор в спальне!");
        }

        channel = channel(scanner);
        if (channel.isEmpty()) {
            tv_lr.isWork(false);
        } else {
            int channel_int = Integer.parseInt(channel);
            tv_lr.isWork(channel_int);
        }
    }

    public static String manufacturer(Scanner scanner) {
        System.out.print("Введите производителя телевизора: ");
        String manufacturer = scanner.nextLine();
        return manufacturer;
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
        String channel = scanner.nextLine();
        return channel;
    }
}
