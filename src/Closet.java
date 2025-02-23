// Abstract class Closet
abstract class Closet extends Furniture implements Openable, Assemble {
    @Override
    public void assemble() {
        System.out.println("Closet assembled.");
    }

    @Override
    public void open() {
        System.out.println("Closet opened.");
    }

    @Override
    public void close() {
        System.out.println("Closet closed.");
    }

    @Override
    public String toString() {
        return "This is a closet.";
    }
}
