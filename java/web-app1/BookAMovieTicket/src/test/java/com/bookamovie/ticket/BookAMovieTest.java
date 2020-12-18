package com.bookamovie.ticket;

import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.MatcherAssert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class BookAMovieTest {

    BookAMovie bookAMovie = null;

    //    Setup the sample data
    @Before
    public void setUp() {

        bookAMovie = new BookAMovie();

        MovieTicket movieTicket0 = new MovieTicket(1, "Avengers", 1, 2, "King", LocalDate.parse("2020-11-10"));
        MovieTicket movieTicket1 = new MovieTicket(2, "Dhoom", 1, 4, "Queen", LocalDate.parse("2020-11-05"));
        MovieTicket movieTicket2 = new MovieTicket(3, "Dhoom", 2, 2, "King", LocalDate.parse("2020-11-06"));
        MovieTicket movieTicket3 = new MovieTicket(4, "Dhoom", 1, 2, "King", LocalDate.parse("2020-10-10"));
        MovieTicket movieTicket4 = new MovieTicket(5, "Dhoom", 3, 3, "Queen", LocalDate.parse("2020-11-02"));
        MovieTicket movieTicket5 = new MovieTicket(6, "Avengers", 2, 5, "King", LocalDate.parse("2020-09-04"));
        MovieTicket movieTicket6 = new MovieTicket(7, "Dilbar", 2, 2, "Queen", LocalDate.parse("2020-11-10"));
        MovieTicket movieTicket7 = new MovieTicket(8, "Avengers", 1, 2, "King", LocalDate.parse("2020-10-07"));
        MovieTicket movieTicket8 = new MovieTicket(9, "Dilbar", 1, 2, "King", LocalDate.parse("2020-09-26"));

        MovieTicket invalidMovie1 = new MovieTicket(10, "Dhoom8", 1, 2, "Kin", LocalDate.parse("2020-09-26"));
        MovieTicket invalidMovie2 = new MovieTicket(11, "Dhoom9", 1, 2, "Queas", LocalDate.parse("2020-09-26"));

        List<MovieTicket> list = new ArrayList<MovieTicket>();

        list.add(movieTicket0);
        list.add(movieTicket1);
        list.add(movieTicket2);
        list.add(movieTicket3);
        list.add(movieTicket4);
        list.add(movieTicket5);
        list.add(movieTicket6);
        list.add(movieTicket7);
        list.add(movieTicket8);

        bookAMovie.setMovieTicketList(list);

    }

    @After
    public void tearDown() {
        bookAMovie = null;
    }

    //    Test to check if circle with value King is valid
    @SneakyThrows
    @Test
    public void testWhenCircleIsKing() {
        assertEquals(true, bookAMovie.validateCircle("king"));
    }

    //    Test to check if circle with value Queen is valid
    @SneakyThrows
    @Test
    public void testWhenCircleIsQueen() {
        assertEquals(true, bookAMovie.validateCircle("queen"));
    }

    //    Test to check if cirlc with any other value is throwing InvalidMovieTicketException or not
    @SneakyThrows
    @Test(expected = InvalidMovieTicketException.class)
    public void testWhenCircleIsInvalid() {
        assertEquals(false, bookAMovie.validateCircle("some invalid data"));
    }

    //    Test to check if a valid movie ticket can be added
    @Test
    @SneakyThrows
    public void testWhenMovieTicketIsValid() {
        boolean retValue = bookAMovie.addMovieTicket(1, "Eternal Sunshine Of A Spotless Mind",
                1, 40, "King", LocalDate.now());
        assertTrue(retValue);
    }

    //    Test to check if a invalid movie ticket raises InvalidMovieTicketException
    @SneakyThrows
    @Test(expected = InvalidMovieTicketException.class)
    public void testWhenMovieTicketIsInvalid() {
        boolean retValue = bookAMovie.addMovieTicket(1, "Eternal Sunshine Of A Spotless Mind",
                1, 40, "Kings", LocalDate.now());
        assertFalse(retValue);
    }

    //    Test to check if a valid movie id returns an object of MovieTicket
    @Test
    @SneakyThrows
    public void testWhenMovieTicketIdIsValid() {
        MovieTicket movieTicket = bookAMovie.viewMovieTicketById(1);
        assertEquals("Avengers", movieTicket.getMovieName());
    }

    //    Test to check if a valid movie id returns an object of MovieTicket
    @Test(expected = InvalidMovieTicketException.class)
    @SneakyThrows
    public void testWhenMovieTicketIdIsInValid() {
        MovieTicket movieTicket = bookAMovie.viewMovieTicketById(1234);
        assertEquals("Avengers", movieTicket.getMovieName());
    }

    //    Test to check if a valid screen number returns a list of movies played in that screen
    @Test
    public void testWhenScrenNumberIsValid() {
        List<MovieTicket> movieTickets = bookAMovie.viewMovieTicketByScreen(1);
        assertEquals(6, movieTickets.size());
    }

    //    Test to check if a invalid screen number returns an InvalidMovieTicketException
    @Test
    public void testWhenScrenNumberIsInValid() {
        List<MovieTicket> movieTickets = bookAMovie.viewMovieTicketByScreen(112);
        assertEquals(0, movieTickets.size());
    }

    @Test
    public void testVewTicketsMovieWise() {
        Map<String, List<MovieTicket>> stringListMap = bookAMovie.viewTicketsMovieWise();
        assertEquals(3, stringListMap.get("Avengers").size());
    }

    @Test
    public void testViewScreenWiseTotalSeatsBooked(){
        Map<Integer, Integer> totalSeatsBooked =
                bookAMovie
                        .viewScreenWiseTotalSeatsBooked(
                                LocalDate.parse("2020-09-01"),
                                LocalDate.parse("2020-09-30"));
        assertEquals(2,
                totalSeatsBooked.get(1).intValue());
    }
}