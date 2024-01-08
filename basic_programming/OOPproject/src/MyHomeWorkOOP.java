
public class MyHomeWorkOOP {
    public static void main (String[] args) {
        SmartPhone applePhone = new SmartPhone("14 Pro Max",14,100,new String[]{"Google","Opera","Yandex","Safari"});
        applePhone.newApp = new String[]{"Whatsapp","Google","Siri","Google maps"};
        applePhone.deleteApps = new String[]{"Whatsapp","Siri","Google"};
        applePhone.setApps(applePhone.getListOfApps(), applePhone.newApp);
        applePhone.removeApps((applePhone.deleteApps));
        applePhone.showBatteryLevel(applePhone.batteryLevel);
        applePhone.updateOS(17);
        SmartPhone samsungPhone = new SmartPhone("Galaxy",17,99,new String[]{"Google","Yandex"});
        samsungPhone.showBatteryLevel(samsungPhone.batteryLevel);
        tryToCompareTwoVariables(applePhone, applePhone);

        SmartPhone Iphone = new SmartPhone("14 PRO",15,100,new String[]{"Google","Yandex"});
        SmartPhone2 xiaomi = new SmartPhone2("redmi",17,95,new String[]{"Mi Home","Qiwi"});
        SmartPhone basicPhone = new SmartPhone("Nothing Phone",12,87,new String[]{"Opera","Yandex"});
        useSmartPhone(Iphone);
        useSmartPhone(xiaomi);
        useSmartPhone(basicPhone);

        applePhone.updateOSSystem(15);





    }
    static void tryToCompareTwoVariables(SmartPhone batteryLevel, SmartPhone operationSystem){
        boolean areEquals = batteryLevel.equals(operationSystem);
        System.out.println("Variables are " + areEquals);

    }

    public static void useSmartPhone(SmartPhone simplePhone){
        System.out.println("====================================");
        simplePhone.setApps(simplePhone.getListOfApps(),new String[]{"Google","Yandex","Safari"});
        simplePhone.removeApps(new String[]{"Google","Safari"});
        simplePhone.showBatteryLevel(23);
        System.out.println("====================================");



    }
}
