package TV;

public class TV {
    //Блок параметров
    private String color;
    private int diagonal;
    private String manufacturer;

    //Конструктор
    public TV(String col, int d, String m) {
        color = col;
        diagonal = d;
        manufacturer = m;
    }

    public void isWork(boolean condition) {
        if (condition) {
            System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" включен");
        } else {
            System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" выключен");
        }
    }

    public void isWork(int channel) {
        System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" показывает канал " + channel);
    }

    public boolean isItBigTV() {
        return diagonal >= 65;
    }
}
