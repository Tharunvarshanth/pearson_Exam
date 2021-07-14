package com.pearson.sre.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    private int id;
    private String name;
    private String country;
    private int  released_year;
    private int genre_id;
    private String language;
    private int company_id;

    public Movie() {

    }

    public Movie(int id, String name, String country, int released_year, int genre_id, String language, int company_id) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.released_year = released_year;
        this.genre_id = genre_id;
        this.language = language;
        this.company_id = company_id;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getReleased_year() {
        return released_year;
    }

    public void setReleased_year(int released_year) {
        this.released_year = released_year;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
