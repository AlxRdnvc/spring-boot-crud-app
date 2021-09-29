package com.alxrdnvc.crudapp.controllers;

import com.alxrdnvc.crudapp.models.Nationality;
import com.alxrdnvc.crudapp.services.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class NationalityController {

    @Autowired
    private NationalityService nationalityService;

    @GetMapping("/nationalities")
    public String getNationalities(Model model){
        return "nationalities";
    }

    @GetMapping("/onenationality")
    @ResponseBody
    public Optional<Nationality> getNationalityById(Integer Id, Model model) {
        return nationalityService.getNationalityById(Id);
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST, RequestMethod.PUT})
    public String updateNationality(Nationality nationality) {
        nationalityService.updateNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(value = "/addnew", method = {RequestMethod.POST, RequestMethod.PUT})
    public String addNationality(Nationality nationality) {
        nationalityService.addNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteNationality(Integer Id) {
        nationalityService.deleteNationality(Id);
        return "redirect:/nationalities";
    }

}
