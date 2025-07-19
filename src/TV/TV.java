package TV;

public class TV {
    //Блок параметров
    private String color;
    private int diagonal;
    private String manufacturer;

    //Конструктор
    public TV(String color, int diagonal, String manufacturer) {
        this.color = color;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    //Метод для определения, включен телевизор или нет
    public void isWork(boolean condition) {
        if (!condition) {
            System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" выключен");
        }
    }

    //Перегрузка метода, показывает, какой канал включен
    public void isWork(int channel) {
        System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" включен и показывает канал " + channel);
    }

    //Метод проверки, большой телевизор или нет
    public boolean isItBigTV() {
        return diagonal >= 65;
    }
}
