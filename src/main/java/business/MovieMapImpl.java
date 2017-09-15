package business;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class MovieMapImpl implements MovieService {

    @Override
    public String addMovie(String jsonMovie) {
        return null;
    }

    @Override
    public String getMovie() {
        return null;
    }
}
