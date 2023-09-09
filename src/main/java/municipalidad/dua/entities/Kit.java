package municipalidad.dua.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "kit")

public class Kit {

    @Id
    private Integer id;
    private String time;

    public Kit() {
    }

    public Kit(Integer id, String time) {
        this.id = id;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
