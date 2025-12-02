package com.mediaflow.MediaFlowAPI_GraphQL.repository;

import com.mediaflow.MediaFlowAPI_GraphQL.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByEmail(String email);
}