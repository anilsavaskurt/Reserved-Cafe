package com.reserved.cafe.repositories;

import com.reserved.cafe.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    Restaurant getRestaurantByRestaurantId(int restaurantId);
    Restaurant getRestaurantByAdressAndClosingTime(String adress, String closingTime);
}