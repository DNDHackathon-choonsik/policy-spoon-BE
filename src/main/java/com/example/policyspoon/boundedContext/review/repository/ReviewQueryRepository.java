package com.example.policyspoon.boundedContext.review.repository;

import static com.example.policyspoon.boundedContext.review.entity.QReview.review;

import com.example.policyspoon.boundedContext.review.entity.Review;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;


@Slf4j
@Repository
@RequiredArgsConstructor
public class ReviewQueryRepository {

    private final JPAQueryFactory query;

    public List<Review> findAllByCategory(String category) {
        return query
                .selectFrom(review)
                .where(
                        review.category.eq(category)
                )
                .orderBy(review.id.desc())
                .fetch();
    }

    public List<Review> findAll(String title) {
        return query
                .selectFrom(review)
                .where(
                        review.policyTitle.like("%" + title + "%")
                )
                .orderBy(review.id.desc())
                .fetch();
    }
}
