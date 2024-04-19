package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {
    @Test
    public void testPCConstructor(){
        Dimension dimension =  new Dimension(20, 10, 5);
        Case theCase =  new Case("v2002", "logitech", "500w", dimension);

        Resolution resolution = new Resolution(1930, 1080);
        Monitor monitor = new Monitor( resolution, "v1002", "Toshiba");

        Motherboard motherboard = new Motherboard("v1001", "Intel", 4, 2, "idk");

        PC myPC = new PC(theCase, motherboard, monitor);

        assertEquals("v2002", myPC.getTheCase().getModel());
        assertEquals("v1001", myPC.getMotherboard().getModel());
        assertEquals("v1002", myPC.getMonitor().getModel());

    }




}