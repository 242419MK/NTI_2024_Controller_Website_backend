package com.infstos.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByProductId(String productId) {
        return commentRepository.findByProductId(productId);
    }

    public void deleteComment(String commentId) {
        commentRepository.deleteById(commentId);
    }

    public Optional<Comment> findCommentById(String commentId) {
        return commentRepository.findById(commentId);
    }
}
