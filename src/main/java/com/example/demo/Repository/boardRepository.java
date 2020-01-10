package com.example.demo.Repository;

import com.example.demo.model.entity.board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface boardRepository extends JpaRepository<board, String> {

}
