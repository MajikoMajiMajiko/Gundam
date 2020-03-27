package model;

import java.io.Serializable;

public class MSDTO implements Serializable {
    private String number;
    private String name;
    private String affiliation;
    private double height;
    private double weight;
    private String pilot;
    private String image;

    //引数なしのコンストラクタ
    public MSDTO() {}

    //引数ありのコンストラクタ
    public MSDTO(String number, String name, String affiliation, String pilot) {
        this.number = number;
        this.name = name;
        this.affiliation = affiliation;
        this.pilot = pilot;
    }

    //getter setter
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
