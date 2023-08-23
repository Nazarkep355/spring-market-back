package com.example.springmarketback.repo;

import com.example.springmarketback.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail,Long> {
}
