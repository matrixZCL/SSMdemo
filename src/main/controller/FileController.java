package main.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/upload")
    public String upload(String username, String password, MultipartFile pic)throws Exception{
        System.out.println(pic);
        System.out.println(pic.getOriginalFilename());
        String filename=pic.getOriginalFilename();
        String suffix=filename.substring(filename.lastIndexOf("."));
        String realPath=request.getServletContext().getRealPath("/upload");
        String filePath=realPath+"/"+UUID.randomUUID().toString()+suffix;
        pic.transferTo(new File(filePath));


        return "redirect:/index.jsp";

    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response)throws Exception{
        String srcFilename="a.jpg";
        String realPath=request.getServletContext().getRealPath("/upload");
        String srcfilePath=realPath+"/"+srcFilename;
        File srcFile=new File(srcfilePath);

        response.setHeader("content-disposition","attachment;filemane="+srcFilename);
        ServletOutputStream outputStream=response.getOutputStream();

        FileUtils.copyFile(srcFile,outputStream);
        outputStream.flush();


    }

}
