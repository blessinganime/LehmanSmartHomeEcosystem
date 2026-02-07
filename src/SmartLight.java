public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness;

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    void performSelfDiagnostic() {

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

    public void setLevel(int level){
        if(!isOn){
            System.out.println("Cannot adjust: Device is OFF.");
        }

        if (level < 0) {
            brightness = 0;
            }
        else if (level > 100) {
            brightness = 100;
            }
        else {
                brightness = level;
            }
            System.out.println(deviceName + "brightness level is " + brightness + "%.");
        }
}


