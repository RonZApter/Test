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