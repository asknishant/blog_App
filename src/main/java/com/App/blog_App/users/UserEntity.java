package com.App.blog_App.users;


import com.App.blog_App.articles.ArticlesEntity;
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
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "likers")
    Set<ArticlesEntity> likedArticles;
}
