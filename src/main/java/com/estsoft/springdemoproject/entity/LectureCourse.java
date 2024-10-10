package com.estsoft.springdemoproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table
public class LectureCourse {
    @Id
    private Long id;
    @Column
    private String title;
    @Column(name="instructor_id")
    private Long instructorId;
    @Column
    private Integer capacity;
    @Column
    private LocalDate from;
    @Column
    private LocalDate to;
    @Column(name="`desc`")
    private String desc;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
