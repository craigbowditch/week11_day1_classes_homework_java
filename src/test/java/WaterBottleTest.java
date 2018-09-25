import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void canDrinkOneDrink(){
        waterBottle.drink();
        int volume = waterBottle.getVolume();
        assertEquals(90, volume);
    }

    @Test
    public void canDrinkMultipleDrinks(){
        waterBottle.drink();
        waterBottle.drink();
        int volume = waterBottle.getVolume();
        assertEquals(80, volume);
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        int volume = waterBottle.getVolume();
        assertEquals(0, volume);
    }

    @Test
    public void canFillBottle(){
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }
}
