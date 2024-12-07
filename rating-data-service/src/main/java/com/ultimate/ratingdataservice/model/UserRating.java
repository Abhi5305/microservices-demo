package com.ultimate.ratingdataservice.model;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private List<Rating> UserRating;

    public List<Rating> getUserRating() {
        return UserRating;
    }

    public void setUserRating(List<Rating> userRating) {
        UserRating = userRating;
    }
}
