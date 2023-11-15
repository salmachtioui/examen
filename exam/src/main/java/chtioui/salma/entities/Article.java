package chtioui.salma.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Article() {
		super();
	}

	private String nom;

	@Temporal(TemporalType.DATE)
	private Date dateProduction;
	public Categorie getCatArticle() {
		return catArticle;
	}

	public void setCatArticle(Categorie catArticle) {
		this.catArticle = catArticle;
	}

	@JsonIgnore
	@ManyToOne
	private Categorie catArticle;

	public Article(String nom, Date dateProduction) {
		super();
		this.nom = nom;
		this.dateProduction = dateProduction;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateProduction() {
		return dateProduction;
	}

	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}

}
