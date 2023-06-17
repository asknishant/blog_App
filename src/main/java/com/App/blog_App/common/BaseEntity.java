package com.App.blog_App.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.annotation.processing.Generated;
import java.util.Date;

@MappedSuperclass
public abstract  class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Getter @UpdateTimestamp
    Date createdAt;

    @Setter @UpdateTimestamp
    Date updatedAt;
}
