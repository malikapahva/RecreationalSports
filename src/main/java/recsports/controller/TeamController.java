package recsports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import recsports.dao.TeamDao;
import recsports.domain.Team;

import java.util.Collection;

@Controller
@RequestMapping(value = "team")
public class TeamController {

    @Autowired
    private TeamDao teamDao;

    @RequestMapping(value = "showteams", method = RequestMethod.GET)
    public String showTeams(Model model) {
        Collection<Team> allTeams = teamDao.findAllTeams();
        model.addAttribute("teams", allTeams);
        return "team/showteams";
    }
    
}
