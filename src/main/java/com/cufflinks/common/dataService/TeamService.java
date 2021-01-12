package com.cufflinks.common.dataService;

import com.cufflinks.common.dto.entity.Team;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface TeamService {

    public Optional<Team> findByTeamName(String teamName);
}
