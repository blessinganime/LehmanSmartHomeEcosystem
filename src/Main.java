import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<SmartDevice> homeHub = new ArrayList<>();
        SmartLight livingRoom = new SmartLight("Smart light");
        SmartLight kitchen = new SmartLight("Smart Light");
        SmartThermostat Hallway = new SmartThermostat("Thermostat");

        homeHub.add(livingRoom);
        homeHub.add(kitchen);
        homeHub.add(Hallway);

        livingRoom.turnOn();
        kitchen.turnOn();

        Hallway.setLevel(50);

        for(SmartDevice tech : homeHub){
            tech.performSelfDiagnostic();
        }
    }
}
