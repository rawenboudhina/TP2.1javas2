package TP2S2;

public class Note {
	private String NomCOURS;
    private float note;
	public String getNomCOURS() {
		return NomCOURS;
	}
	public void setNomCOURS(String nomCOURS) {
		NomCOURS = nomCOURS;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public Note(String nomCOURS, float note) {
		super();
		NomCOURS = nomCOURS;
		this.note = note;
	}
	@Override
	public String toString() {
		return "Note [NomCOURS=" + NomCOURS + ", note=" + note + "]";
	}
	
}

   
