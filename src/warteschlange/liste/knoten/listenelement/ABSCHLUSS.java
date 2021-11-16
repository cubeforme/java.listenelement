package warteschlange.liste.knoten.listenelement;
public class ABSCHLUSS extends LISTENELEMENT{
    public ABSCHLUSS(){
        super();
    }
    
    @Override
    public LISTENELEMENT hintenEinfuegen(DATENELEMENT dneu) {
        KNOTEN kneu = new KNOTEN(dneu, this);
        return kneu;
    }

    @Override
    public LISTENELEMENT nachfolgerGeben() {
        return null;
    }

    @Override
    public DATENELEMENT inhaltGeben() {
        return null;
    }

    @Override
    public String letzterNameGeben(DATENELEMENT d) {
        if (d!=null){
            return d.namegeben();
        }
        else{
            return "Liste leer";
        }
    }

    @Override
    public boolean nameVorhanden(String gesuchterName) {
        return false;
    }

    @Override
    public void alleAusgeben() {
        
    }
}
