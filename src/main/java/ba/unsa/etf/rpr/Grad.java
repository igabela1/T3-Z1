package ba.unsa.etf.rpr;

public enum Grad {
    BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"), TRAVNIK("030"), MOSTAR("036"), SIROKI_BRIJEG("039"), SARAJEVO("033"),
    LIVNO("034"), BRCKO("049"), BANJA_LUKA("051");
    private final String opis;

    Grad(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

}
