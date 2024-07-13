package com.vietcuong.simpleValidation.repository;

import com.vietcuong.simpleValidation.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
