package com.hanghae.miniprojectmeatshop.repository;

import com.hanghae.miniprojectmeatshop.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
