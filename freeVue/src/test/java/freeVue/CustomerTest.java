package freeVue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for Customer class.
 */
public class CustomerTest {

    Customer cust = new Customer();

    @Test
    public void testRegisterGoodEmail() {
        assertTrue(cust.register("Me","me@example.com","password"));
    }

    @Test
    public void testRegisterBadEmail() {
        assertFalse(cust.register("Bad","not-an-email","password"));
    }
}
