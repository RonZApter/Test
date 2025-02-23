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
