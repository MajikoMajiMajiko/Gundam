package model;

import java.io.Serializable;

public class SearchMSCondition implements Serializable {
	private String number;
	private String name;
	private String affliation;
	private String pilot;

	//引数なしのコンストラクタ
	public SearchMSCondition() {}

	//引数ありのコンストラクタ
	public SearchMSCondition(String number, String name, String affiliation, String pilot) {
		this.number = number;
		this.name = name;
		this.affliation = affiliation;
		this.pilot = pilot;
	}

	public SearchMSCondition(String name) {
		this.name = name;
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

	public String getAffliation() {
		return affliation;
	}

	public void setAffliation(String affliation) {
		this.affliation = affliation;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}



}
