public class OverrideMethod {
    public static void main(String[] args) {
        // Instantiate the subclass which overrides the parent's method
        ElectricCar tesla = new ElectricCar();
        tesla.igniteSystem();
    }
}

class Transport {
    void igniteSystem() {
        System.out.println("Starting the internal combustion engine...");
    }
}

class ElectricCar extends Transport {
    @Override
    void igniteSystem() {
        // Overriding the default behavior for an electric vehicle
        System.out.println("Booting up the electric drive unit quietly...");
    }
}