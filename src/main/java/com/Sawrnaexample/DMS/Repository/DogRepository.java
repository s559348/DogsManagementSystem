package com.Sawrnaexample.DMS.Repository;
/**
*
* @author  Swarna Ashok kumar S559348
*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.Sawrnaexample.DMS.Model.Dog;


@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
