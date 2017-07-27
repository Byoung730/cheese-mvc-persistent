package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Created by Brian Young on 7/22/2017.
 */


@Repository
@Transactional

public interface CategoryDao extends CrudRepository<Category, Integer> {
}
