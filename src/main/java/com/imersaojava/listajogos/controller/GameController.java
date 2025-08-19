package com.imersaojava.listajogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imersaojava.listajogos.DTO.GameMinDTO;
import com.imersaojava.listajogos.entities.Game;
import com.imersaojava.listajogos.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<Game> result = gameService.findAll();
		return result.stream().map(g -> new GameMinDTO(g)).toList();
	}

}
