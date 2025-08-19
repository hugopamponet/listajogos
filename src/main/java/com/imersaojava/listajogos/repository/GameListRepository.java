package com.imersaojava.listajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imersaojava.listajogos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
