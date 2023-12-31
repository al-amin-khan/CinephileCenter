package me.alaminkhan.CinephileCenter.Movie;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> findAMovie(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> findAMovieByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

    public Optional<List<Movie>> findMovieByTitle(String title){
        return movieRepository.findMovieByTitleIsContainingIgnoreCase(title);
    }




}
