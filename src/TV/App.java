package TV;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String manufacturer = manufacturer(scanner);
        int diagonal = diagonal(random);
        String color = color(scanner);

        TV tv_lr = new TV(color, diagonal, manufacturer);

        if (tv_lr.isItBigTV()) {
            System.out.println("У вас большой телевизор!");
        }

        System.out.print("Какой канал сейчас включен? Если телевизор выключен, то нажмите Ввод: ");
        String channel = scanner.nextLine();

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

    public static String color(Scanner scanner) {
        System.out.print("Введите цвет телевизора: ");
        String color = scanner.nextLine();
        return color;
    }
}
