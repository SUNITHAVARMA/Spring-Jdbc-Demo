package com.stackroute.springJdbc.mapper;

import com.stackroute.springJdbc.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Movie movie = new Movie();
        movie.setMovieId(rs.getInt("MOVIEID"));
        movie.setMovieName(rs.getString("MOVIENAME"));
        movie.setReleasedYear(rs.getInt("RELEASEDYEAR"));
        movie.setRatings(rs.getFloat("RATINGS"));
        return movie;
    }
}
