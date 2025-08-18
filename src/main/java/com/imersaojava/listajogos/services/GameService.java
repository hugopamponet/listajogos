package com.imersaojava.listajogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imersaojava.listajogos.entities.Game;
import com.imersaojava.listajogos.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll() {
		List<Game> result = gameRepository.findAll();
		return result;
	}
}
