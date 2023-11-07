package classes;

public class Formation {
	private int idFormation;
	private String nomFormation;
	private Promotion promotion;
	public Formation(int idFormation, String nomFormation, Promotion promotion) {
		super();
		this.idFormation = idFormation;
		this.nomFormation = nomFormation;
		this.promotion = promotion;
	}
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	public String getNomFormation() {
		return nomFormation;
	}
	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", nomFormation=" + nomFormation + ", promotion=" + promotion
				+ "]";
	}
	
}
