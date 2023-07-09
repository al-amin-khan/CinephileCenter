package me.alaminkhan.CinephileCenter.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/list")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), HttpStatus.OK);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>> getAMovie(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.findAMovie(id) , HttpStatus.OK);
//    }


    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getAMovieByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.findAMovieByImdbId(imdbId) , HttpStatus.OK);
    }


//    @GetMapping("/{title}")
//    public ResponseEntity<Optional<List<Movie>>> getMovieByTitle(@PathVariable String title){
//        return new ResponseEntity<Optional<List<Movie>>>(movieService.findMovieByTitle(title) , HttpStatus.OK);
//    }
}
