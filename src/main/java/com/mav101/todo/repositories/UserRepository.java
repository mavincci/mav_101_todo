package com.mav101.todo.repositories;

import com.mav101.todo.entities.ZUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<ZUser, UUID> {
    Page<ZUser> findAll(Pageable pageable);
}
