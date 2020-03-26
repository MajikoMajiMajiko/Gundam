package dao;

public class MSDAO {
    public List<Pokemon> findData() {

		Connection conn = null;
		List<MSList> msList = new ArrayList<MSList>();

		try {

			//JDBCドライバ読み込み
			Class.forName("org.h2.Driver");

			//データベースに接続
			conn = DriverManager.getConnection("jdbc:h2:C:/database/gundam", "sa", "");

			//SELECT文を準備
			String sql = "SELECT NUMBER, NAME, AFFLIATION, HEIGHT, WEIGHT, PILOT, IMAGE FROM GUNDAMMS";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, MSData.getName());

			//SELECT文を実行し結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//Pokemonインスタンスに設定しArrayListインスタンスに追加
			while(rs.next()){
				String number = rs.getString("NUMBER");
				String name = rs.getString("NAME");
				String affliation = rs.getString("AFFLIATION");
				double height = rs.getDouble("HEIGHT");
				double weight = rs.getDouble("WEIGHT");
				String pilot = rs.getString("PILOT");
                String image = rs.getString("IMAGE");

			//取得した値をPokemonインスタンスに格納
			Pokemon pokemon = new Pokemon(id, pokename, type, height, weight, characteristic);

			//ArrayListインスタンスにPokemonインスタンスを追加
			pokeList.add(pokemon);
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
		 return pokeList;
		}
}
