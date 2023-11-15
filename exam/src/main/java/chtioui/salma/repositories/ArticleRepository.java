package chtioui.salma.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import chtioui.salma.entities.*;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	List<Article> findByCategorie(Categorie catArticle);
	
   List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin);


}
