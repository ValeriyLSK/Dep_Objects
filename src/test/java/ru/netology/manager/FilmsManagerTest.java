package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.data.Films;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();
    Films first = new Films(1, "Friends");
    Films second = new Films(2, "Back to the Future");
    Films third = new Films(3, "Brassic");
    Films fourth = new Films(4, "Gran Torino");
    Films fifth = new Films(5, "Interstellar");
    Films sixth = new Films(6, "Rick and Morty");
    Films seventh = new Films(7, "Lucky number Sleven");
    Films eighth = new Films(8, "Guardians of Galaxy");
    Films ninth = new Films(9, "Law Abiding Citizen");
    Films tenth = new Films(10, "Harry Potter");
    Films eleventh = new Films(11, "Inception");

    @Test
    void shouldSave() {
        manager.save(first);
        Films[] expected = {first};
        Films[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLast() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        Films[] expected = {fifth, fourth, third, second, first};
        Films[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastBoundary() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Films[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Films[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastBoundaryTwo() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        Films[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Films[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        Films[] expected = {first, second, third, fourth, fifth};
        Films[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllBoundary() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);
        Films[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        Films[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

}