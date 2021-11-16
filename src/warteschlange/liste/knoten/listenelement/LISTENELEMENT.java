package warteschlange.liste.knoten.listenelement;
public abstract class LISTENELEMENT {
    public abstract LISTENELEMENT hintenEinfuegen(DATENELEMENT dneu);
    public abstract LISTENELEMENT nachfolgerGeben();
    public abstract DATENELEMENT inhaltGeben();
    public abstract String letzterNameGeben(DATENELEMENT d);
    public abstract boolean nameVorhanden(String gesuchterName);
    public abstract void alleAusgeben();
}
