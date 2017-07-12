package net.blitzstein.learning.beerdemo.service;

import net.blitzstein.learning.beerdemo.BeerRepository;
import net.blitzstein.learning.beerdemo.domain.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by jaredblitzstein on 7/11/17.
 */
@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public Iterable<Beer> findAll() {
       return beerRepository.findAll();
    }

    public Beer byId(String id) {
        return beerRepository.findOne(id);
    }
}
