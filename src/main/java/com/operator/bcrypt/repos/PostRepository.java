package com.operator.bcrypt.repos;

import com.operator.bcrypt.models.Operator;
import com.operator.bcrypt.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostByOperator_UserName(String userName);
}


