package Constructor;

public class ConstructorConcept {

    public static void main(String[] args) {

        //Constructor is created automatically when class is created
        //when we type new keyword with class name as a method it calls the constructor
        //example of calling ctc - new BankAccount();
        //it calls the special method present in the class
        //its purpose is to create physical object from the Class for us

        //Constructor -- always public and the method should be exactly same as Class name
        //it does not have any return type -- it has only access modifier and method name
        //no parameter -- for default ctc and it is created automatically when a class is created
        // we have created our own ctc below -- so whenever an object will be created of this class it will override the default ctc

        //new BankAccount(); executed ctc automatically
        //ctc purpose -- initialize the object we are creating
        //only ever called once -- at the time of creating object

        //4 types -- default,parameterized ctc,calling another ctc within the ctc,calling ctc with in the ctc with partial parameters

        //In ctc we should not call any setters or getters even if we can call


        BankAccount myAccount = new BankAccount();

        System.out.println("------------------------------------------------");

        System.out.println(myAccount.getAccountBalance());
        System.out.println(myAccount.getMobileNumber());
        System.out.println("------------------------------------------------");

        //calling parameterized overloaded ctc - for setting values
        BankAccount ramAccount = new BankAccount(123456, 0.00, "Ram Rao", "ram.rao@hitachi.com",
                "(998)-099-4464");
        System.out.println(ramAccount.getAccountBalance());
        System.out.println(ramAccount.getMobileNumber());
        System.out.println("------------------------------------------------");

        BankAccount timAccount = new BankAccount("Tim","tim@email.com","080-22345678");
        System.out.println(timAccount.getAccountBalance());
        System.out.println(timAccount.getMobileNumber());


    }

}
