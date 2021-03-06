package samplest.jacksonviews;

import com.google.common.collect.Lists;
import restx.annotations.GET;
import restx.annotations.Produces;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

import java.util.List;

/**
 * User: eoriou
 * Date: 04/12/2013
 * Time: 11:15
 */

@RestxResource
@Component
public class JacksonViewsResource {

    @GET("/jacksonviews/carsDetails")
    @Produces("application/json;view=samplest.jacksonviews.Views$Details")
    @PermitAll
    public List<Car> getCarDetails() {
        return getAllCars();
    }

    @GET("/jacksonviews/cars")
    @PermitAll
    public List<Car> getCars() {
        return getAllCars();
    }

    private List<Car> getAllCars() {
        return Lists.newArrayList(
                new Car().setBrand("Brand1").setModel("Model1").setDetails("Detail1"),
                new Car().setBrand("Brand1").setModel("Model2").setDetails("Detail2").setStatus("status detail 2")
        );
    }
}
