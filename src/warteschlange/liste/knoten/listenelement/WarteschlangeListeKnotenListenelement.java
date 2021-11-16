package warteschlange.liste.knoten.listenelement;
public class WarteschlangeListeKnotenListenelement {
    public static void main(String[] args) {
        LISTE l1 = new LISTE();
        DATENELEMENT d1 = new DATENELEMENT("Max Mustermann");
        DATENELEMENT d2 = new DATENELEMENT("Erika Mustermann");
        DATENELEMENT d3 = new DATENELEMENT("X Y");
        l1.hintenEinfuegen(d1);
        l1.hintenEinfuegen(d2);
        l1.alleAusgeben();
        System.out.println(l1.letzterNameGeben());
        System.out.println(l1.nameVorhanden("Erika Mustermann"));
        System.out.println(l1.nameVorhanden("X Y"));
    }
    
}
