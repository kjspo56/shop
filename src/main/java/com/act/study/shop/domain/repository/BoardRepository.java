package com.act.study.shop.domain.repository;

import com.act.study.shop.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
