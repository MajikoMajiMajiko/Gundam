<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ガンダムデータベース</title>
</head>
<body>
<h1>ガンダムデータベース</h1>
<br>
<br>
<form action="/Gundam/SearchMSServlet" method="POST">
    型式番号　<input type="text" name="number"><br>
    MS名　<input type="text" name="name"><br>
    所属　<select name="affiliation">
        <option value="地球連邦軍">地球連邦軍</option><br>
        <option value="エゥーゴ">エゥーゴ</option><br>
        <option value="ティターンズ">ティターンズ</option><br>
        <option value="ロンド・ベル">ロンド・ベル</option><br>
        <option value="リガ・ミリティア">リガ・ミリティア</option><br>
        <option value="コロニー側反連合">コロニー側反連合</option><br>
        <option value="OZ">OZ</option><br>
        <option value="旧地球連邦軍">旧地球連邦軍</option><br>
        <option value="イングレッサ・ミリシャ">イングレッサ・ミリシャ</option><br>
        <option value="地球連合軍">地球連合軍</option><br>
        <option value="ZAFT">ZAFT</option><br>
        <option value="ソレスタルビーイング">ソレスタルビーイング</option><br>
        <option value="イノベイター(イノベイド)">イノベイター(イノベイド)</option><br>
        <option value="ヴェイガン">ヴェイガン</option><br>
        <option value="ドレット軍">ドレット軍</option><br>
        <option value="鉄華団">鉄華団</option><br>
        <option value="ギャラルホルン">ギャラルホルン</option><br>
    </select>
    <br>
    搭乗者　<input type="text" name="pilot"><br>
    <br>
</form>
<input type="submit" value="検索"><br>
<br>
<a href="/Gundam/BackToTopServlet">戻る</a>
</body>
</html>