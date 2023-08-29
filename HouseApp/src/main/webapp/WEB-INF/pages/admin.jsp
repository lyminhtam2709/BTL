<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Trang quản trị viên</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                background-color: #f4f4f4;
            }
            h1 {
                text-align: center;
                margin-top: 20px;
            }
            h2 {
                margin-top: 20px;
            }
            table {
                width: 80%;
                margin: 20px auto;
                border-collapse: collapse;
                background-color: white;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            }
            th, td {
                padding: 10px 15px;
                text-align: center;
            }
            th {
                background-color: #007bff;
                color: white;
            }
            tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            form {
                display: inline-block;
            }
            button {
                padding: 5px 10px;
                background-color: #007bff;
                color: white;
                border: none;
                cursor: pointer;
            }
        </style>
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