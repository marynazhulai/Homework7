package task3;

public class MyDevice implements Volume, State {
    String a;

    public MyDevice(String nameOfDevice){
        this.a = nameOfDevice;
    }


    @Override
    public void changeVolume(double value) {
        if (value == 1) {
            System.out.println("Ничего не слышу, добавь еще звука");
        }
            else if (value == 2) {
                System.out.println("Нормальный звук");
            }
            else if (value == 3){
                System.out.println("Очень громко, сделай тише");
            }
            else {
                System.out.println("Что-то не так со звуком");
            }
        }

    @Override
    public void on() {
        System.out.println("Включено, но громкость 0, добавь громкость");
    }

    @Override
    public void off() {
        System.out.println("Выключено");
    }
}

