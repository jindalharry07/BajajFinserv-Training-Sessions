public class Inherit {
    public static void main(String[] args) {
        FeatureProcessor processor = new FeatureProcessor();
        processor.showModuleDetails();
        processor.activateCoreService();
        processor.runExtendedLogic();
    }
}

class BaseComponent {
    void showModuleDetails() {
        System.out.println("System Module: Data Processing Engine");
    }

    void activateCoreService() {
        System.out.println("Core services are now active and operational.");
    }
}

class FeatureProcessor extends BaseComponent {
    void runExtendedLogic() {
        System.out.println("Executing specialized logic for FeatureProcessor.");
    }
}