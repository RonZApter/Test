// Concrete Closet subclasses
class Wardrobe extends Closet {
    @Override
    public double cost() {
        return 500.0;
    }

    @Override
    public String toString() {
        return "Wardrobe";
    }
}
