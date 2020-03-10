<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
<script>
$(document).ready(function() {
	var list = new Array();
	list = "${SeigyoList}"
/* 	alert(list);  */
	
});

function kensakuChk(){
    if(document.ChkForm.ryhntn_cd.value=='' || document.ChkForm.shhn_cd.value ==''){
      alert("検索条件に合致するデータが存在しません。検索条件を変えてやり直してください。");
      return false;
    }else if(document.ChkForm.shhn_cd.value.length>13){
      alert("商品コードは｛制御マスタ＿商品コード桁数｝より小さい場合のみ検索可能です。やり直してください。");
      cleartext();
      return false;
    }else if(document.ChkForm.ryhntn_cd.value.length>5){
   	 alert("量販店コードは｛制御マスタ＿量販店コード桁数｝より小さい場合のみ検索可能です。やり直してください。");   
   	 cleartext();
   	 return false;
    }
    else{
    	return true;
    }
    }
</script>
<meta charset="EUC-JP">
<title>Insert title here</title>
</head>
<body>
 <h2>電子発注システム</h2>
<form name ="ChkForm" action="<c:url value="/board/kensaku" />" method="POST" onsubmit="return kensakuChk()">
<div>
  	量販店コード<label><input type="text" id ="ryhntn_cd" name="ryhntn_cd" placeholder="RYHNTN_CD" style="width:100px;height:20px"></label>
  <br>
  	 商品コード<label><input type="text" id="shhn_cd" name="shhn_cd" placeholder="SHHN_CD" style="width:100px;height:20px"></label> 
  <br>
  	削除フラグ<label><input type="checkbox" id ="sakujyo" name="削除" value="1"></label>
  <br>
    <input class="btn btn-success" type="submit" value="検索">
    <button type="button" onclick="location.href='#' ">新規</button>
					<!-- button onclick location url -->
    <!-- id js value  -->
    </div>
    </form>
</html>