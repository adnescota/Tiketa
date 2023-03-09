package com.Tiketa.tiketa.repository;

import com.Tiketa.tiketa.model.Lavoura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LavouraRepository extends JpaRepository <Lavoura, Long> {
}
