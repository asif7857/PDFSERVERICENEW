package com.fissionlabs.coe.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fissionlabs.coe.repository.PDFStoregeRepo;
import com.fissionlabs.coe.service.PdfFileStorageService;

@RestController
@RequestMapping("/file")
public class PDFFileStorgaeController {

	 @Autowired
	private PdfFileStorageService service;
	 
	    @PostMapping("/upload")
	    public ResponseEntity<String> uploadFile(@RequestParam(value = "files") MultipartFile file) throws IOException {
	        return new ResponseEntity<>(service.saveContent(file), HttpStatus.OK);
	    }
	    
	    @PostMapping("/{name}")
	    public String Welocme(@PathVariable String name)
	    {
	    	 return "Welcome to Springboot app" +name;
	    }
	     
	
	    @GetMapping("/welocme")
	    public String Welocme1()
	    {
	    	 return "Welcome to Springboot app";
	    }
	 
	 }
