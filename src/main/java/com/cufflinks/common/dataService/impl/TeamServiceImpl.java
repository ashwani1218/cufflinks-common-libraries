package com.cufflinks.common.dataService.impl;

import com.cufflinks.common.dao.TeamRepository;
import com.cufflinks.common.dataService.TeamService;
import com.cufflinks.common.dto.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Optional<Team> findByTeamName(String teamName){
        return teamRepository.findByTeamName(teamName);
    }
}
