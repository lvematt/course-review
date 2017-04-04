package online.rentanggeng.courses.dao;

import online.rentanggeng.courses.exc.DaoException;
import online.rentanggeng.courses.model.Course;

import java.util.List;

/**
 * Created by gengrentang on 2017-02-10.
 */
public interface CourseDao {
    void add(Course course) throws DaoException;

    List<Course> findAll();

    Course findById(int id);
}
