package com.devsuperior.gamesproject.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(){
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public GameList getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
