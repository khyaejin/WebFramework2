<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>학년별 이수 학점</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body class="credit-page">

<div class="form-container">
  <h2>학년별 이수 학점 조회</h2>

  <table class="styled-table">
    <thead>
    <tr>
      <th>년도</th>
      <th>학기</th>
      <th>취득 학점</th>
      <th>상세보기</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dto" items="${summary.summaries}">
      <tr>
        <td>${dto.year}</td>
        <td>${dto.semester}</td>
        <td>${dto.credit}</td>
        <td>
          <a href="${pageContext.request.contextPath}/credits/${dto.year}/${dto.semester}" class="link-button">보기</a>
        </td>
      </tr>
    </c:forEach>
    <tr class="total-row">
      <td colspan="2"><strong>총계</strong></td>
      <td><strong>${summary.totalCredit}</strong></td>
      <td></td>
    </tr>
    </tbody>
  </table>
</div>

</body>
</html>
