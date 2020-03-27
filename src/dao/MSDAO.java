package dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.MSDTO;
import model.SearchMSCondition;

public class MSDAO {
    public List<MSList> findData() {

		Connection conn = null;
		List<MSList> msList = new ArrayList<MSList>();
		SearchMSCondition searchMSCondition = new SearchMSCondition();

		try {

			//JDBCドライバ読み込み
			Class.forName("org.h2.Driver");

			//データベースに接続
			conn = DriverManager.getConnection("jdbc:h2:C:/database/gundam", "majiko", "majiko");

			//SELECT文を準備
			String sql = "SELECT NUMBER, NAME, AFFLIATION, HEIGHT, WEIGHT, PILOT, IMAGE FROM GUNDAMMS WHERE NUMBER LIKE %?% OR NAME LIKE %?% OR AFFILIATION LIKE %?% OR PILOT LIKE %?%";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, searchMSCondition.getNumber());
            pStmt.setString(2, searchMSCondition.getName());
            pStmt.setString(3, searchMSCondition.getAffliation());
            pStmt.setString(4, searchMSCondition.getPilot());

			//SELECT文を実行し結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//DTOに取得した値をセット
			MSDTO msDTO = new MSDTO();
			while(rs.next()){
				msDTO.setNumber(rs.getString("NUMBER"));
				msDTO.setName(rs.getString("NAME"));
				msDTO.setAffiliation(rs.getString("AFFLIATION"));
				msDTO.setHeight(rs.getDouble("HEIGHT"));
				msDTO.setWeight(rs.getDouble("WEIGHT"));
				msDTO.setPilot(rs.getString("PILOT"));
                msDTO.setImage(rs.getString("IMAGE"));

			//ArrayListインスタンスにDTOインスタンスを追加
			msList.add(msDTO);
			}
		}
		 catch (SQLException e){
			 e.printStackTrace();
			 return null;
		 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
			 return null;
		 } finally {
			 //データベース切断
			 if(conn != null) {
				 try {
					 conn.close();
				 } catch (SQLException e){
					 e.printStackTrace();
					 return null;
				 }
			 }
		 }
		 return msList;
		}
}
