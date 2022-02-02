package com.vehiclelicenseapp.licenseapplication.ctrl;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehiclelicenseapp.licenseapplication.entity.Documents;
import com.vehiclelicenseapp.licenseapplication.service.DocumentsService;

@RestController
public class DocumentsController {
	@Autowired
	DocumentsService documentsService;
	@PostMapping("/docs")
	public Documents createDocuments(@Valid @RequestBody Documents docs ) {
		return documentsService.createDocuments(docs);
	}
		@GetMapping("/docs")
		public List<Documents> getDocuments(){
			return documentsService.getDocs();
		}
		@DeleteMapping("/docs")
		public boolean deleteAllDocuments()
		{
			return documentsService.deleteAllDocuments();
		}
		@PutMapping("/docs/{documentsId}")
		public Documents updateDocuments(@PathVariable int documentsId, @RequestBody Documents obj)
		{
			return documentsService.updateDocuments(documentsId,obj);
		}
}