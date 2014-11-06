package recsports.domain;

public class Team {
    
    private long id;
    
    private String teamName;

    public Team() {
        // generate Id
    }

    public Team(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
