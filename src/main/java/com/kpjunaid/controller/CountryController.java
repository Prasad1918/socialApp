package com.kpjunaid.controller;

import com.kpjunaid.entity.Country;
import com.kpjunaid.service.CountryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {
    private final CountryService countryService;
    private static final Logger logger = LogManager.getLogger(CountryController.class);

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ResponseEntity<?> getCountryList() {
        logger.info("Fetching country list...");
        try {
            List<Country> countryList = countryService.getCountryList();
            logger.info("Country list fetched successfully.");
            return new ResponseEntity<>(countryList, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error occurred while fetching country list", e);
            return new ResponseEntity<>("Error occurred while fetching country list", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
