import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> unit = contents(storageUnit);
        if(!unit.isEmpty()) {
            unit.remove(item);
            if(unit.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        for (String key : this.storage.keySet()) {
            if(!this.storage.get(key).isEmpty()) {
                result.add(key);
            }
        }

        return result;
    }

}
