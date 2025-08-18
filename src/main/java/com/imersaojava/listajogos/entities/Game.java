package com.imersaojava.listajogos.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "platform")
	private String platform;
	
	@Column(name = "score")
	private double score;
	
	@Column(name = "imgUrl")
	private String imgUrl;
	
	@Column(name = "shortDesciption")
	private String shortDesciption;
	
	@Column(name = "longDesciption")
	private String longDesciption;
	
	public Game () {
		
	}

	public Game(Long id, String title, Integer year, String genre, String platform, double score, String imgUrl,
			String shortDesciption, String longDesciption) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDesciption = shortDesciption;
		this.longDesciption = longDesciption;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDesciption() {
		return shortDesciption;
	}

	public void setShortDesciption(String shortDesciption) {
		this.shortDesciption = shortDesciption;
	}

	public String getLongDesciption() {
		return longDesciption;
	}

	public void setLongDesciption(String longDesciption) {
		this.longDesciption = longDesciption;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
}