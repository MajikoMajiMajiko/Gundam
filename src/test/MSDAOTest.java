package test;

import java.util.ArrayList;

import dao.MSDAO;
import model.MSDTO;
import model.SearchMSCondition;

public class MSDAOTest {

	public static void main(String[] args) {
		testFindData();

	}

	public static void testFindData() {
		//SearchMSCondition searchMSCondition = new SearchMSCondition("","ガンダム", "", "");
		SearchMSCondition searchMSCondition = new SearchMSCondition("ガンダム");
		MSDAO dao = new MSDAO();
		ArrayList<MSDTO>  resultList= new ArrayList<MSDTO>();
		resultList = dao.findMSData(searchMSCondition);

		//resultListの中身によって処理を分岐
		if(resultList != null){
			System.out.println("データ見つかりました");
		} else {
			System.out.println("なんもないよ");
		}

	}

}
