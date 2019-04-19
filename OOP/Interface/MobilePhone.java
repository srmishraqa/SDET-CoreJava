package Interface;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone Powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now Dialing " + phoneNumber + " ON Mobile PHONE");
        }
        else{
            System.out.println("Mobile Phone is switched off !!");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ring Tone -- Ring RIng !!!!");
        }
        else{
            isRinging = false;
            System.out.println("either Mobile phone is not powered up or no is mismatching");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }


}
