package com.App.blog_App.articles;

import com.App.blog_App.comments.CommentEntity;
import com.App.blog_App.common.BaseEntity;
import com.App.blog_App.users.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity(name = "articles")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleEntity extends BaseEntity {

    @Column(nullable = false, length = 100)
    String title;

    @Column(nullable = false, unique = true, length = 100)
    String slug;

    @Column(length = 150)
    String subtitle;
    @Column(columnDefinition = "TEXT")
    String body;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false) // no article without author so nullable = false
    UserEntity author;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "likes",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    Set<UserEntity> likers;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    Set<CommentEntity> comments;
}
