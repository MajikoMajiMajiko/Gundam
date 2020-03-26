package model;

import java.io.Serializable;

public class MSData implements Serializable {
    private String number;
    private String name;
    private String affiliation;
    private String pilot;

    //引数なしのコンストラクタ
    public MSData() {}

    //引数ありのコンストラクタ
    public MSData(String number, String name, String affiliation, String pilot) {
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

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}


}
