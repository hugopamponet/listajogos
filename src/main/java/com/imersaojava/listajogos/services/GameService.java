package com.imersaojava.listajogos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imersaojava.listajogos.DTO.GameDTO;
import com.imersaojava.listajogos.DTO.GameMinDTO;
import com.imersaojava.listajogos.entities.Game;
import com.imersaojava.listajogos.projections.GameMinProjection;
import com.imersaojava.listajogos.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(g -> new GameMinDTO(g)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(g -> new GameMinDTO(g)).toList();
	}
}
