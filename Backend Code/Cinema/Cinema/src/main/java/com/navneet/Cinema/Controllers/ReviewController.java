package com.navneet.Cinema.Controllers;

import com.navneet.Cinema.Classes.Reviews;
import com.navneet.Cinema.Services.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cinema/reviews")
public class ReviewController {

    @Autowired
    public ReviewsService reviewsService;

    @PostMapping()
    @CrossOrigin(origins = "*")
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload){

        return new ResponseEntity<Reviews>(reviewsService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
