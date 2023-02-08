package monappli.mvn;

/**
 * Classe Element
 * @author Boullier Arthur
 */
public class Element {
    private Element precedent;
    private Element suivant;
    private int valeur;

    Element(int valeur) {
        this.valeur = valeur;
        this.precedent = null;
        this.suivant = null;
        System.out.println("Nouvel Element :" + valeur);
    }

    /**
     * @return la valeur de l'élément
     */
    public int getValeur(){
        return this.valeur;
    }

    /**
     * @param valeur nouvelle valeur de l'élément
     */
    public void setValeur(int valeur){
        this.valeur = valeur;
    }

    /**
     * @return l'élément precedent
     */
    public Element getPrecedent(){
        return this.precedent;
    }

    /**
     * @param precedent nouvelle valeur de l'élément précédent
     */
    public void setPrecedent(Element precedent){
        this.precedent = precedent;
    }

    /**
     * @return l'élément après
     */
    public Element getSuivant(){
        return this.suivant;
    }


    /**
     * @param suivant nouvelle valeur de l'élément suivant
     */
    public void setSuivant(Element suivant){
        this.suivant = suivant;
    }


    /**
     * Retourne une chaîne de caractères représentant l'élément
     */
    public String toString(){
        return "Element :" + this.valeur;
    }

}