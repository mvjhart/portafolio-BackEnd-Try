package com.try1.Try.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String miniIntro;
    private String goals;
    private String email;
    private String country;
    private String interest;

    public About() {
    }

    public About(String nombre, String miniIntro, String goals, String email, String country, String interest) {
        this.nombre = nombre;
        this.miniIntro = miniIntro;
        this.goals = goals;
        this.email = email;
        this.country = country;
        this.interest = interest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMiniIntro() {
        return miniIntro;
    }

    public void setMiniIntro(String miniIntro) {
        this.miniIntro = miniIntro;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }


}
