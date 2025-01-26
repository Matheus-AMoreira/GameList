package com.gamelist.gamelist.Entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setList(gameList);
        this.position = position;
    }
}
