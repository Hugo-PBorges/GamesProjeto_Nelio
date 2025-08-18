package com.devsuperior.gamesproject.repositories;

import com.devsuperior.gamesproject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
