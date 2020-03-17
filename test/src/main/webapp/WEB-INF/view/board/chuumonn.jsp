<%-- <%@ page language="java" contentType="text/html; charset=EUC-JP"
    pageEncoding="EUC-JP"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-JP">
<title>発注</title>
</head>
<body>
<%=request.getSession().getServletContext().getRealPath("/")%>
<h2>商品リスト</h2>
<div>
<c:forEach var="chuumonn" items="${OrderList}" varStatus="loop">
<div class="container" class="card-body" style= "border-bottom: 1px solid black">
<p>
<div style = "text-align: center">

      <div><img src="../upload/${chuumonn.GOODS_IMAGE}" width="50" height="50" alt="no img">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${chuumonn.GOODS_NAME}&nbsp;&nbsp;&nbsp;${chuumonn.GOODS_QTY}&nbsp;&nbsp;&nbsp;${chuumonn.GOODS_PRICE}
       
       　　　<!-- 　数量を送れるボックスをつくること -->
       <label><input type="checkbox" id ="order" name="注文" value="1"></label></div>
       </div> 
       </div>
<!--        ここに数量を頂けるようしておく -->
<!-- 		
コントローラにこれを渡す。 -->
</c:forEach>
</div>
</body>
</html>