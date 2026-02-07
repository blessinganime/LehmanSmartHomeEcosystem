public abstract class SmartDevice implements Powerable{
    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
        this.isOn = false;
    }

    static int activeDeviceCount = 0;

    abstract void performSelfDiagnostic();

}
