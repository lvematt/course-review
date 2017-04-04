package online.rentanggeng.courses.dao;

import online.rentanggeng.courses.exc.DaoException;
import online.rentanggeng.courses.model.Review;

import java.util.List;

/**
 * Created by gengrentang on 2017-02-10.
 */
public interface ReviewDao {
    void add(Review review) throws DaoException;

    List<Review> findAll();

    List<Review> findByCourseId(int courseId);
}
