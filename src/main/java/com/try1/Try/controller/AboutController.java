package com.try1.Try.controller;

import com.try1.Try.model.About;
import com.try1.Try.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app")
@RequestMapping("/about")
public class AboutController {

    @Autowired
    IAboutService aboutServ;
   
    @GetMapping("/ver/{id}")
    @ResponseBody 
    public About verAbout(@PathVariable Integer id){
        return aboutServ.verAbout(id);
    }
    
      
    @PutMapping("/update/{id}")
    public void updateAbout(@PathVariable Integer id,@RequestBody About a){
        aboutServ.updateAbout(id, a);
    }  

    
}
