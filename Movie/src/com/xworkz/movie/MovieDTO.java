package com.xworkz.movie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movie1")
public class MovieDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="mvid",strategy="increment")
	@GeneratedValue(generator="mvid")
	@Column(name = "movie_id")
	private int movieid;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "language")
	private String language;
	@Column(name = "budget")
	private double budget;
	@Column(name = "recomend")
	private boolean recomend;
	
	public MovieDTO() {
		
		System.out.println("Movie DTO Created");
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public boolean isRecomend() {
		return recomend;
	}

	public void setRecomend(boolean recomend) {
		this.recomend = recomend;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", language=" + language + ", budget=" + budget + ", recomend="
				+ recomend + "]";
	}
	

}
