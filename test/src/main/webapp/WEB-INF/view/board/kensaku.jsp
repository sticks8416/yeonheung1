<%@ page language="java" contentType="text/html; charset=EUC-JP"
    pageEncoding="EUC-JP"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%--  <% List<hacchuuVO> kensakukekka = (List<hacchuuVO>)request.getAttribute("kensakukekka"); %> --%>
 
<!DOCTYPE html>

<html>
<head>
<script src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
<script>
<!-- ����ޥ����Υơ��֥�Ƿ������äƤ���-->
$(document).ready(function() {
	
	alert("��λ"); 
	});
$(document).ready(function() {
	var list = new Array();
	list = "${SeigyoList}"
/* 	alert(list);  */
	
});

function kensakuChk(){
    if(document.ChkForm.ryhntn_cd.value=='' || document.ChkForm.shhn_cd.value ==''){
      alert("�������˹��פ���ǡ�����¸�ߤ��ޤ��󡣸��������Ѥ��Ƥ��ľ���Ƥ���������");
      return false;
    }else if(document.ChkForm.shhn_cd.value.length>13){
      alert("���ʥ����ɤϡ�����ޥ��������ʥ����ɷ���Ѥ�꾮�������Τ߸�����ǽ�Ǥ������ľ���Ƥ���������");
      cleartext();
      return false;
    }else if(document.ChkForm.ryhntn_cd.value.length>5){
   	 alert("����Ź�����ɤϡ�����ޥ���������Ź�����ɷ���Ѥ�꾮�������Τ߸�����ǽ�Ǥ������ľ���Ƥ���������");   
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
 <h2>�Ż�ȯ�����ƥ�</h2>
<form name ="ChkForm" action="<c:url value="/board/kensaku" />" method="POST" onsubmit="return kensakuChk()">
<div>
  	����Ź������<label><input type="text" id ="ryhntn_cd" name="ryhntn_cd" placeholder="RYHNTN_CD" style="width:100px;height:20px"></label>
  <br>
  	 ���ʥ�����<label><input type="text" id="shhn_cd" name="shhn_cd" placeholder="SHHN_CD" style="width:100px;height:20px"></label> 
  <br>
  	����ե饰<label><input type="checkbox" id ="sakujyo" name="���" value="1"></label>
  <br>
    <input class="btn btn-success" type="submit" value="����">
    <button type="button" onclick="location.href='#' ">����</button>
					<!-- button onclick location url -->
    <!-- id js value  -->
    </div>
    </form>
    <div align="center"> &nbsp;&nbsp;ȯ���ֹ�&nbsp;&nbsp;����Ź������&nbsp;&nbsp;&nbsp;���ʥ�����&nbsp;&nbsp;&nbsp;ȯ���&nbsp;&nbsp;&nbsp;���
    </div>
    <div>
      <c:forEach var="hacchuu" items="${kensakukekka}" varStatus="loop">
      <div class="container" align ="center">
  <br><hr width ="50%">&nbsp;&nbsp;<a>${hacchuu.HACYU_NO}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>${hacchuu.RYHNTN_CD}</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>${hacchuu.SHHN_CD}
  </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>${hacchuu.HACYU_ORDER_NUMBER}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="checkbox" id ="sakujyo" name="���" value="1"></label></a>
</div>
       </c:forEach>
       </div>
</html>