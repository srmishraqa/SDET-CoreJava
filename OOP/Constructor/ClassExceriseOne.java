package Constructor;

/*
Create a Class for BankAccount
Create fields for the account number,balance,customer name,email,phone number
Create Getters and setters for every field

Create tow additional methods
1.To allow Customer to deposit Funds (This should increment the balance field)
2.To allow customer to withdraw funds (This should be allowed only if customer has sufficient funds)

 */

public class ClassExceriseOne {

    public static void main(String[] args) {

        BankAccount soumyaAccount = new BankAccount();
        
        soumyaAccount.setAccountNumber(123456);
        soumyaAccount.setAccountBalance(10.00);
        soumyaAccount.setCustomerName("Soumya Ranjan Mishra");
        soumyaAccount.setCustomerEmailId("soumyamishra1990@gmail.com");
        soumyaAccount.setMobileNumber("(998)-099-4464");

        double currentBal = soumyaAccount.getAccountBalance();
        System.out.println(currentBal);

        soumyaAccount.withdrawFunds(10);

        soumyaAccount.depositFunds(50.00);

        currentBal = soumyaAccount.getAccountBalance();
        System.out.println(currentBal);

        soumyaAccount.withdrawFunds(100.00);
    }

}
