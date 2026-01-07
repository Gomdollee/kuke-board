package kuke.board.hotarticle.repository;

import kuke.board.hotarticle.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
