package com.gamelist.gamelist.Controller;

import com.gamelist.gamelist.DTO.GameListDTO;
import com.gamelist.gamelist.Service.GameListServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListServer gameListServer;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListServer.findAll();
        return result;
    }

}
