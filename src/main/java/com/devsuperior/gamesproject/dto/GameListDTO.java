package com.devsuperior.gamesproject.dto;

import com.devsuperior.gamesproject.entities.GameList;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

import java.beans.BeanProperty;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
