package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
            public void testThePlayerOne() {
        Player Oleg = new Player(2, 100, "Oleg");

        Player Aidar = new Player(1, 90, "Aidar");
        Game game = new Game();

        game.register(Oleg);
        game.register(Aidar);
        int actual = game.round("Oleg", "Aidar");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThePlayerTwo() {
        Player Oleg = new Player(2, 100, "Oleg");

        Player Aidar = new Player(1, 190, "Aidar");
        Game game = new Game();

        game.register(Oleg);
        game.register(Aidar);
        int actual = game.round("Oleg", "Aidar");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThePlayerEqually() {
        Player Oleg = new Player(2, 100, "Oleg");

        Player Aidar = new Player(1, 100, "Aidar");
        Game game = new Game();

        game.register(Oleg);
        game.register(Aidar);
        int actual = game.round("Oleg", "Aidar");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThePlayerNotRegisteredOne() {
        Player Oleg = new Player(2, 100, "Oleg");

        Game game = new Game();

        game.register(Oleg);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Oleg", "Dima")
        );
    }

    @Test
    public void testThePlayerNotRegisteredTwo() {
        Player Oleg = new Player(2, 100, "Oleg");

        Game game = new Game();

        game.register(Oleg);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Dima", "Oleg")
        );
    }

}