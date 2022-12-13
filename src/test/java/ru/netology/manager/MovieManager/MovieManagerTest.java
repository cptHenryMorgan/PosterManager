package ru.netology.manager.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void addMovieMan() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Saw 1");
        manager.addMovie("Saw 2");
        manager.addMovie("Saw 3");

        String[] expected = {"Saw 3", "Saw 2", "Saw 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastSixMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Rocky 1");
        manager.addMovie("Rocky 2");
        manager.addMovie("Rocky 3");
        manager.addMovie("Rocky 4");
        manager.addMovie("Rocky 5");
        manager.addMovie("Rocky 6");

        String[] expected = {"Rocky 6", "Rocky 5", "Rocky 4", "Rocky 3", "Rocky 2", "Rocky 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Mind Hunters");

        String[] expected = {"Mind Hunters"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Judge Dredd");

        String[] expected = {"Judge Dredd"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Fast & Furious 1");
        manager.addMovie("Fast & Furious 2");
        manager.addMovie("Fast & Furious 3");
        manager.addMovie("Fast & Furious 4");
        manager.addMovie("Fast & Furious 5");
        manager.addMovie("Fast & Furious 6");
        manager.addMovie("Fast & Furious 7");
        manager.addMovie("Fast & Furious 8");
        manager.addMovie("Fast & Furious 9");
        manager.addMovie("Fast & Furious 10");

        String[] expected = {"Fast & Furious 10", "Fast & Furious 9",
                "Fast & Furious 8", "Fast & Furious 7", "Fast & Furious 6", "Fast & Furious 5", "Fast & Furious 4",
                "Fast & Furious 3", "Fast & Furious 2", "Fast & Furious 1"};
        String [] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastWhenMoviesBelowLimit () {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Charly 1");
        manager.addMovie("Charly 2");
        manager.addMovie("Charly 3");
        manager.addMovie("Charly 4");

        String[] expected = {"Charly 4", "Charly 3", "Charly 2", "Charly 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastWhenMoviesEqualLimit () {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Sin 1");
        manager.addMovie("Sin 2");
        manager.addMovie("Sin 3");
        manager.addMovie("Sin 4");
        manager.addMovie("Sin 5");
        manager.addMovie("Sin 6");
        manager.addMovie("Sin 7");
        manager.addMovie("Sin 8");
        manager.addMovie("Sin 9");
        manager.addMovie("Sin 10");

        String[] expected = {"Sin 10", "Sin 9", "Sin 8", "Sin 7", "Sin 6", "Sin 5", "Sin 4", "Sin 3", "Sin 2", "Sin 1", };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastWhenMoviesOverLimit () {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Sally 1");
        manager.addMovie("Sally 2");
        manager.addMovie("Sally 3");
        manager.addMovie("Sally 4");
        manager.addMovie("Sally 5");
        manager.addMovie("Sally 6");
        manager.addMovie("Sally 7");
        manager.addMovie("Sally 8");
        manager.addMovie("Sally 9");
        manager.addMovie("Sally 10");
        manager.addMovie("Sally 11");

        String[] expected = {"Sally 11", "Sally 10", "Sally 9", "Sally 8", "Sally 7", "Sally 6", "Sally 5",
                "Sally 4", "Sally 3", "Sally 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}