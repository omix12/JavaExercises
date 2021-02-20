import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> allDebts;

    public IOU() {
        this.allDebts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.allDebts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.allDebts.getOrDefault(toWhom, 0.0);
    }

}
