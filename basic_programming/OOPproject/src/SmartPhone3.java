public class SmartPhone3 extends SmartPhone {
    public SmartPhone3(String model, int operationSystem, int batteryLevel, String[] listOfApps) {
        super(model, operationSystem, batteryLevel, listOfApps);


    }

    @Override
    public void setApps(String[] listOfApps, String[] additionalApp) {
        super.setApps(listOfApps, additionalApp);
    }

    @Override
    public void removeApps(String[] deleteApps) {
        super.removeApps(deleteApps);
    }

    @Override
    public void showBatteryLevel(int batteryLevel) {
        super.showBatteryLevel(batteryLevel);
    }
}

