public class TestPractice
{
    // Interfaces
    interface Foldable {
        void fold();
        void unfold();
    }

    interface Assemble {
        void assemble();
    }

    interface Openable {
        void open();
        void close();
    }

    // Abstract class Furniture
    abstract class Furniture {
        // Abstract method that subclasses must implement
        public abstract double cost();

        @Override
        public String toString() {
            return "This is a piece of furniture.";
        }
    }

    // Abstract class Chair
    abstract class Chair extends Furniture implements Foldable {
        public abstract int kgResistance();

        @Override
        public String toString() {
            return "This is a chair.";
        }
    }

    // Concrete Chair subclasses
    class OfficeChair extends Chair {
        @Override
        public int kgResistance() {
            return 150;
        }

        public void raiseHeadrest() {
            System.out.println("Headrest raised.");
        }

        @Override
        public double cost() {
            return 120.0;
        }

        @Override
        public void fold() {
            System.out.println("Office chair folded.");
        }

        @Override
        public void unfold() {
            System.out.println("Office chair unfolded.");
        }

        @Override
        public String toString() {
            return "Office Chair";
        }
    }

    class GardenChair extends Chair {
        @Override
        public int kgResistance() {
            return 100;
        }

        @Override
        public double cost() {
            return 45.0;
        }

        @Override
        public void fold() {
            System.out.println("Garden chair folded.");
        }

        @Override
        public void unfold() {
            System.out.println("Garden chair unfolded.");
        }

        @Override
        public String toString() {
            return "Garden Chair";
        }
    }

    class PlasticChair extends Chair {
        @Override
        public int kgResistance() {
            return 80;
        }

        @Override
        public double cost() {
            return 30.0;
        }

        @Override
        public void fold() {
            System.out.println("Plastic chair folded.");
        }

        @Override
        public void unfold() {
            System.out.println("Plastic chair unfolded.");
        }

        @Override
        public String toString() {
            return "Plastic Chair";
        }
    }

    // Abstract class Table
    abstract class Table extends Furniture {
        @Override
        public String toString() {
            return "This is a table.";
        }
    }

    // Concrete Table subclasses
    class DiningTable extends Table {
        @Override
        public double cost() {
            return 300.0;
        }

        @Override
        public String toString() {
            return "Dining Table";
        }
    }

    class PlasticTable extends Table implements Foldable {
        @Override
        public double cost() {
            return 60.0;
        }

        @Override
        public void fold() {
            System.out.println("Plastic table folded.");
        }

        @Override
        public void unfold() {
            System.out.println("Plastic table unfolded.");
        }

        @Override
        public String toString() {
            return "Plastic Table";
        }
    }

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

    class Bookcase extends Closet {
        @Override
        public double cost() {
            return 250.0;
        }

        @Override
        public String toString() {
            return "Bookcase";
        }
    }



}
