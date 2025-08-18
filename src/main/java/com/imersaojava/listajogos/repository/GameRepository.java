package com.imersaojava.listajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imersaojava.listajogos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
