public class SmartThermostat extends SmartDevice implements Adjustable{
    private int temperature;

    public SmartThermostat(String deviceName){
        super(deviceName);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {// to turn the light on the light have to be off
        if (!isOn) {// if smart light is not on then set it to tru to turn on
            isOn = true;
            activeDeviceCount++;
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            activeDeviceCount--;
        }
    }

    @Override
    public void setLevel(int level) {
        if(!isOn){
            System.out.println("Cannot adjust: Device is OFF.");
        }

        temperature = level;
        System.out.println(deviceName + "temperature is set to " + temperature + "c");
    }


    @Override
    void performSelfDiagnostic() {
    }
}
