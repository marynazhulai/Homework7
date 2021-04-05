package task4;

public class RemoteController implements Device, Volume{
    public TVDevice tvDevice;

    public RemoteController(TVDevice tvDevice){
        this.tvDevice=tvDevice;
    }

    void connectDevice (){
        if (tvDevice.isOn){
            System.out.println("Connect Device");
        }
        else
            System.out.println("Not connected");
    }


    @Override
    public void powerOn() {
        System.out.println("Remote Controller - Power on");
        this.tvDevice.powerOn();

    }

    @Override
    public void powerOff() {
        System.out.println("Remote Controller - Power off");
        boolean a = false;
        this.tvDevice.isOn = a;
        this.tvDevice.powerOff();

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Remote Controller - Set channel " + channel);
        tvDevice.setChannel(channel);
    }

    @Override
    public void currentChannel() {
        this.tvDevice.currentChannel();
    }

    @Override
    public void upVolume() {
        System.out.println("Remote Controller - Volume Up");
        this.tvDevice.upVolume();

    }

    @Override
    public void downVolume() {
        System.out.println("Remote Controller - Volume Down");
        this.tvDevice.downVolume();

    }

    @Override
    public void mute() {
        System.out.println("Remote Controller - mute");
        this.tvDevice.mute();
    }

    public boolean checkIfDeviceIsConnected(){
        if (tvDevice==null)
        {
            System.out.println("No connection");
            return true;
        }
        else
            System.out.println("Device is connected");
        return false;
    }
}