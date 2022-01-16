package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

	private Vector<Object> v;
	
        final int TailleDefault = 10;
        
	public Pile3() {
		this(0);
	}

	public Pile3(int taille) {
            if(taille <=0){
                this.v = new Vector<Object>(TailleDefault);
            }else{
                
            }
	}

	public void empiler(Object o) throws PilePleineException {
		// à compléter
            if(estPleine()){
		    new PilePleineException();
            }
            this.v.add(this.taille(), o);
	}

	public Object depiler() throws PileVideException {
		// à compléter
		if(estVide()){
		    new PileVideException();
                }
                Object fElement = sommet();
                this.v.remove(sommet());
                return fElement;
	}

	public Object sommet() throws PileVideException {
		// à compléter
		return this.v.lastElement();
	}

	public int taille() {
		// à compléter
		return this.v.size();
	}

	public int capacite() {
		// à compléter
		return this.v.capacity();
	}

	public boolean estVide() {
		// à compléter
		return this.v.isEmpty();
	}

	public boolean estPleine() {
		// à compléter
		return this.v.lastElement() == null;
	}

	public String toString() {
		// à compléter
		return this.v.toString();
	}

	public boolean equals(Object o) {
		// à compléter
		return this.v.contains(o);
	}

	// fonction fournie
	public int hashCode() {
		return toString().hashCode();
	}

}