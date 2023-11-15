package salma.chtioui.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import chtioui.salma.entities.Article;

import chtioui.salma.entities.Categorie;
import chtioui.salma.services.ArticleService;


@RestController
@RequestMapping("/api/v3/articles")
public class ArticleController {

	@Autowired
	private ArticleService service;

	@GetMapping
	public List<Article> findAllArticle() {
		return service.findAll();
	}

	@PostMapping
	public Article createArticle(@RequestBody Article article) {
		article.setId(0);
		return service.create(article);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable int id) {
		Article article = service.findById(id);
		if (article == null) {
			return new ResponseEntity<Object>("Article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			return ResponseEntity.ok(article);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateArticle(@PathVariable int id, @RequestBody Article newArticle) {
		Article oldArticle = service.findById(id);
		if (oldArticle == null) {
			return new ResponseEntity<Object>("Article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			newArticle.setId(id);
			return ResponseEntity.ok(service.update(newArticle));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteArticle(@PathVariable int id) {
		Article article = service.findById(id);
		if (article == null) {
			return new ResponseEntity<Object>("Article avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			service.delete(article);
			return ResponseEntity.ok("filière supprimée");
		}
	}
	
  @GetMapping("/filterByDate")
   public List<Article> findByDateProductionBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
       return service.findByDateProductionBetween(dateDebut, dateFin);
   }
	
}
