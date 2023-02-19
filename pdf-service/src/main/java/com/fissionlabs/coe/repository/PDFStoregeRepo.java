package com.fissionlabs.coe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fissionlabs.coe.entity.PdfFile;

@Repository
public interface PDFStoregeRepo extends JpaRepository<PdfFile, Long> {

}
