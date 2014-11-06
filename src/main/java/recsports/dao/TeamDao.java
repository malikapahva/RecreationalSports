package recsports.dao;

import recsports.domain.Team;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

@Component
public class TeamDao {

    public Collection<Team> findAllTeams() {
        // go to db and fetch all teams
        Team team1 = new Team(111l);
        team1.setTeamName("Team 1");

        Team team2 = new Team(123l);
        team2.setTeamName("Team 2");

        return Arrays.asList(team1, team2);
    }

}
