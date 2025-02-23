abstract class Furniture {
    // Abstract method that subclasses must implement
    public abstract double cost();

    @Override
    public String toString() {
        return "This is a piece of furniture.";
    }
}
