package demo;

public class PC {
    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor){
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor=monitor;
    }
    public void drawLogo(int x, int y, String color){
        monitor.drawPixel(x,y,color);
    }


    public void description() {
        System.out.println("Welcome to Worst Buy! Below is the description of the PC on sale today:");
        System.out.println("Case: Model - " + theCase.getModel() + ", Manufacturer - " + theCase.getManufacturer() + ", Power Supply - " + theCase.getPowerSupply() + ", Dimension - " + theCase.getDimension());
        System.out.println("Motherboard: Model - " + motherboard.getModel() + ", Manufacturer - " + motherboard.getManufacturer() + ", RAM Slots - " + motherboard.getRamSlots() + ", Card Slots - " + motherboard.getCardSlots() + ", BIOS - " + motherboard.getBios());
        System.out.println("Monitor: Model - " + monitor.getModel() + ", Manufacturer - " + monitor.getManufacturer() + ", Resolution - " + monitor.getResolution());
    }

    public void powerup(int x, int y, String color, String programName){
        theCase.pressPowerButton();
        drawLogo(x,y,color);
        motherboard.loadProgram(programName);
    }

    @Override
    public String toString() {
        return "PC{" +
                "theCase=" + theCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
