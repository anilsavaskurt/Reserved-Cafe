package com.reserved.cafe.repositories;

import com.reserved.cafe.domain.DiningTable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DiningTableRepository extends JpaRepository<DiningTable, Integer>{

    DiningTable getDiningTableById(int id);
}