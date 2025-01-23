package com.gamelist.gamelist.Service;

import com.gamelist.gamelist.Entities.Game;
import com.gamelist.gamelist.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {


    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
