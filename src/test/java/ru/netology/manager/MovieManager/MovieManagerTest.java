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
    public void findLastTwelveMovies() {
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

    }
}