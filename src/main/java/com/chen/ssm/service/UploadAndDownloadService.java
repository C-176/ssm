package com.chen.ssm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


@Service
public class UploadAndDownloadService {

    public String service(HttpServletRequest request, MultipartFile uploadFile, MultipartFile downloadFile, String mode) {
        String info = null;
        if ("upload".equals(mode)) {
            if (!uploadFile.isEmpty()) {
                info = "你未上传文件";

            }
            String realPath = request.getServletContext().getRealPath("/");
            File file = new File(realPath + "/upload");
            if (!file.exists()) {
                file.mkdirs();
            }
            String originalFilename = uploadFile.getOriginalFilename();
            String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
            long currentTimeMillis = System.currentTimeMillis();
            String fileName = currentTimeMillis + substring;
            try {
                uploadFile.transferTo(new File(file, fileName));
                info = "成功上传文件";


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return info;

    }
}

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=utf-8");
//
//        String mode = req.getParameter("mode");
//        System.out.println(mode);
//        switch (mode){
//            case "upload":
//                System.out.println("上传文件...");
//                String id = req.getParameter("id");
//                System.out.println("上传用户id为："+id);
////                String myFile = req.getParameter("uploadFile");
////                System.out.println("上传文件名为："+myFile);
//                Part part = req.getPart("uploadFile");
//                String uploadFile = part.getSubmittedFileName();
//                if (uploadFile == null || uploadFile.trim().length()==0){
//                    PrintWriter writer = resp.getWriter();
//                    writer.write("你选择文件了？");
//                }
//                System.out.println("上传文件名为：" + uploadFile);
//                String realPath = req.getServletContext().getRealPath("/");
//                System.out.println("文件存放的路径为：" + realPath+"upload\\"+uploadFile);
//                part.write(realPath+"upload\\"+uploadFile);
//                resp.sendRedirect("uploadAndDownload.html");
//                PrintWriter writer1 = resp.getWriter();
//                writer1.write("上传成功！5S之后回上传文件夹界面。。。");
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("重定向到html了");
//                break;
//            case "download":
//                System.out.println("文件下载");
//                String downloadFile = req.getParameter("downloadFile");
//                if(downloadFile == null || downloadFile.trim().length() == 0){
//                    System.out.println("不会输入？");
//                    resp.getWriter().write("不会输入？");
//                    resp.getWriter().close();
//                }
//                String path = req.getServletContext().getRealPath("/upload/");
////                System.out.println(path);
//                File srcfile = new File(path + downloadFile);
//                System.out.println("文件所在位置:"+srcfile);
//                if (srcfile.exists() && srcfile.isFile()){
//                    resp.setContentType("application/x-msdownload");
//                    resp.setHeader("Content-Disposition","attachment;filename="+downloadFile);
//                    FileInputStream in = new FileInputStream(srcfile);
////                    String objFile = req.getServletContext().getRealPath("/download/");
//                    ServletOutputStream out = resp.getOutputStream();
//                    byte[] bytes = new byte[1024];
//                    int len =0 ;
//                    while((len = in.read(bytes))!=-1){
//                        out.write(bytes,0,len);
//                    }
//                    out.close();
//                    in.close();
//                }else{
//                    resp.getWriter().write("找不着文件");
//                    resp.getWriter().close();
//                }
//                break;
//        }
//    }
//}
