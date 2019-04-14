package composition;

//extends -- is a relationship
//has a relationship
//PC class has Case
// PC has monitor and Motherboard
// has a relationship gives more advantage
//You can inherit from Only one class at a time -- limitations
// has a relationship comprises -- other class ref as well

//composition is also creating Object within Object


public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
