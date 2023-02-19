package com.fissionlabs.coe.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fissionlabs.coe.entity.PdfFile;
import com.fissionlabs.coe.repository.PDFStoregeRepo;

@Service
public class PdfFileStorageService {

	 @Autowired
	 private PDFStoregeRepo repo;
	 
	  
	 public String saveContent(MultipartFile file) throws IOException
	 {
		 
		 File convFile = new File(file.getOriginalFilename());
	        
	            convFile.createNewFile();
	            FileOutputStream fos = new FileOutputStream(convFile);
	            fos.write(file.getBytes());
	            fos.close(); //IOUtils.closeQuietly(fos);
	       		
	      
	      PDDocument document = PDDocument.load(convFile);
	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();
	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      System.out.println(text);
	      //Closing the document
	      PdfFile pdf = new PdfFile();
	      pdf.setContent(text);
	      pdf.setId(1);
	      
	      repo.save(pdf);
	      document.close();
		 
		  return "File content saved in db successfully";
	 }
	 
}
