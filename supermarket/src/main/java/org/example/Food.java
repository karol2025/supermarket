public enum Food {
    MILK,
    CHEESE,
    CHICKEN,
    CARROT,
    RICE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}