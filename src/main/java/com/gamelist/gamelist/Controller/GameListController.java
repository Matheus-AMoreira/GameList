package com.gamelist.gamelist.Controller;

import com.gamelist.gamelist.DTO.GameListDTO;
import com.gamelist.gamelist.DTO.ReplacementDTO;
import com.gamelist.gamelist.Service.GameListService;
import com.gamelist.gamelist.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        GameListDTO result = gameListService.findById(id);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.moveListPosition(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
