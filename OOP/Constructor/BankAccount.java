package Constructor;

public class BankAccount {

    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailId;
    private String mobileNumber;

    //Constructor -- always public and the method should be exactly same as Class name
    //it does not have any return type -- it has only access modifier and method name
    //no parameter -- for default ctc and it is created automatically when a class is created
    // we have created our own ctc below -- so whenever an object will be created of this class it will override the default ctc

//    public BankAccount() {
//        System.out.println("Empty constructor called");
//    }

    //Overloaded constructor
    //Setting field values in the ctc instead of using setter individually
    //We just have to call the ctc while creating object and passing parameter

    public BankAccount(long accountNumber, double accountBalance, String customerName, String customerEmailId, String mobileNumber) {

        System.out.println("Account Constructor with parameter called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailId = customerEmailId;
        this.mobileNumber = mobileNumber;

    }

    //Calling another constructor with in a constructor
    //in this case whenever we create an object this default constructor will set values as in the parameter by calling
    //the parametrized ctc with in the default ctc using this keyword
    //call to this always must be the first statement with in the method
    public BankAccount() {

        this(1234567, 1.0, "Ramkanta", "ramaknta@email.com", "9980736745");
        System.out.println("Calling another constructor with in a constructor");
    }

    //Constructor - with partial parameters and setters


    public BankAccount(String customerName, String customerEmailId, String mobileNumber) {
        this(12345678,86.86,customerName,customerEmailId,mobileNumber);
        this.customerName = customerName;
        this.customerEmailId = customerEmailId;
        this.mobileNumber = mobileNumber;
        System.out.println("Constructor - with partial parameters and setters");
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;

    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;


    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmailId() {
        return this.customerEmailId;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }


    public void depositFunds(double amount) {
        if (amount > 0) {
            this.accountBalance = this.accountBalance + amount;
            System.out.println("The updated balance after depositing amount " + amount + " is " + this.accountBalance);
        } else {
            System.out.println("You can't deposit amount which is less than or equals to Zero");
        }
    }

    public void withdrawFunds(double amount) {
        if (this.accountBalance - amount < 0) {
            System.out.println("Only " + this.accountBalance + " is available.Can't process withdrawal of amount " + amount);
        } else {
            this.accountBalance = this.accountBalance - amount;
            System.out.println("The updated balance after withdrawing amount " + amount + " is " + this.accountBalance);
        }
    }


}
