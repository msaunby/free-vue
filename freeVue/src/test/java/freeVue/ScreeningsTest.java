package freeVue;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;

/**
 * Unit tests for Customer class.
 */
public class ScreeningsTest {

    Database db = new Database();

    @Test
    public void testGetScreenings() {
        List<Screening> screenings = db.getScreenings();
    }

}
