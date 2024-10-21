<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>계산기</title>
</head>
<body>
    <%!
    String[] members = {"A", "B", "C", "D"};
    int num = 10;

    int calc(int number) {
        return number + num;
    }
    %>

    <h3>계산결과</h3>
    <hr>
    ${n1} ${op} ${n2} 의 결과는 ${result} 입니다.

</body>
</html>