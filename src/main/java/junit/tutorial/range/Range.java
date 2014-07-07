package junit.tutorial.range;

public class Range {
    public final double min;

    public final double max;

    public Range(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(double d) {
        if (d < min || max < d) {
            return false;
        }
        return true;
    }
}
