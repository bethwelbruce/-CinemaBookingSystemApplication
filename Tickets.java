package booking;
	import lombok.Data;

	@Data
	public class Tickets {

	    private Long id;
	    User user;
	    CinemaRoom cinemaRoom;
	    Seats seat;
	    Movie movie;
	    Integer price;

	}

