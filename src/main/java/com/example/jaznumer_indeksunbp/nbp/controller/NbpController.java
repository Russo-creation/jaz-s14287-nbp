package com.example.jaznumer_indeksunbp.nbp.controller;

import com.example.jaznumer_indeksunbp.nbp.model.NbpResponse;
import com.example.jaznumer_indeksunbp.nbp.service.NbpService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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


    @ApiOperation(value = "Get average price for given date ranges",
            response = NbpResponse.class,
            notes = "this method will return NbpResponse id, average price, timeOfRequest or HTTP 404 if not found")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Nbp api not found"),
            @ApiResponse(code = 500, message = "Unexpected Error"),
    })
    @GetMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NbpResponse> calculateRootForPrice(
            @ApiParam(name ="startDate",
                    type="string",
                    value= "date",
                    example = "2013-01-31",
                    required = true)
            @RequestParam(defaultValue = "2013-01-31") String startDate,

            @ApiParam(name ="endDate",
                    type="string",
                    value= "date",
                    example = "2013-01-31",
                    required = true)
            @RequestParam(defaultValue = "2013-01-31") String endDate){
        return ResponseEntity.ok(nbpService.calculateRootForGoldPrice(startDate, endDate));
    }
}


