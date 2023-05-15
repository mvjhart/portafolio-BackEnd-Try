package com.try1.Try.controller;

import com.try1.Try.model.Skill;
import com.try1.Try.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portafolio-frontend-mariani.web.app")
@RequestMapping("/skills")
public class SkillController {
    
    @Autowired
    ISkillService skillServ;

    
    @GetMapping("/lista")
    @ResponseBody  
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
   
   
    @PostMapping("/agregar")
   public void agregarSkill(@RequestBody Skill s){
       skillServ.agregarSkill(s);
   }
  
      
    @DeleteMapping ("/borrar/{id}")
   public void borrarSkill(@PathVariable Integer id){
       skillServ.borrarSkill(id);
   }
 
   
    @PutMapping("/update/{id}")
   public void updateSkill(@PathVariable Integer id,@RequestBody Skill s){
       skillServ.updateSkill(id, s);
   }
    
}
