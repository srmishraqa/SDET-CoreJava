package Constructor;

/*
Create a new Class VipCustomer
It should have 3 fields name,credit limit and email address
create 3 ctc
1st ctc -- empty should call the ctc with 3 values
2nd ctc -- pass two values and add default for 3rd one
3rd ctc -- should have all fields
create getters only using - inellliJ
test and confirm it works
 */

public class ConstructorChallenge {

    public static void main(String[] args) {

        VipCustomer cust_1 = new VipCustomer();
        System.out.println("Customer name is "+cust_1.getCustomerName());
        System.out.println("Customer Credit Limit is "+cust_1.getCreditLimit());
        System.out.println("Customer Email address is "+cust_1.getCustEmailaddress());

        System.out.println("---------------------------------------------------------");

        VipCustomer cust_2 = new VipCustomer("Raja Hassan Ali","raja.hassan.ali@email.com");
        System.out.println("Customer name is "+cust_2.getCustomerName());
        System.out.println("Customer Credit Limit is "+cust_2.getCreditLimit());
        System.out.println("Customer Email address is "+cust_2.getCustEmailaddress());

        System.out.println("---------------------------------------------------------");

        VipCustomer cust_3 = new VipCustomer("Daniel Christian",1111.00,"dan.chris@email.com");
        System.out.println("Customer name is "+cust_3.getCustomerName());
        System.out.println("Customer Credit Limit is "+cust_3.getCreditLimit());
        System.out.println("Customer Email address is "+cust_3.getCustEmailaddress());
    }

}
