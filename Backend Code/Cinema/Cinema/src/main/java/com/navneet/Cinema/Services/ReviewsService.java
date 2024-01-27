package com.navneet.Cinema.Services;

import com.navneet.Cinema.Classes.Movies;
import com.navneet.Cinema.Classes.Reviews;
import com.navneet.Cinema.Repositories.ReviewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewsService {
    @Autowired
    private ReviewsRepo reviewsRepo;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Reviews createReview(String reviewBody, String imdbId){
        Reviews reviews= reviewsRepo.insert(new Reviews(reviewBody, LocalDateTime.now(),LocalDateTime.now()));

        //reviewsRepo.insert(reviews);

        mongoTemplate.update(Movies.class)
                .matching(Criteria.where("imdbId").is("imdbId"))
                .apply(new Update().push("reviewIds").value("review"))
                .first();

        return reviews;
    }
}
