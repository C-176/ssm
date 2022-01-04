package com.chen.ssm.controller;

import com.chen.ssm.service.UploadAndDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class uploadAndDownloadController {
    @Autowired
    private UploadAndDownloadService uploadAndDownloadService;

    @RequestMapping("/UploadAndDownloadService")
    public ModelAndView uploadAndDownload(HttpServletRequest request, @RequestParam("uploadFile") MultipartFile uploadFile, @RequestParam("downloadFile") MultipartFile downloadFile, String mode) {
        String service = uploadAndDownloadService.service(request, uploadFile, downloadFile, mode);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("info", service);
        modelAndView.setViewName("ShowInfo");
        return modelAndView;
    }
}
