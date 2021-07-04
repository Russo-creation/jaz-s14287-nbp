package com.example.jaznumer_indeksunbp.nbp.service;

import com.example.jaznumer_indeksunbp.nbp.model.NbpResponse;
import com.example.jaznumer_indeksunbp.nbp.model.Root;
import com.example.jaznumer_indeksunbp.nbp.repository.NbpApiResponseRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NbpApiResponseRepository nbpApiResponseRepository;

    public NbpService(RestTemplate restTemplate, NbpApiResponseRepository nbpApiResponseRepository) {
        this.restTemplate = restTemplate;
        this.nbpApiResponseRepository = nbpApiResponseRepository;
    }

    public NbpResponse calculateRootForGoldPrice(String startDate, String endDate){
        // Java token error
//        String url = "http://api.nbp.pl/api/cenyzlota/"+startDate+"/"+endDate;
//        Root root = restTemplate.getForObject(url, Root.class);



//        double average = calculate(root.getRates());
        double average = 10.10;
        NbpResponse nbpResponse = getNbpResponse(startDate, endDate,average);

        return nbpApiResponseRepository.save(nbpResponse);
    }

    private NbpResponse getNbpResponse(String startDate, String endDate, double calculate){

        NbpResponse nbpResponse=new NbpResponse();
        nbpResponse.setStartDate(startDate);
        nbpResponse.setEndDate(endDate);
        nbpResponse.setAverage(calculate);
        nbpResponse.setCategory(nbpResponse.getCategory());
        nbpResponse.setCreatedAt(LocalDateTime.now());
        return nbpResponse;
    }

}
