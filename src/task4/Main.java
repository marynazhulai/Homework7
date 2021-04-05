package task4;

public class Main {

    public static void main(String[] args) {

        TVDevice tvdev = new TV("TV", true, 10, 5);
        RemoteController rem = new RemoteController(tvdev);
        rem.connectDevice();
        rem.checkIfDeviceIsConnected();
        rem.powerOn();
        rem.upVolume();


        System.out.println("--------------------");

        rem.currentChannel();
        rem.setChannel(100);
        rem.currentChannel();

        System.out.println("**********************");
        rem.downVolume();
        rem.mute();
        rem.powerOff();

















    }
}