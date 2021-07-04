package com.example.jaznumer_indeksunbp.nbp.controller;

import com.example.jaznumer_indeksunbp.nbp.model.NbpResponse;
import com.example.jaznumer_indeksunbp.nbp.service.NbpService;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nbp")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NbpResponse> calculateRootForCurrency(@RequestParam(defaultValue = "2013-01-31") String startDate, @RequestParam(defaultValue = "2013-01-31") String endDate){
        return ResponseEntity.ok(nbpService.calculateRootForCurrency(startDate, endDate));
    }
}


