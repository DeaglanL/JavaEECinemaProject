package interoperability;

import business.MovieService;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/cinema")
public class MovieEndPoint {

	@Inject
	private MovieService movieService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getMoviesAsJson() {
		return movieService.getMovie();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewMovieToDB(String movieJson) {
		return movieService.addMovie(movieJson);
	}



}
