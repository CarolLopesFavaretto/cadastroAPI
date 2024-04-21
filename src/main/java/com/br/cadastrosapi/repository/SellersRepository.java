package com.br.cadastrosapi.repository;

import com.br.cadastrosapi.entity.Sellers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellersRepository extends JpaRepository<Sellers, Long> {
}
