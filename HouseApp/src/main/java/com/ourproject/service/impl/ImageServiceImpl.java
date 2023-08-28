/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.service.impl;

import com.ourproject.repository.ImageRepository;
import com.ourproject.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ahjhj
 */
@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    public ImageRepository imageRepository;
}
