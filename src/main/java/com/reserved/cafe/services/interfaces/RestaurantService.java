package com.reserved.cafe.services.interfaces;

import com.reserved.cafe.domain.Restaurant;
import com.reserved.cafe.utilities.results.BaseResult;
import com.reserved.cafe.utilities.results.DataResult;

public interface RestaurantService {

    DataResult<Restaurant> getRestaurantByRestaurantId(int restaurantId);

    DataResult<Restaurant>  getRestaurantByAdressAndClosingTime(String adress, String closingTime);

    BaseResult add(Restaurant restaurant);
}
