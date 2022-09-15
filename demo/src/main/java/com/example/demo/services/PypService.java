package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PypModel;
import com.example.demo.repositories.PypRepositoriy;

@Service
public class PypService {
    @Autowired
    PypRepositoriy pypRepositoriy;

    public ArrayList<PypModel> obtenerPyp(){
       return (ArrayList<PypModel>) pypRepositoriy.findAll();
    }

    public PypModel guardarPyp(PypModel pyp){
        return pypRepositoriy.save(pyp);
    }
}
