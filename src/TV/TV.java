package TV;

public class TV {
    String color;
    int diagonal;
    String manufacturer;
    boolean condition;
    int channel;

    public void isWork(String col, String m, int d, boolean cond) {
        color = col;
        manufacturer = m;
        diagonal = d;
        condition = cond;
        if (condition) {
            System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" включен");
        } else {
            System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" выключен");
        }
    }

    public void isWork(String col, String m, int d, int c) {
        color = col;
        manufacturer = m;
        diagonal = d;
        channel = c;
        System.out.println("Ваш " + color + " телевизор " + manufacturer + " " + diagonal + "\" показывает канал " + channel);
    }

    public boolean isItBigTV(int d) {
        diagonal = d;
        return diagonal >= 65;
    }




}
