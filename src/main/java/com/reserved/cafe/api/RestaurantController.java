package com.reserved.cafe.api;


import com.reserved.cafe.domain.DiningTable;
import com.reserved.cafe.domain.Restaurant;
import com.reserved.cafe.services.interfaces.RestaurantService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    @Autowired
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/getById")
    public DataResult<Restaurant> getRestaurantByRestaurantId(int id){
        return this.restaurantService.getRestaurantByRestaurantId(id);
    }

    @GetMapping("/getByAdressAndClosingTime")
    public DataResult<Restaurant> getRestaurantByAdressAndClosingTime(String adress, String closingTime){
        return this.restaurantService.getRestaurantByAdressAndClosingTime(adress,closingTime);
    }

    @PostMapping("/add")
    public BaseResult add(Restaurant restaurant){
        return this.restaurantService.add(restaurant);
    }
}
