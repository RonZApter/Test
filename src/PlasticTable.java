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
