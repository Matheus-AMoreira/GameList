package com.gamelist.gamelist.Repository;

import com.gamelist.gamelist.Entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
