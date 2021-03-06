package com.ujf.m2miage.enerjikdp.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ujf.m2miage.enerjikdp.beans.UploadItem;
import com.ujf.m2miage.enerjikdp.service.SplitInfoService;

@Controller
@RequestMapping(value = "/upload.action")
public class UploadController
{
	
 private SplitInfoService splitInfoService;
	
  @RequestMapping(method = RequestMethod.GET)
  public String getUploadForm(Model model)
  {
    model.addAttribute(new UploadItem());
    return "uploadForm";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String create(Model model, @ModelAttribute UploadItem uploadItem, BindingResult result)
  {
    if (result.hasErrors())
    {
      for(ObjectError error : result.getAllErrors())
      {
        System.err.println("Error: " + error.getCode() +  " - " + error.getDefaultMessage());
      }
     
      return "uploadForm-response";
    }
    
    System.err.println("Test upload: " + uploadItem.getName());
    System.err.println("Test upload: " + uploadItem.getFileData().getOriginalFilename());
    splitInfoService.saveCapter(null);
    model.addAttribute("fileNameUploaded", uploadItem.getFileData().getOriginalFilename());
    
    return "uploadForm-response";
  }
  
	@Autowired
	public void setSplitInfoService(SplitInfoService splitInfoService) {
		this.splitInfoService = splitInfoService;
	}
	
	
}
