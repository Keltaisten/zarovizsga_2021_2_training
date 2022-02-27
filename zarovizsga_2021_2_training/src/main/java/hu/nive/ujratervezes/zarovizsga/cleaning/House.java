package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable{
    private String address;
    private int place;
    private static final int PRICE_FOR_CLEANING = 80;

    public House(String address, int place) {
        this.address = address;
        this.place = place;
    }

    @Override
    public int clean() {
        return PRICE_FOR_CLEANING * place;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
