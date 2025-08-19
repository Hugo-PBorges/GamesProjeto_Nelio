package com.devsuperior.gamesproject.controllers;

import com.devsuperior.gamesproject.dto.GameDTO;
import com.devsuperior.gamesproject.dto.GameMinDTO;
import com.devsuperior.gamesproject.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{gameID}")
    public GameDTO findById(@PathVariable Long gameID){
        return gameService.findById(gameID);
    }

}
