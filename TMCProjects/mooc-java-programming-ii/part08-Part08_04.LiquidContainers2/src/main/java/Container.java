public class Container {

    int container = 0;

    public Container () {

    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount > 0) {
            container = contains() + amount > 100
                    ? 100
                    : (container+=amount);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            container = contains() - amount < 0
                    ? 0
                    : (container-=amount);
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }
}
