package com.try1.Try.service;

import com.try1.Try.model.Skill;
import java.util.List;

public interface ISkillService {

    public List<Skill> verSkills();
    public void agregarSkill(Skill s);
    public void borrarSkill(Integer id);
    public void updateSkill(Integer id,Skill s);
    
}