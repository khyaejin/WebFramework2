<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>학기별 이수 학점</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>

<h2>학기별 이수 학점</h2>
<table>
  <tr>
    <th>년도</th>
    <th>학기</th>
    <th>취득 학점</th>
    <th>상세보기</th>
  </tr>

  <c:forEach var="dto" items="${summary.summaries}">
    <tr>
      <td>${dto.year}</td>
      <td>${dto.semester}</td>
      <td>${dto.credit}</td>
      <td><a href="${pageContext.request.contextPath}/credits/${dto.year}/${dto.semester}">링크</a></td>
    </tr>
  </c:forEach>

  <tr class="total-row">
    <td colspan="2">총계</td>
    <td>${summary.totalCredit}</td>
    <td></td>
  </tr>
</table>

</body>
</html>
