package com.p5.adoptions_v2api.reosotory.animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {

    Optional<Animal> findByNameAndAndPhoto(String name, String photo);

    //Hql query
    @Query("select a.id, a.name, a.photo from Animal a where a.name = :name")
    Optional<Animal> getByName(@Param("name")String name);

    //Native query
    @Query(value = "select * from animal where name = :name", nativeQuery = true)
    Optional<Animal> getNative(@Param("name")String name);

}
