package com.Luis0DEV.Domain.Services;

import com.Luis0DEV.Domain.Entity.tb_prd_product;
import com.Luis0DEV.Domain.Interface.Services.iservice_product;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class service_product implements iservice_product {
    public tb_prd_product get_product_by_id(UUID id){
        return null;
    }
    public tb_prd_product get_product_by_name(String product_name){
        return null;
    }
}
