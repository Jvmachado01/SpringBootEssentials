package turkey.wild.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import turkey.wild.springboot.domain.Film;

import java.util.List;

@RestController
@RequestMapping("film")
public class FilmController {

    // localhost:8080/film/list
//    @RequestMapping(method = RequestMethod.GET, path = "list") // Deprecated
    @GetMapping(path = "list")
    public List<Film> list() {
        return List.of(new Film("Pulp Fiction"), new Film("Scarface"));
    }
}
