<%@ page language="java" contentType="text/html; charset=EUC-JP"
    pageEncoding="EUC-JP"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-JP">
<title>発注</title>
</head>
<body>
<h2>商品リスト</h2>
<c:forEach var="goods" items="${goodsList}" varStatus="loop">
<div class="container" class="card-body" style= "border-bottom: 1px solid black"><p>
       ${goods.name}&nbsp;&nbsp;&nbsp;${goods.qty}&nbsp;&nbsp;&nbsp;</p>
       <label><input type="checkbox" id ="order" name="注文" value="1"></label>
       </div> 
		
コントローラにこれを渡す。
</c:forEach>

</body>
</html>