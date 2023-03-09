package com.Tiketa.tiketa.repository;

import com.Tiketa.tiketa.model.Caderno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadernoRepository extends JpaRepository<Caderno, Long> {
}
