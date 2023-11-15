package chtioui.salma.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chtioui.salma.entities.*;




@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	
	

}
