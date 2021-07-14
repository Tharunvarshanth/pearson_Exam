package com.pearson.sre.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genre")
public class Genre {

    @Id
    private Long id;
    @Column(name="genre")
    private String genre_name;

    public Genre(Long id, String genre) {
        this.id = id;
        this.genre_name = genre;
    }

    public Genre() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre_name;
    }

    public void setGenre(String genre) {
        this.genre_name = genre;
    }
}
