package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public float mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos masik) {
        if (masik instanceof Bosszuallo) {
            Bosszuallo bosszuallo = (Bosszuallo) masik;
            return bosszuallo.vanEGyengesege && this.szuperero > bosszuallo.szuperero;
        }
        return this.szuperero > 2 * masik.mekkoraAzEreje();
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public String toString() {
        String gyengesegSzoveg = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return String.format("Szupererő: %.2f; %s", szuperero, gyengesegSzoveg);
    }
}
