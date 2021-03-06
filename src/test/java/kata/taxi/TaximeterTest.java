package kata.taxi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TaximeterTest {
    @Test
    public void 不大于2公里时只收起步价6元() {
        assertEquals(6, Taximeter.tick(1), 0.005);
    }

    @Test
    public void 不大于2公里时只收起步价6元_2公里() {
        assertEquals(6, Taximeter.tick(2), 0.005);
    }

    @Test
    public void 超过2公里时每公里0点8元() {
        assertEquals(6.8, Taximeter.tick(3), 0.005);
    }

    @Test
    public void 超过2公里时每公里0点8元_8公里() {
        assertEquals(10.8, Taximeter.tick(8), 0.005);
    }

    @Test
    public void 超过8公里则每公里加收百分之50长途费() {
        assertEquals(12, Taximeter.tick(9), 0.005);
    }

    @Test
    public void 停车等待时加收每分钟0点25元() {
        assertEquals(12.25, Taximeter.tick(9, 1), 0.005);
    }

    @Test
    public void 最后计价的时候司机会四舍五入只收到元_四舍() {
        assertEquals(12, TaxiDriver.fare(Taximeter.tick(9, 1)));
    }

    @Test
    public void 最后计价的时候司机会四舍五入只收到元_五入() {
        assertEquals(13, TaxiDriver.fare(Taximeter.tick(9, 2)));
    }
}
