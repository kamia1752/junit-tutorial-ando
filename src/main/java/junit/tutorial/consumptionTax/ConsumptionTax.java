package junit.tutorial.consumptionTax;

public class ConsumptionTax {
    private int rate;

    public ConsumptionTax(int rate) {
        this.rate = rate;
    }

    public int apply(int value) {
        return (int) (value * (rate * 0.01) + value);
    }
}
