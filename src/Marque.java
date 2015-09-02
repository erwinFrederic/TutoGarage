/**
 * Created by Cyprien Brisset on 02/09/2015.
 */
public enum Marque {

    RENO("RENO"),
    PIGEOT("PIGEOT"),
    TROEN("TROEN");

    private String marque = "";

    //Constructeur
    Marque(String marque) {
        this.marque = marque;
    }

    public String toString() {
        return marque;
    }
}
