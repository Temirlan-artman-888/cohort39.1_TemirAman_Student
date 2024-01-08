import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartPhone extends SmartPhoneUpdate{
    public String model;
    public int operationSystem;
    public int batteryLevel;
    private String[] listOfApps;
    public String[] newApp;
    public String[] deleteApps;

     public SmartPhone(String model, int operationSystem, int batteryLevel, String[] listOfApps){
       this.model = model;
       this.operationSystem = operationSystem;
       this.batteryLevel = batteryLevel;
       this.listOfApps = listOfApps;
    }
    public String[]getListOfApps(){
         return listOfApps;
    }
    public void setApps(String[] listOfApps, String[] additionalApp){
         String[] combinedApps = Arrays.copyOf(listOfApps,listOfApps.length + additionalApp.length);
         System.arraycopy(additionalApp,0,combinedApps,listOfApps.length,additionalApp.length);
        this.listOfApps = combinedApps;
        for (String apps: combinedApps){
            System.out.println("The installed app is " + apps);
         }
    }

    public void removeApps(String[] deleteApps){
        List<String> appsList = new ArrayList<>(Arrays.asList(listOfApps));
        appsList.removeAll(Arrays.asList(deleteApps));
        this.listOfApps = appsList.toArray(new String[0]);
        System.out.println("Removed apps " + Arrays.toString(deleteApps));
        System.out.println("Saved apps " + appsList);
    }

    public void showBatteryLevel (int batteryLevel){
        System.out.println("The level of battery is " + batteryLevel + "%");
    }
    public int getOperationSystem(){
         return operationSystem;
    }
    public void updateOS (int operationSystem){
        if (operationSystem <= 14){
            System.out.println("The inquiry can not be applied due to the older version");

        }else{
            System.out.println("The new IOS was successfully installed " + operationSystem);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return operationSystem == that.operationSystem && batteryLevel == that.batteryLevel;
    }

    @Override
    public void updateOSSystem(int newIOS) {
        if (this.operationSystem <= 14){
            System.out.println("The inquiry can not be applied due to the older version");

        }else{
            System.out.println("The new IOS was successfully installed " + this.operationSystem);
        }
    }
}
