package com.neusoft.newcharge.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserHandler {
	
	@RequestMapping("/user/upload.action")
	public String upload(HttpServletRequest request, String username, String password, @RequestParam("upload") MultipartFile upload) {
		System.out.println(username + "_" + password);
		String filename = System.currentTimeMillis() + "_" + upload.getOriginalFilename();
		Path filepath = Paths.get(request.getServletContext().getRealPath("/"))
				.getParent()
				.resolve("uploads");
		try {
			upload.transferTo(Files.createFile(filepath.resolve(filename)).toFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filepath.resolve(filename).toString());
		return "forward:/upload.html";
	}
	
	@RequestMapping("/user/ajaxUpload.action")
	@ResponseBody
	public String ajaxUpload(HttpServletRequest request, String username, String password, @RequestParam("upload") MultipartFile upload) {
		System.out.println(username + "_" + password);
		String filename = System.currentTimeMillis() + "_" + upload.getOriginalFilename();
		Path filepath = Paths.get(request.getServletContext().getRealPath("/"))
				.getParent()
				.resolve("uploads");
		try {
			upload.transferTo(Files.createFile(filepath.resolve(filename)).toFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filepath.resolve(filename).toString());
		return "{\"result\", true}";
	}
	
}
