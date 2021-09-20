package com.alxrdnvc.crudapp.services;

import com.alxrdnvc.crudapp.NationalityRepository;
import com.alxrdnvc.crudapp.models.Nationality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    public List<Nationality> getNationalities() {
        return (List<Nationality>) nationalityRepository.findAll();
    }

    public Optional<Nationality> getNationalityById(Integer Id) {
        return nationalityRepository.findById(Id);
    }

    public void addNationality(Nationality nationality) {
         nationalityRepository.save(nationality);
    }

    public void updateNationality(Nationality nationality) {
        nationalityRepository.save(nationality);
    }

    public void deleteNationality(Integer Id) {
        nationalityRepository.deleteById(Id);
    }
}
