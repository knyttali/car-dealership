package src.test;

import src.main.models.Car;
import src.main.models.Dealership;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class TestDealership {

    Dealership dealership;

    @Before
    public void setup() {
        dealership = new Dealership();
        dealership.addCar(new Car("Tesla", "Gray"));
        dealership.addCar(new Car("Volvo", "Pink"));
    }

    @Test
    public void testIfCarAdded() {
        assertTrue(dealership.contains(new Car("Tesla", "Gray")));
    }
    
    @Test
    public void testIfCarSold() {
        dealership.sellCar(dealership.getCar(0));
        assertFalse(dealership.contains(new Car("Tesla", "Gray")));
    }
}





