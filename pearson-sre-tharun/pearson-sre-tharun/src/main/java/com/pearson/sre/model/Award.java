package com.pearson.sre.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="award")
public class Award {

    @Id
    private int id;
    private int movie_id;
    private String award_name;
    private int year;

    public Award(int id, int movie_id, String award_name, int year) {
        this.id = id;
        this.movie_id = movie_id;
        this.award_name = award_name;
        this.year = year;
    }

    public Award() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getAward_name() {
        return award_name;
    }

    public void setAward_name(String award_name) {
        this.award_name = award_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
