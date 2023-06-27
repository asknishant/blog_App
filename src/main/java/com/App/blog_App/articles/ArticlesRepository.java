package com.App.blog_App.articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepository extends JpaRepository<ArticleEntity, Long> {

    List<ArticleEntity> findArticleEntitiesBySlugContaining(String slug);
}