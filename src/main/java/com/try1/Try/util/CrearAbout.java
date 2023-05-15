package com.try1.Try.util;

import com.try1.Try.model.About;
import com.try1.Try.service.IAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CrearAbout  implements CommandLineRunner{

    @Autowired
    IAboutService aboutServ;
    
    @Override
    public void run(String... args) throws Exception {
//     About about= new About("Ria","Acá va una breve introducción.",
//            "Acá van tus metas.","ria@min.xn","Argentina","Acá va lo que te interesa encontrar.");
//     aboutServ.save(about);
    }
    
}
