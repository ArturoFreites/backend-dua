package municipalidad.dua.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "runner_mult")
public class RunnerMult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Runner> runnerList;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private Team team;
    @OneToOne
    private Kit kit;

    public RunnerMult() {
    }

    public RunnerMult(Integer id, List<Runner> runnerList, Category category, Vehicle vehicle, Team team, Kit kit) {
        this.id = id;
        this.runnerList = runnerList;
        this.category = category;
        this.vehicle = vehicle;
        this.team = team;
        this.kit = kit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Runner> getRunnerList() {
        return runnerList;
    }

    public void setRunnerList(List<Runner> runnerList) {
        this.runnerList = runnerList;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }
}
