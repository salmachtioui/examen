package chtioui.salma.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chtioui.salma.dao.IDao;
import chtioui.salma.entities.*;
import chtioui.salma.repositories.ArticleRepository;


@Service
public class ArticleService implements IDao<Article> {

	@Autowired
	private ArticleRepository repository;

	@Override
	public Article create(Article o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article update(Article o) {
		return repository.save(o);
	}

	@Override
	public Article findById(int id) {
		return repository.findById((long) id).orElse(null);
	}

	@Override
	public List<Article> findAll() {
		return repository.findAll();
	}
	
	public List<Article> findByCategorie(Categorie catArticle) {
		      return repository.findByCategorie(catArticle);
		  }
	   public List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin) {
	       return repository.findByDateProductionBetween(dateDebut, dateFin);
	    }

}
