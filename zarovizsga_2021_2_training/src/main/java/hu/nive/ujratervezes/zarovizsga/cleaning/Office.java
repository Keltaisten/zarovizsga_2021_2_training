package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{
    private String address;
    private int place;
    private int levels;
    private static final int PRICE_FOR_CLEANING = 100;

    public Office(String address, int place, int levels) {
        this.address = address;
        this.place = place;
        this.levels = levels;
    }

    @Override
    public int clean() {
        return PRICE_FOR_CLEANING * place * levels;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
