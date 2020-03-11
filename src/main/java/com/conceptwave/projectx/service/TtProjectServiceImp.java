package com.conceptwave.projectx.service;

import com.conceptwave.projectx.dao.TtProjectRepository;
import com.conceptwave.projectx.entity.TtProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TtProjectServiceImp implements TtProjectService {
    @Autowired
    private TtProjectRepository ttProjectRepository;

    @Override
    public List<TtProject> findAll() {
        return ttProjectRepository.findAll();
    }
}
