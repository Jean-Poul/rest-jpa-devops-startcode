/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Movie;

/**
 *
 * @author jplm
 */
public class MovieDTO {
    private Long id;
    private int year;
    private String title;
    private String[] actors;

    
    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.year = movie.getYear();
        this.title = movie.getTitle();
        this.actors = movie.getActors();
    }
    

    public MovieDTO() {
    }
    
    
    
    
    
}
