import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import sun.security.krb5.internal.Ticket;

public class BookAMovieTest {

	static BookAMovie bookAMovie;

	@Before
	public void setUp() throws Exception {
		bookAMovie = new BookAMovie();
		// Try to create few MovieTicket objects and add to a list.
		// Set that list to movieTicketList in BookAMovie using setMovieTicketList
		// method
		MovieTicket movieTicket = new MovieTicket(1, "Avengers", 1, 2, "King", LocalDate.parse("2020-11-10"));
		MovieTicket movieTicket1 = new MovieTicket(2, "Dhoom", 1, 4, "Queen", LocalDate.parse("2020-11-05"));
		MovieTicket movieTicket2 = new MovieTicket(3, "Dhoom1", 2, 2, "King", LocalDate.parse("2020-11-06"));
		MovieTicket movieTicket3 = new MovieTicket(4, "Dhoom2", 1, 2, "King", LocalDate.parse("2020-10-10"));
		MovieTicket movieTicket4 = new MovieTicket(5, "Dhoom3", 3, 3, "Queen", LocalDate.parse("2020-11-02"));
		MovieTicket movieTicket5 = new MovieTicket(6, "Dhoom4", 1, 5, "King", LocalDate.parse("2020-09-04"));
		MovieTicket movieTicket6 = new MovieTicket(7, "Dhoom5", 2, 2, "Queen", LocalDate.parse("2020-11-10"));
		MovieTicket movieTicket7 = new MovieTicket(8, "Dhoom6", 1, 2, "King", LocalDate.parse("2020-10-07"));
		MovieTicket movieTicket8 = new MovieTicket(9, "Dhoom7", 1, 2, "King", LocalDate.parse("2020-09-26"));
		MovieTicket invalidKing = new MovieTicket(10, "Dhoom8", 1, 2, "Kin", LocalDate.parse("2020-09-26"));
		MovieTicket invalidQueen = new MovieTicket(11, "Dhoom9", 1, 2, "Queas", LocalDate.parse("2020-09-26"));
		ArrayList<MovieTicket> list = new ArrayList<MovieTicket>();
		list.add(movieTicket);
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

	@Test
	public void test11ValidateCircleWhenKing() throws InvalidMovieTicketException {

		assertTrue(bookAMovie.validateCircle("king"));

		// test the validateCircle method when a valid circle �king� is provided

	}

	@Test
	public void test12ValidateCircleWhenQueen() throws InvalidMovieTicketException {

		assertTrue(bookAMovie.validateCircle("queen"));
		// test the validateCircle method when a valid circle �queen� is provided.

	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test13ValidateCircleWhenInvalid() throws InvalidMovieTicketException {

		assertTrue(bookAMovie.validateCircle("kings"));

		// test the validateCircle method when an invalid circle is passed to this
		// method
	}

	@Test
	public void test14AddMovieTicketForValidCircle() throws InvalidMovieTicketException {
		// int ticketId, String movieName, int screenNumber, int numberOfSeats, String
		// circle,LocalDate showDate
		bookAMovie.add(10, "Dhoom8", 1, 2, "King", LocalDate.parse("2020-09-26"));

		// test the addMovieTicket method when valid circle is provided for the
		// MovieTicket

	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test15AddMovieTicketForInvalidCircle() throws InvalidMovieTicketException {
		bookAMovie.addMovieTicket(10, "Dhoom8", 1, 2, "Kin", LocalDate.parse("2020-09-26"));

		// test the addMovieTicket method when invalid circle is provided for the
		// MovieTicket

	}

	@Test
	public void test16ViewMovieTicketByIdForValidId() throws InvalidMovieTicketException {
		MovieTicket ticket = bookAMovie.viewMovieTicketById(1);
		assertTrue(ticket.getMovieName().equals("Avengers"));
		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// exists in
		// the movieTicketList

	}

	@Test(expected = InvalidMovieTicketException.class)
	public void test17ViewMovieTicketByIdForInvalidId() throws InvalidMovieTicketException {
		MovieTicket ticket = bookAMovie.viewMovieTicketById(50);

		// test the viewMovieTicketById method when a ticketId is passed as parameter
		// does not exist in the movieTicketList

	}

	@Test
	public void test18ViewMovieTicketByScreen() {

		List<MovieTicket> list = bookAMovie.viewMovieTicketByScreen(1);
		assertEquals(6, list.size());
		// test the viewMovieTicketByScreen method

	}

	@Test
	public void test19VewTicketsMovieWise() {
		Map<String, List<MovieTicket>> test = bookAMovie.viewTicketsMovieWise();
		assertEquals(9, test.size());

		// test the viewTicketsMovieWise method

	}

	@Test
	public void test20ViewScreenWiseTotalSeatsBooked() {

		Map<Integer, Integer> screens = bookAMovie.viewScreenWiseTotalSeatsBooked(LocalDate.parse("2020-08-01"),
				LocalDate.parse("2020-12-30"));

		assertEquals(3, screens.size());

		// test the viewScreenWiseTotalSeatsBooked method

	}

}
