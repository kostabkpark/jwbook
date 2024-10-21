<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
</head>
<body>
    <h3>계산결과</h3>
    <hr>
    ${cal.n1} ${cal.op} ${cal.n2} 의 결과는
    ${cal.calc()} 입니다.
</body>
</html>