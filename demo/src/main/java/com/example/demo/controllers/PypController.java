package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.PypModel;
import com.example.demo.services.PypService;

@RestController
@RequestMapping("/pyp")
public class PypController {
    @Autowired
    PypService pypService;

    @GetMapping()
    public ArrayList<PypModel> obtenerPyp(){
        return pypService.obtenerPyp();
    }

    @PostMapping()
    public PypModel guardarPyp(@RequestBody PypModel pyp){
        return this.pypService.guardarPyp(pyp);
    }
}
