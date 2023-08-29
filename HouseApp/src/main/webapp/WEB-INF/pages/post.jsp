<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Đăng tin thuê nhà</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <!-- Thêm các thư viện CSS khác nếu cần -->
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <h1 class="text-center mb-4">Đăng tin thuê nhà</h1>
                    <form action="submit" method="post" enctype="multipart/form-data">
                        <!-- Hostel fields -->
                        <div class="form-group">
                            <label for="hostelName">Tên Hostel:</label>
                            <input type="text" class="form-control" id="hostelName" name="hostelName" required>
                        </div>
                        <div class="form-group">
                            <label for="hostelAddress">Địa chỉ Hostel:</label>
                            <input type="text" class="form-control" id="hostelAddress" name="hostelAddress" required>
                        </div>
                        <div class="form-group">
                            <label for="hostelPhone">Số điện thoại Hostel:</label>
                            <input type="tel" class="form-control" id="hostelPhone" name="hostelPhone" required>
                        </div>

                        <div class="form-group">
                            <label for="roomDescription">Mô tả phòng:</label>
                            <textarea class="form-control" id="roomDescription" name="roomDescription" required></textarea>
                        </div>
                        <div class="form-group">
                            <label for="roomPrice">Giá phòng:</label>
                            <input type="number" class="form-control" id="roomPrice" name="roomPrice" required>
                        </div>
                        <!-- Image field -->
                        <div class="form-group">
                            <label for="roomImages">Hình ảnh phòng:</label>
                            <input type="file" class="form-control-file" id="roomImages" name="roomImages[]" accept="image/*" multiple>
                        </div>
                        <button type="submit" class="btn btn-primary">Gửi bài đăng</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
