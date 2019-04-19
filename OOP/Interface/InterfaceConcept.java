package Interface;

public class InterfaceConcept {

    /*
    Interface defines particular method
    a class Implements Interface and
    Interface is completely abstract -- there will be no lines of code in the methods of Interface

    Idea of Interface - is to provide common behaviour that can be used by several classes and all implements to the same Interface
    A class implementing an interface can't change the method signature and the variables defined in the interface will work as constant and will not change
    So NO Breaking of Code

    multiple inheritance - works if a class implements several interfaces
     */

    public static void main(String[] args) {
        //Dynamic Polymorphism
        ITelephone soumyaPhone = new DeskPhone(4464);

        soumyaPhone.powerOn();
        boolean flag = soumyaPhone.isRinging();
        System.out.println(flag);
        soumyaPhone.callPhone(4464);
        flag = soumyaPhone.isRinging();
        System.out.println(flag);
        soumyaPhone.answer();
        flag = soumyaPhone.isRinging();
        System.out.println(flag);

        soumyaPhone = new MobilePhone(4464);
        soumyaPhone.dial(1234);
        soumyaPhone.callPhone(4464);

        soumyaPhone.powerOn();
        soumyaPhone.dial(1234);
        soumyaPhone.callPhone(1234);
        soumyaPhone.callPhone(4464);


    }

}


