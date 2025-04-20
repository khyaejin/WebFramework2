<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>수강 학점 관리 시스템</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>

<h2>수강 학점 관리 시스템</h2>
<p>왼쪽 메뉴에서 원하는 기능을 선택하세요.</p>

<ul>
  <%-- ① 학년별 이수 학점 조회 --%>
  <li><a href="${pageContext.request.contextPath}/credits">① 학년별 이수 학점 조회</a></li>

  <%-- ② 수강 신청하기 --%>
  <li><a href="${pageContext.request.contextPath}/courses/create">② 수강 신청하기</a></li>

  <%-- ③ 수강 신청 조회 (2025년 2학기 수강 신청 내역) --%>
  <li><a href="${pageContext.request.contextPath}/credits/2025/2">③ 수강 신청 조회</a></li>
</ul>

</body>
</html>
