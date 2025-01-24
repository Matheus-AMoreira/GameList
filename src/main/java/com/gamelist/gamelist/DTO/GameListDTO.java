package com.gamelist.gamelist.DTO;

import com.gamelist.gamelist.Entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        this.name = entity.getName();
        this.id = entity.getId();
    }
}
