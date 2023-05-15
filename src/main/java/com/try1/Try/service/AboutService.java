package com.try1.Try.service;

import com.try1.Try.model.About;
import com.try1.Try.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {

    @Autowired
    AboutRepository aboutRep;
    
    @Override
    public About verAbout(Integer id) {
        return aboutRep.findById(id).orElse(null);
    }

    @Override
    public void updateAbout(Integer id, About a) {
        About about = aboutRep.findById(id).orElse(null);
        about.setNombre(a.getNombre());
        about.setMiniIntro(a.getMiniIntro());
        about.setGoals(a.getGoals());
        about.setEmail(a.getEmail());
        about.setCountry(a.getCountry());
        about.setInterest(a.getInterest());
        aboutRep.save(about);
    }

    @Override
    public void save(About a) {
        aboutRep.save(a);
    }

    @Override
    public boolean aboutExists(Integer id) {
        return aboutRep.existsById(id);
    }
    
}
