import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> db;

    public VehicleRegistry() {
        this.db = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.db.containsKey(licensePlate)) {
            this.db.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.db.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.db.containsKey(licensePlate)) {
            this.db.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate i : this.db.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        String owner;

        for (LicensePlate i : this.db.keySet()) {
            owner = this.db.get(i);
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }

        for (String j : owners) {
            System.out.println(j);
        }
    }
}
