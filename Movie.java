package booking;

import Lombok.Data;

@Data
public class Movie {

    private Long id;
    private String title;
    private String genre;
    private String releaseDate;
    private String duration;
    private String director;
    private String cast;
}
