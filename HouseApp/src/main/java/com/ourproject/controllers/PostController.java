/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.controllers;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ahjhj
 */
@Controller
public class PostController {

    @Value("${upload.path}")
    private String uploadPath;

    @GetMapping("/post")
    public String showPostForm() {
        return "post";
    }

    @PostMapping("/submit")
    public String submitPost(HttpServletRequest request,
            @RequestParam("roomImages") MultipartFile[] roomImages) {
        String hostelName = request.getParameter("hostelName");
        String hostelAddress = request.getParameter("hostelAddress");
        String hostelPhone = request.getParameter("hostelPhone");
        String roomName = request.getParameter("roomName");
        String roomDescription = request.getParameter("roomDescription");
        String roomPrice = request.getParameter("roomPrice");

        // Xử lý từng hình ảnh
        for (MultipartFile roomImage : roomImages) {
            if (!roomImage.isEmpty()) {
                try {
                    // Lưu hình ảnh vào thư mục lưu trữ
                    String originalFilename = roomImage.getOriginalFilename();
                    String imagePath = uploadPath + File.separator + originalFilename;
                    roomImage.transferTo(new File(imagePath));
                } catch (IOException e) {

                }
            }
        }

        // Chuyển hướng đến trang thành công
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showPostSuccess() {
        return "postSuccess";
    }
}
