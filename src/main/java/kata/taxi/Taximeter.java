package kata.taxi;

public class Taximeter {

    public static final int INITIAL_CHARGE_DISTANCE = 2;
    public static final int INITIAL_CHARGE = 6;

    public static double tick(double distance) {
        if (distance <= INITIAL_CHARGE_DISTANCE) {
            return INITIAL_CHARGE;
        }
        if (distance <= 8) {
            return INITIAL_CHARGE + 0.8 * (distance - INITIAL_CHARGE_DISTANCE);
        }
        return INITIAL_CHARGE + 0.8 * (8 - INITIAL_CHARGE_DISTANCE) + 0.8 * (distance - 8) * 1.5;
    }
}
