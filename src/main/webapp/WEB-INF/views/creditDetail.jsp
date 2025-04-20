<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>${year}년도 ${semester}학기 수강 내역</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body class="form-page">

<div class="form-container">
  <h2>${year}년도 ${semester}학기 수강 내역</h2>

  <table class="styled-table">
    <thead>
    <tr>
      <th>년도</th>
      <th>학기</th>
      <th>교과목명</th>
      <th>교과구분</th>
      <th>담당교수</th>
      <th>학점</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="course" items="${courses}">
      <tr>
        <td>${course.year}</td>
        <td>${course.semester}</td>
        <td>${course.name}</td>
        <td>${course.type}</td>
        <td>${course.instructor}</td>
        <td>${course.credit}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>

  <!-- 가운데 하단에 bugi-sit 캐릭터 삽입 -->
  <div class="image-center">
    <div class="bugi-sit"></div>
  </div>
</div>

</body>
</html>
