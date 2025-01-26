package com.gamelist.gamelist.DTO;

import com.gamelist.gamelist.Entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        this.name = entity.getName();
        this.id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
