package net.blitzstein.learning.beerdemo;

import net.blitzstein.learning.beerdemo.domain.Beer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jaredblitzstein on 7/11/17.
 */
public interface BeerRepository extends CrudRepository<Beer, String> {
}
