package Interface;

public interface ITelephone {

    //We will just define the methods
    //Those class which will implement the interface needs to implement the methods and override is mandatory

    //methods -- only definition/Signature - not full methods
    //we are only defining the return type and the parameters and we are not defining the operation of the methods
    //The Class implements this interface has to implement the methods we have defined over here and they have to provide the implementation

    //We don't need access specifier for the interface methods

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();

}
