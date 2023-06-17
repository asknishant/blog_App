package com.App.blog_App.users;


import com.App.blog_App.articles.ArticleEntity;
import com.App.blog_App.common.BaseEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    String username;
    @Column(nullable = false, unique = true)
    String email;
    @Column(nullable = false) @Setter
    String password;
    @Nullable @Setter
    String bio;
    @Nullable @Setter
    String image;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<ArticleEntity> authoredArticles;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "likers")
    Set<ArticleEntity> likedArticles;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "followers",
    joinColumns = @JoinColumn(name = "following_id"),
    inverseJoinColumns = @JoinColumn(name = "follower_id"))
    Set<UserEntity> followers;

    @ManyToMany(fetch = FetchType.LAZY )
    Set<UserEntity> following;
}
