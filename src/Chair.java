abstract class Chair extends Furniture implements Foldable {
    public abstract int kgResistance();

    @Override
    public String toString() {
        return "This is a chair.";
    }
}