package chtioui.salma.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nom;
@JsonIgnore
@OneToMany(mappedBy = "catArticle", fetch = FetchType.EAGER)
private List<Article> Articles;
@JsonIgnore
@ManyToOne
private Categorie categorieParent;
@JsonIgnore
@OneToMany(mappedBy = "categorieParent",fetch = FetchType.EAGER)
private List<Categorie> categoriesParent;
public List<Article> getArticles() {
	return Articles;
}

public void setArticles(List<Article> articles) {
	Articles = articles;
}

public Categorie getCategorieParent() {
	return categorieParent;
}

public void setCategorieParent(Categorie categorieParent) {
	this.categorieParent = categorieParent;
}

public List<Categorie> getCategoriesParent() {
	return categoriesParent;
}

public void setCategoriesParent(List<Categorie> categoriesParent) {
	this.categoriesParent = categoriesParent;
}

public Categorie(String nom) {
	super();
	this.nom = nom;
}

public Categorie() {
	super();
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

}
