package com.reserved.cafe.services.managers;

import com.reserved.cafe.domain.DiningTable;
import com.reserved.cafe.domain.Restaurant;
import com.reserved.cafe.repositories.RestaurantRepository;
import com.reserved.cafe.services.interfaces.RestaurantService;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;
import com.reserved.cafe.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantManager implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public RestaurantManager(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public DataResult<Restaurant> getRestaurantByRestaurantId(int restaurantId) {
        return new DataResult<Restaurant>(this.restaurantRepository.getRestaurantByRestaurantId(restaurantId), true);
    }

    @Override
    public DataResult<Restaurant> getRestaurantByAdressAndClosingTime(String adress, String closingTime) {
        return new DataResult<Restaurant>(this.restaurantRepository.getRestaurantByAdressAndClosingTime(adress, closingTime), true);
    }

    @Override
    public BaseResult add(Restaurant restaurant) {
            this.restaurantRepository.save(restaurant);
            return new SuccessResult("Restoran Eklendi");
    }
}
