public class Container {

    int container = 0;

    public Container () {

    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount > 0) {
            container += amount;
            if ((contains() + amount > 100)) {
                container = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            container -= amount;
            if ((contains() - amount < 0)) {
                container = 0;
            }
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }
}
