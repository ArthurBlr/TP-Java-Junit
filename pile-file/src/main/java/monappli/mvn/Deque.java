package monappli.mvn;

/**
 * Classe Deque
 * @author Boullier Arthur
 */
public class Deque {
    private Element tete;
    private Element queue;

    
    /**
     * Constructeur de la classe Deque
     * @param tete l'élément de tête de la liste
     * @param queue l'élément de queue de la liste
     * 
     */
    Deque(Element tete, Element queue) {
        this.tete = tete;
        this.queue = queue;
    }

    /**
     * Vérifie si la liste est vide
     * @return true si la liste est vide, false sinon
     */
    public boolean dequeVide() {
        return this.tete == null && this.queue == null;
    }

    /**
     * Ajoute un élément à la tete
     * @param val la valeur de l'élément à ajouter
     */
    public void ajoutTete(int val) {
        Element e = new Element(val);
        if (this.dequeVide()) {
            this.tete = e;
            this.queue = e;
        } else {
            e.setSuivant(this.tete);
            this.tete.setPrecedent(e);
            this.tete = e;
        }
    }

    /**
     * Oter un élément à la tête
     * @return la valeur de l'élément retiré
     */
    public int oterTete() throws IndexOutOfBoundsException{
        int valeur = this.tete.getValeur();
        this.tete = this.tete.getSuivant();
        if(this.tete!=null){
            this.tete.setPrecedent(null);
        }else{
            this.queue = null;
        }
        return valeur;
    }

    /**
     * Ajoute un élément à la queue
     * @param val la valeur de l'élément à ajouter
     */
    public void ajoutQueue(int val) {
        Element e = new Element(val);
        if (this.dequeVide()) {
            this.tete = e;
            this.queue = e;
        } else {
            e.setPrecedent(this.queue);
            this.queue.setSuivant(e);
            this.queue = e;
        }
    }

    /**
     * Ote un élément à la queue
     * @return la valeur de l'élément retiré
     */
    public int oterQueue(){
        int valeur = this.queue.getValeur();
        this.queue = this.queue.getPrecedent();
        if(this.queue!=null){
            this.queue.setSuivant(null);
        }else{
            this.tete = null;
        }
        return valeur;
    }

    /**
     * Vider la deque de ses Elements
     */
    public void viderDeque(){
        this.tete = null;
        this.queue = null;
    }

    /*
     * affichage
     */
    public String toString() {
        String s = "Deque: ";
        Element e = this.tete;
        while (e != null) {
            s += e.getValeur() + ", ";
            e = e.getSuivant();
        }
        return s;
    }

    private static void main(String args[]){

    }


}