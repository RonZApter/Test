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