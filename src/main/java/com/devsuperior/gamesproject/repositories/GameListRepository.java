package com.devsuperior.gamesproject.repositories;

import com.devsuperior.gamesproject.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
