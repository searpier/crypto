package com.example.crypto.coin.repository;

import com.example.crypto.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {

    @Autowired
    CoinMapper mapper;

    public int insertBuy(HashMap<String,String> params){
        return mapper.insertBuy(params);
    }
    public ArrayList<HashMap<String,Object>> selectBuy(String email){
        return mapper.selectBuy(email);
    }
}
