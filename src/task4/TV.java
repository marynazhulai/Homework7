package task4;

public class TV extends TVDevice{

    int volumeLevel;
    int changeNumber;

    public TV(String modelName, boolean isOn, int volumeLevel, int changeNumber) {
        super(modelName, isOn);
        this.volumeLevel = volumeLevel;
        this.changeNumber = changeNumber;
    }



    @Override
    public void powerOn() {
        if (this.isOn){
            System.out.println("TV - powerOn");
        }
        else {
            System.out.println("Check connection");
        }
    }

    @Override
    public void powerOff() {
        if (!this.isOn){
            System.out.println("TV - powerOff");
        }
        else {
            System.out.println("Check connection");
        }
    }

    @Override
    public void setChannel(int channel) {
        changeNumber=channel;
    }


    @Override
    public void currentChannel() {
        System.out.println("Current channel in TV " + changeNumber);
    }

    @Override
    public void upVolume() {
        System.out.println("TV - upVolume");
    }

    @Override
    public void downVolume() {
        System.out.println("TV - downVolume");
    }

    @Override
    public void mute() {
        System.out.println("TV - mute");

    }
}