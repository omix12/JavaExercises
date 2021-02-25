import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;

public class ChangeHistory {

    private final ArrayList<Double> priceHistory;

    public ChangeHistory() {
        this.priceHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.priceHistory.add(status);
    }

    public void clear() {
        this.priceHistory.clear();
    }

    public double maxValue() {
        if(!this.priceHistory.isEmpty()) {
            return Collections.max(priceHistory);
        }
        return 0;
    }

    public double minValue() {
        if(!this.priceHistory.isEmpty()) {
            return Collections.min(priceHistory);
        }
        return 0;
    }

    public double average() {
        OptionalDouble average = this.priceHistory
                .stream()
                .mapToDouble(a -> a)
                .average();

        return average.orElse(0);
    }

    @Override
    public String toString() {
        return priceHistory.toString();
    }
}
