package com.conceptwave.projectx.rest;

import com.conceptwave.projectx.entity.TtProject;
import com.conceptwave.projectx.service.TtProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tt-project")
public class TtProjectController {
    @Autowired
    private TtProjectService ttProjectService;

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<TtProject> findAll(){
        return ttProjectService.findAll();
    }
}
