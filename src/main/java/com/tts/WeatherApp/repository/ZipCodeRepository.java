package com.tts.WeatherApp.repository;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode,Long> {

    List<ZipCode> findAll();
    //List<ZipCode> findByZipCode(String zipCode);
    ZipCode deleteById(long id);
    ZipCode findById(long id);
}
