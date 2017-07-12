package net.blitzstein.learning.beerdemo.web;

import net.blitzstein.learning.beerdemo.domain.Beer;
import net.blitzstein.learning.beerdemo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jaredblitzstein on 7/11/17.
 */
@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping
    public Iterable<Beer> all() {
        return beerService.findAll();
    }

    @GetMapping("/{id}")
    public Beer getBeer(@PathVariable String id) {
        return beerService.byId(id);
    }
}
