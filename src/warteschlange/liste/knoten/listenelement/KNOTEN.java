package warteschlange.liste.knoten.listenelement;
public class KNOTEN extends LISTENELEMENT{
    private DATENELEMENT inhalt;
    private LISTENELEMENT nachfolger;
    
    public KNOTEN(DATENELEMENT inhaltStart, LISTENELEMENT nachfolgerStart){
        super();
        inhalt=inhaltStart;
        nachfolger=nachfolgerStart;
    }
    
    @Override
    public LISTENELEMENT hintenEinfuegen(DATENELEMENT dneu){
        nachfolger=nachfolger.hintenEinfuegen(dneu);
        return this;
    }

    @Override
    public LISTENELEMENT nachfolgerGeben() {
        return nachfolger;
    }

    @Override
    public DATENELEMENT inhaltGeben() {
        return inhalt;
    }

    @Override
    public String letzterNameGeben(DATENELEMENT d) {
        return nachfolger.letzterNameGeben(inhalt);
    }

    @Override
    public boolean nameVorhanden(String gesuchterName) {
        if (inhalt.namegeben()==gesuchterName){
            return true;
        }
        else{
            return nachfolger.nameVorhanden(gesuchterName);
        }
    }

    @Override
    public void alleAusgeben() {
        System.out.println(inhalt.namegeben());
        nachfolger.alleAusgeben();
    }
    
}
