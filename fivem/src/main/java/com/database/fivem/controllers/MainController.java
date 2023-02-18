package com.database.fivem.controllers;

import com.database.fivem.CRUDDatabase;
import com.database.fivem.model.Main;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    public MainController() {
    }


    @GetMapping("/mains/{id}")
    ResponseEntity<Main> getMainById(@PathVariable String id) {
        Main main = null;
        try {
            main = CRUDDatabase.INSTANCE.getMainById(id);
            if(main != null) return ResponseEntity.ok(main);
            else return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity<>(main, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/mains")
    ResponseEntity<Main> newMain(@RequestBody Main main) {
       try {
           CRUDDatabase.INSTANCE.createMain(main);
           return ResponseEntity.ok(main);
       }
       catch (Exception e) {
            return new ResponseEntity<>(main, HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
