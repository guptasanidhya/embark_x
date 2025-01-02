package com.embarkx.firstjobapp.review;


import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);
    boolean createReview(Long companyId,Review review);
    Review getReview(Long companyId, Long reviewId);
    boolean updateReview(Long companyId, Review updatedReview,Long reviewId );
    boolean deleteReview(Long companyId, Long reviewId);
}
