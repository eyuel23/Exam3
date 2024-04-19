package demo;

public class Main {
    public static void main(String[] args){

        Dimension dimension =  new Dimension(20, 10, 5);
        Case theCase =  new Case("v2002", "logitech", "500w", dimension);

        Resolution resolution = new Resolution(1930, 1080);
        Monitor monitor = new Monitor( resolution, "v1002", "Toshiba");

        Motherboard motherboard = new Motherboard("v1001", "Intel", 4, 2, "idk");

        PC myPC = new PC(theCase, motherboard, monitor);

        myPC.description();

        myPC.powerup( 20, 10, "blue", "intellj");




    }

}
