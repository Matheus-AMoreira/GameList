package com.gamelist.gamelist.Repository;

import com.gamelist.gamelist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
