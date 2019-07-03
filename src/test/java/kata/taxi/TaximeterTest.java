package kata.taxi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TaximeterTest {
    @Test
    public void 不大于2公里时只收起步价6元()
    {
        assertEquals(6, Taximeter.tick(1), 0.005);
    }
}
