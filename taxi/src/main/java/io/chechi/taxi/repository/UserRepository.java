package io.chechi.taxi.repository;

import io.chechi.taxi.dto.UserResponse;
import io.chechi.taxi.entity.Role;
import io.chechi.taxi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail (String email);

    List<User> findByRoles(Role role);

}
