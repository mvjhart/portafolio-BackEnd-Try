/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.try1.Try.service;

import com.try1.Try.model.Skill;
import com.try1.Try.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    SkillRepository skillRep;

    @Override
    public List<Skill> verSkills() {
        return skillRep.findAll();
    }

    @Override
    public void agregarSkill(Skill s) {
        skillRep.save(s);
    }

    @Override
    public void borrarSkill(Integer id) {
        skillRep.deleteById(id);
    }

    @Override
    public void updateSkill(Integer id, Skill s) {
        Skill skill = skillRep.findById(id).orElse(null);
        skill.setName(s.getName());
        skill.setTipo(s.getTipo());
        skill.setNivel(s.getNivel());
        skillRep.save(skill);
    }
    
}
