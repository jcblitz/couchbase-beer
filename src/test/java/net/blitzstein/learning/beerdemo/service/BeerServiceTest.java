package net.blitzstein.learning.beerdemo.service;

import net.blitzstein.learning.beerdemo.BeerRepository;
import net.blitzstein.learning.beerdemo.domain.Beer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by jaredblitzstein on 7/12/17.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class BeerServiceTest {

    @Mock
    private BeerRepository beerRepository;

    @InjectMocks
    private BeerService beerService;

    @Test
    public void findAll() throws Exception {
        int allBeersInRepo = 3;
        List beers = new ArrayList<Beer>();
        for (int i = 0; i < allBeersInRepo; i++) {
            beers.add(new Beer());
        }
        when(beerRepository.findAll()).thenReturn(beers);
        Iterable<Beer> all = beerService.findAll();
        long size = all.spliterator().getExactSizeIfKnown();
        assertEquals(allBeersInRepo, size);
    }

    @Test
    public void byId() throws Exception {
    }

}