<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <table>
    <tr>
        <th>seq</th>
        <th>제품명</th>
        <th>제품가격</th>
    </tr>
      <c:forEach var="p" varStatus="i" items="${products}">
          <tr>
              <td>${i.count}</td>
              <td>${p.name}</td>
              <td>${p.price}</td>
          </tr>
      </c:forEach>
  </table>

</body>
</html>