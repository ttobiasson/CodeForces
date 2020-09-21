import java.util.ArrayList;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer(){
        this("NaN", 100, "default@example.com");
    }
    public VIPCustomer(String name, int creditLimit){
        this(name, creditLimit, "default@example.com");
    }
    public VIPCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
