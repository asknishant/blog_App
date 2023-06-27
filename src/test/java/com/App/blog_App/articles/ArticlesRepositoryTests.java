package com.App.blog_App.articles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest // this means it only tests the data layer. This means not entire app gets booted up.
public class ArticlesRepositoryTests {

    @Autowired
    private ArticlesRepository articlesRepository;

    @Test
    public void findAllArtilcesWorks() {
        var article = articlesRepository.findAll();
    }
}
