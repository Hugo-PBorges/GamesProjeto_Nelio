package com.devsuperior.gamesproject.services;

import com.devsuperior.gamesproject.dto.GameDTO;
import com.devsuperior.gamesproject.dto.GameMinDTO;
import com.devsuperior.gamesproject.entities.Game;
import com.devsuperior.gamesproject.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameID) {
        Game result = gameRepository.findById(gameID).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

}
