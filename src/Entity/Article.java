package Entity;

import java.io.Serializable;


public class Article implements Serializable{

	private int code;
	private String name;
	private float priceC;
	private float priceVC;
	private float priceVS;
	private int cant;

    private Article_Type type;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Article(int code, String name, float priceC, float priceVC, float priceVS, int cant, Article_Type type) {
		super();
		this.code = code;
		this.name = name;
		this.priceC = priceC;
		this.priceVC = priceVC;
		this.priceVS = priceVS;
		this.cant = cant;
		this.type = type;
	}

	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPriceC() {
		return priceC;
	}

	public void setPriceC(float priceC) {
		this.priceC = priceC;
	}

	public float getPriceVC() {
		return priceVC;
	}

	public void setPriceVC(float priceVC) {
		this.priceVC = priceVC;
	}

	public float getPriceVS() {
		return priceVS;
	}

	public void setPriceVS(float priceVS) {
		this.priceVS = priceVS;
	}

	public Article_Type getType() {
		return type;
	}

	public void setType(Article_Type type) {
		this.type = type;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}


	
	
	
}
