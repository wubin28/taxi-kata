package kata.taxi;

public class Taximeter {
    public static double tick(double distance) {
        if (distance <= 2) {
            return 6;
        }
        return 0.8 * (distance - 2) + 6;
    }
}
