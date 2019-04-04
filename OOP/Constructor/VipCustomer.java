package Constructor;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String custEmailaddress;

    public VipCustomer(){
        this("Raman Raghav 2.0",999.99,"ramanraghav@email.com");
        System.out.println("Default CTC -- calling parameterized ctc with in Default ctc");
    }

    public VipCustomer(String customerName,double creditLimit,String custEmailaddress){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.custEmailaddress = custEmailaddress;
        System.out.println("Calling Parameterized ctc");

    }

    public VipCustomer(String customerName, String custEmailaddress){
        this(customerName,1099.99,custEmailaddress);
        this.customerName = customerName;
        this.custEmailaddress = custEmailaddress;
        System.out.println("Partial parameterized ctc -- calling full parameterized ctc");
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustEmailaddress() {
        return custEmailaddress;
    }
}
