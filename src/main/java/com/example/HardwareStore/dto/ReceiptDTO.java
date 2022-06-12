package com.example.HardwareStore.dto;


import com.example.HardwareStore.collection.Provider;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReceiptDTO {

    private String id;
    private String providers;
    private Integer units;
    private String productId;
    private String date;

    public ReceiptDTO(){

    }

}


