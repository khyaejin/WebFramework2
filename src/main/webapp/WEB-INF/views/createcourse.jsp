<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>2025년 2학기 수강 신청</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body class="form-page">

<div class="form-container">
    <h2>2025년 2학기 수강 신청</h2>

    <form:form method="POST" action="${pageContext.request.contextPath}/credits/register" modelAttribute="course">

        <!-- 교과목 코드 -->
        <div class="form-group">
            <label for="code">교과목 코드</label>
            <form:input path="code" id="code" cssClass="form-input"/>
            <form:errors path="code" cssClass="error-message"/>
        </div>

        <!-- 교과목명 -->
        <div class="form-group">
            <label for="name">교과목명</label>
            <form:input path="name" id="name" cssClass="form-input"/>
            <form:errors path="name" cssClass="error-message"/>
        </div>

        <!-- 교과 구분 -->
        <div class="form-group">
            <label for="type">교과 구분</label>
            <form:select path="type" id="type" cssClass="form-input">
                <form:option value="" label="-- 선택 --"/>
                <form:option value="전공"/>
                <form:option value="교양"/>
                <form:option value="일반"/>
            </form:select>
            <form:errors path="type" cssClass="error-message"/>
        </div>

        <!-- 담당 교수 -->
        <div class="form-group">
            <label for="instructor">담당 교수</label>
            <form:input path="instructor" id="instructor" cssClass="form-input"/>
            <form:errors path="instructor" cssClass="error-message"/>
        </div>

        <!-- 학점 -->
        <div class="form-group">
            <label for="credit">학점</label>
            <form:input path="credit" type="number" id="credit" cssClass="form-input"/>
            <form:errors path="credit" cssClass="error-message"/>
        </div>

        <!-- 고정 학기 값 -->
        <form:hidden path="year" value="2025"/>
        <form:hidden path="semester" value="2"/>

        <!-- 제출 버튼 -->
        <div class="form-button">
            <input type="submit" value="신청 완료" class="submit-button"/>
        </div>
    </form:form>
</div>

</body>
</html>
