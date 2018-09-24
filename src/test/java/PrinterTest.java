import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(200, 100);
    }

    @Test
    public void printerHasPaper(){
        int paper = printer.getPaper();
        assertEquals(200, paper);
    }

    @Test
    public void canPrint(){
        printer.print(4, 2);
        int paper = printer.getPaper();
        assertEquals(192, paper);
    }

    @Test
    public void doesNotHaveEnoughPaper(){
        printer.print(120, 3);
        int paper = printer.getPaper();
        assertEquals(200, paper);
    }

    @Test
    public void canRefillPaper(){
        printer.refillPaper(100);
        int paper = printer.getPaper();
        assertEquals(300, paper);
    }

    @Test
    public void hasToner(){
        int toner = printer.getToner();
        assertEquals(100, toner);
    }

    @Test
    public void tonerReduces1ForEachPagePrinted(){
        printer.print(5,7);
        int toner = printer.getToner();
        assertEquals(65, toner);
    }

}
