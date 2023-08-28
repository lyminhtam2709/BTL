<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tìm Nhà Trọ</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            .header {
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 20px;
                background-color: #f8f9fa;
                margin-bottom: 20px;
            }
            h1 {
                color: #007bff; /* Màu xanh ngọc */
            }
            .modal {
                display: flex;
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background-color: rgba(0, 0, 0, 0.5);
                justify-content: center;
                align-items: center;
            }

            .modal-content {
                display: flex;
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
                justify-content: center;
                align-items: center;
            }

            .close {
                position: absolute;
                top: 10px;
                right: 15px;
                font-size: 20px;
                cursor: pointer;
            }

            /* Thêm CSS cho form */
            form {
                display: flex;
                flex-direction: column;
            }

            label {
                margin-top: 10px;
                font-weight: bold;
            }

            input[type="text"], input[type="password"] {
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 5px;
                margin-top: 5px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <h1>BOOKING HOUSE</h1>
                <div>
                    <button id="loginButton" onclick="openLoginModal()" class="btn btn-primary">Đăng nhập</button>
                    <button id="signupButton" onclick="openSignupModal()" class="btn btn-primary">Đăng ký</button>
                </div>
            </div>
            <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#searchForm">
                Tìm Nhà Trọ
            </button>

            <div class="collapse mt-3" id="searchForm">
                <form action="search_result.jsp" method="get">
                    <div class="form-group">
                        <label for="address">Địa chỉ:</label>
                        <input type="text" class="form-control" name="address" id="address" required>
                    </div>

                    <div class="form-group">
                        <label for="district">Quận/Huyện/Thành phố:</label>
                        <input type="text" class="form-control" name="district" id="district">
                    </div>

                    <div class="form-group">
                        <label for="capacity">Số lượng người ở:</label>
                        <select class="form-control" name="capacity" id="capacity">
                            <option value="1">1 người</option>
                            <option value="2">2 người</option>
                            <option value="3">3 người</option>
                            <option value="4">4 người trở lên</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="price">Mức giá mong muốn:</label>
                        <input type="text" class="form-control" name="price" id="price">
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-primary">Tìm Kiếm</button>
                    </div>
                </form>
            </div>

            <div id="loginModal" class="modal">
                <div class="modal-content">
                    <span class="close" onclick="closeLoginModal()">&times;</span>
                    <h2>Đăng nhập</h2>
                    <form>
                        <label for="username">Tài khoản:</label>
                        <input type="text" id="username" name="username"><br>
                        <label for="password">Mật khẩu:</label>
                        <input type="password" id="password" name="password"><br>
                        <button type="submit">Đăng nhập</button>
                        <button type="button" id="cancelButton">Hủy</button>
                    </form>
                </div>
            </div> 
            <div id="signupModal" class="modal">
                <div class="modal-content">
                    <span class="close" onclick="closeSignupModal()">&times;</span>
                    <h2>Đăng ký</h2>
                    <form>
                        <label for="signupUsername">Tài khoản:</label>
                        <input type="text" id="signupUsername" name="signupUsername"><br>
                        <label for="signupPassword">Mật khẩu:</label>
                        <input type="password" id="signupPassword" name="signupPassword"><br>
                        <label for="signupPassword2">Nhập lại mật khẩu:</label>
                        <input type="password" id="signupPassword2" name="signupPassword2"><br>
                        <button type="submit">Đăng ký</button>
                        <button type="button" id="cancelSignupButton">Hủy</button>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script>
                        function openLoginModal() {
                            var loginModal = document.getElementById("loginModal");
                            loginModal.style.display = "block";
                        }

                        function closeLoginModal() {
                            var loginModal = document.getElementById("loginModal");
                            loginModal.style.display = "none";
                        }
                        document.addEventListener("DOMContentLoaded", function () {
                            var loginModal = document.getElementById("loginModal");
                            loginModal.style.display = "none";
                        });
        </script>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                var loginModal = document.getElementById("loginModal");
                var signupModal = document.getElementById("signupModal");

                loginModal.style.display = "none";
                signupModal.style.display = "none";
            });

            function openLoginModal() {
                var loginModal = document.getElementById("loginModal");
                var signupModal = document.getElementById("signupModal");

                loginModal.style.display = "block";
                signupModal.style.display = "none";
            }

            function openSignupModal() {
                var loginModal = document.getElementById("loginModal");
                var signupModal = document.getElementById("signupModal");

                loginModal.style.display = "none";
                signupModal.style.display = "block";
            }

            function closeLoginModal() {
                var loginModal = document.getElementById("loginModal");
                loginModal.style.display = "none";
            }

            function closeSignupModal() {
                var signupModal = document.getElementById("signupModal");
                signupModal.style.display = "none";
            }
        </script>
    </body>
</html>