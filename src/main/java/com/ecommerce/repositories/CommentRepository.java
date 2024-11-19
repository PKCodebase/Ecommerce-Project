package com.ecommerce.repositories;

import com.ecommerce.model.Cart;
import com.ecommerce.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByProductId(Long productId);
}