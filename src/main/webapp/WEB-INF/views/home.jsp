<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>수강 학점 관리 시스템</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>

<div class="container">
  <header class="header">
    <h1>수강 학점 관리 시스템</h1>
    <p>학생의 수강 내역과 학점을 효과적으로 관리할 수 있습니다.</p>
  </header>

  <section class="menu">
    <div class="card">
      <h2>① 학년별 이수 학점 조회</h2>
      <p>전체 학년 기준으로 이수한 학점을 확인할 수 있습니다.</p>
      <form method="get" action="${pageContext.request.contextPath}/credits">
        <button type="submit">이동하기</button>
      </form>
    </div>

    <div class="card">
      <h2>② 수강 신청하기</h2>
      <p>2025년 2학기 과목을 직접 입력해 수강 신청할 수 있습니다.</p>
      <form method="get" action="${pageContext.request.contextPath}/credits/register">
        <button type="submit">신청하러 가기</button>
      </form>
    </div>

    <div class="card">
      <h2>③ 수강 신청 조회</h2>
      <p>2025년 2학기 신청한 과목들을 조회할 수 있습니다.</p>
      <form method="get" action="${pageContext.request.contextPath}/credits/2025/2">
        <button type="submit">내역 보기</button>
      </form>
    </div>
  </section>
</div>

</body>
</html>
