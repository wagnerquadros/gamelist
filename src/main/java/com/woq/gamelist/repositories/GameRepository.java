package com.woq.gamelist.repositories;

import com.woq.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
