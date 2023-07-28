package com.operator.bcrypt.repos;


import com.operator.bcrypt.models.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
    Operator findOperatorByUserName(String userName);
}
