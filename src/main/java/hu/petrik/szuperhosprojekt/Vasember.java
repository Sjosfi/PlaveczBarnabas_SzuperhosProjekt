package hu.petrik.szuperhosprojekt;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        this.setSzuperero(this.getSzuperero() + (float) (Math.random() * 10));
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}