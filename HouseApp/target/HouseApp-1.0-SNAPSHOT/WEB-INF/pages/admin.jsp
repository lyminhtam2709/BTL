<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Trang quản trị viên</title>
    </head>
    <body>
        <h1>Trang quản trị viên</h1>
        <h2>Danh sách bài đăng chờ duyệt:</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Địa chỉ</th>
                <th>Số điện thoại</th>
                <th>Hành động</th>
            </tr>
            <c:forEach items="${unapprovedHostels}" var="hostel">
                <tr>
                    <td>${hostel.id}</td>
                    <td>${hostel.name}</td>
                    <td>${hostel.address}</td>
                    <td>${hostel.phone}</td>
                    <td>
                        <form action="approve" method="post">
                            <input type="hidden" name="type" value="hostel">
                            <input type="hidden" name="id" value="${hostel.id}">
                            <button type="submit">Duyệt</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>


    </body>
</html>
