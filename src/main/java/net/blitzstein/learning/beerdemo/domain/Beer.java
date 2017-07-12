package net.blitzstein.learning.beerdemo.domain;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;

/**
 * Created by jaredblitzstein on 7/11/17.
 */
@Document
public class Beer {
    @Field
    private String name, upc, type, brewery_id, description;
    private double abv, ibu, srm;

    public String getName() {
        return name;
    }

    public String getUpc() {
        return upc;
    }

    public String getType() {
        return type;
    }

    public String getBrewery_id() {
        return brewery_id;
    }

    public String getDescription() {
        return description;
    }

    public double getAbv() {
        return abv;
    }

    public double getIbu() {
        return ibu;
    }

    public double getSrm() {
        return srm;
    }
}
