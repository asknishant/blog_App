package com.App.blog_App.articles;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {
    private ArticlesRepository articlesRepository;

    public ArticlesService(ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    List<ArticleEntity> getAllArticles() {
        return articlesRepository.findAll();
    }

    void getArticleById(Long id) {
        articlesRepository.findById(id);
    }
    void getArticleBySlug(String slug) {
         articlesRepository.findArticleEntitiesBySlugContaining(slug);
    }
}
