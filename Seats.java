package booking;
	import lombok.Data;

	@Data
	public class Seats {

	    private Long id;
	    private CinemaRoom cinemaRoom;
	    private Integer row;
	    private Integer column;
	    private Boolean isBooked;

	}


