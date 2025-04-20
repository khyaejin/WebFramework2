<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>수강 신청하기</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>

<h2>2025년 2학기 수강 신청</h2>

<form:form method="POST" action="${pageContext.request.contextPath}/courses/docreate" modelAttribute="course">

    <table class="formtable">
        <tr>
            <td class="label">교과목 코드:</td>
            <td class="control">
                <form:input path="code"/>
                <form:errors path="code" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">교과목명:</td>
            <td class="control">
                <form:input path="name"/>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">교과 구분:</td>
            <td class="control">
                <form:select path="type">
                    <form:option value="" label="--선택--"/>
                    <form:option value="전공" />
                    <form:option value="교양" />
                    <form:option value="일반" />
                </form:select>
                <form:errors path="type" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">담당 교수:</td>
            <td class="control">
                <form:input path="instructor"/>
                <form:errors path="instructor" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td class="label">학점:</td>
            <td class="control">
                <form:input path="credit" type="number"/>
                <form:errors path="credit" cssClass="error"/>
            </td>
        </tr>
    </table>

    <!-- hidden 값으로 고정된 학기 지정 -->
    <form:hidden path="year" value="2025"/>
    <form:hidden path="semester" value="2"/>

    <input type="submit" value="신청 완료"/>
</form:form>

</body>
</html>
