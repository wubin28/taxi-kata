package kata.taxi;

public class Taximeter {

    public static final int INITIAL_CHARGE_DISTANCE = 2;
    public static final int INITIAL_CHARGE = 6;
    public static final int SURCHARGE_DISTANCE = 8;
    public static final double CHARGE_PER_KILOMETER = 0.8;
    public static final double SURCHARGE_RATE = 1.5;
    public static final double WAITING_CHARGE = 0.25;

    public static double tick(double distance) {
        if (distance <= INITIAL_CHARGE_DISTANCE) {
            return INITIAL_CHARGE;
        }
        if (distance <= SURCHARGE_DISTANCE) {
            return INITIAL_CHARGE + CHARGE_PER_KILOMETER * (distance - INITIAL_CHARGE_DISTANCE);
        }
        return INITIAL_CHARGE + CHARGE_PER_KILOMETER * (SURCHARGE_DISTANCE - INITIAL_CHARGE_DISTANCE) +
                CHARGE_PER_KILOMETER * (distance - SURCHARGE_DISTANCE) * SURCHARGE_RATE;
    }

    public static double tick(double distance, int waitingTime) {
        return tick(distance) + waitingTime * WAITING_CHARGE;
    }
}
