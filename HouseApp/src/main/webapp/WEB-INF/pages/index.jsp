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
                z-index: 9999; /* Đảm bảo nằm trên tất cả các phần khác */
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
                z-index: 9999; /* Đảm bảo nằm trên tất cả các phần khác */
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
            .footer {
                position: fixed;
                bottom: 0;
                left: 0;
                width: 100%;
                background-color: #f8f9fa;
                padding: 0;
                text-align: center;
                z-index: 999;
            }
            .main-content {
                max-height: calc(100vh - 160px); /* Calculate available height for content */
                overflow-y: auto;
            }

            .image-preview-container {
                max-width: 100%;
                overflow: hidden;
                text-align: center;
                margin-top: 10px;
            }

            #imagePreview {
                max-width: 100%;
                max-height: 200px;
            }
            .search-form {
                padding: 10px;
                max-width: 300px; /* Đặt chiều rộng tối đa cho biểu mẫu */
                margin: 0 auto; /* Căn giữa biểu mẫu */
            }

            .search-form form {
                display: flex;
                flex-direction: column;
                align-items: stretch;
            }
            body {
                padding-bottom: 150px;
                overflow-y: auto;
                overflow: auto;
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

            <div class="collapse mt-3 search-form" id="searchForm" style="padding: 10px;">
                <form action="search_result.jsp" method="get" class="custom-search-form">
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
                        <button type="submit">Đăng nhập</button><br>
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

                        <label for="avatar">Chọn ảnh đại diện (avatar):</label>
                        <input type="file" id="avatar" name="avatar" accept="image/*" onchange="handleFileUpload(this)">
                        <div class="image-preview-container">
                            <img id="imagePreview" alt="Avatar preview">
                        </div>

                        <button type="submit">Đăng ký</button><br>
                        <button type="button" id="cancelSignupButton">Hủy</button>
                    </form>
                </div>
            </div>
            <div class="footer">
                <div class="row">
                    <div class="col-md-4">
                        <h3>Address</h3>
                    </div>
                    <div class="col-md-4">
                        <h3>Service</h3>
                    </div>
                    <div class="col-md-4">
                        <h3>Quick Links</h3>
                        <ul>
                            <li><a href="#">Home</a></li>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div>
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
        <script>
            function handleFileUpload(input) {
                var file = input.files[0];
                if (file) {
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        var imagePreview = document.getElementById("imagePreview");
                        imagePreview.src = e.target.result;
                        imagePreview.style.display = "block";
                    };
                    reader.readAsDataURL(file);
                }
            }
        </script>
    </body>
</html>