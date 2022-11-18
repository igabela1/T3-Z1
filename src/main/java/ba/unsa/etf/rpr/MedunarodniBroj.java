package ba.unsa.etf.rpr;
import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    public String ispisi(){
        return drzava+"/"+broj;
    }
    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
    @Override
    public final boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof MedunarodniBroj))
            return false;

        MedunarodniBroj a = (MedunarodniBroj) o;
        return broj.equals(a.broj);
    }

}

