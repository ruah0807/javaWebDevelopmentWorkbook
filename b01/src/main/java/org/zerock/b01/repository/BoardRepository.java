package org.zerock.b01.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.b01.domain.Board;
import org.zerock.b01.repository.search.BoardSearch;
import org.springframework.data.repository.query.Param;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


//    @Query(value = "select now()", nativeQuery = true)
//    String getTime();
//
//
//    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);


    @EntityGraph(attributePaths = {"imageSet"})
    @Query("select b from Board b where b.bno =:bno")
    Optional<Board> findByIdWithImages(@Param("bno") Long bno);
}
