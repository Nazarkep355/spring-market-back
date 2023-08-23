package com.example.springmarketback.repo;

import com.example.springmarketback.entity.DetailName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailNameRepository extends JpaRepository<DetailName,Long> {
}
