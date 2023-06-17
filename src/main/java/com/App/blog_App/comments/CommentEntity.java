package com.App.blog_App.comments;

import com.App.blog_App.articles.ArticleEntity;
import com.App.blog_App.common.BaseEntity;
import com.App.blog_App.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "comments")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity extends BaseEntity {
    @Column(nullable = false, length = 100)
    String title;
    @Column(columnDefinition = "TEXT")
    String body;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    UserEntity author;

    @ManyToOne
    @JoinColumn(name = "likes")
    ArticleEntity article;
}