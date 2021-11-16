package warteschlange.liste.knoten.listenelement;
public class LISTE {
    private LISTENELEMENT anfang;
    
    public LISTE(){
        anfang = new ABSCHLUSS();
    }
    
    public void hintenEinfuegen(DATENELEMENT dneu){
        if (anfang!=null){
            anfang = anfang.hintenEinfuegen(dneu);
        }
        else{
            anfang = new KNOTEN(dneu, null);
        }
    }
    
    public String letzterNameGeben(){
        return anfang.letzterNameGeben(null);
    }
    
    public boolean nameVorhanden(String gesuchterName){
        return anfang.nameVorhanden(gesuchterName);
    }
    
    public void alleAusgeben(){
        anfang.alleAusgeben();
    }
}
