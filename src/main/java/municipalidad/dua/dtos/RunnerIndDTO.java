package municipalidad.dua.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RunnerIndDTO {
    private String name;
    private String lastName;
    private String dni;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthdate;
    private Integer genderId;
    private String city;
    private String phoneNumber;
    private String email;
    private Integer runneId;
    private String categoryName;
    private Integer vehicleId;
    private Integer teamId;
    private Integer kitId;

    public RunnerIndDTO() {
    }

    public RunnerIndDTO(String name, String lastName, String dni, Date birthdate, Integer genderId, String city, String phoneNumber, String email, Integer runneId, String categoryName, Integer vehicleId, Integer teamId, Integer kitId) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthdate = birthdate;
        this.genderId = genderId;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.runneId = runneId;
        this.categoryName = categoryName;
        this.vehicleId = vehicleId;
        this.teamId = teamId;
        this.kitId = kitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRunneId() {
        return runneId;
    }

    public void setRunneId(Integer runneId) {
        this.runneId = runneId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getKitId() {
        return kitId;
    }

    public void setKitId(Integer kitId) {
        this.kitId = kitId;
    }
}
