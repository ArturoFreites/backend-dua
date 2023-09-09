package municipalidad.dua.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "runner_ind")
public class RunnerInd{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Runner runner;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private Team team;
    @OneToOne
    private Kit kit;

    public RunnerInd() {
    }

    public RunnerInd(Integer id, Runner runner, Category category, Vehicle vehicle, Team team, Kit kit) {
        this.id = id;
        this.runner = runner;
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

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
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
