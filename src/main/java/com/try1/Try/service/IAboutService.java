package com.try1.Try.service;

import com.try1.Try.model.About;

public interface IAboutService {
    
    public void save(About a);
    public About verAbout(Integer id);
    public void updateAbout(Integer id,About a);
    public boolean aboutExists(Integer id);
}
