public class MethodOver {
    public static void main(String[] args) {
        UserAccount account = new UserAccount();
        
        // Calling overloaded methods with different parameter sets
        account.configureAccount("Alexander", 5501);
        System.out.println("---");
        account.configureAccount("Alexander", 5501, "alex.dev@example.com");
    }
}

class UserAccount {
    // Basic account configuration
    void configureAccount(String displayName, int accountCode) {
        System.out.println("Display Name: " + displayName);
        System.out.println("Account Code: " + accountCode);
    }

    // Extended account configuration with contact details
    void configureAccount(String displayName, int accountCode, String contactEmail) {
        System.out.println("Display Name: " + displayName);
        System.out.println("Account Code: " + accountCode);
        System.out.println("Contact Email: " + contactEmail);
    }
}