package ba.unsa.etf.rpr;
import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    public String ispisi(){
        return "0"+mobilnaMreza+"/"+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
    @Override
    public final boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof MobilniBroj))
            return false;

        MobilniBroj a = (MobilniBroj) o;
        return broj.equals(a.broj);
    }

}

