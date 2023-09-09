package municipalidad.dua.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RunnerMultDTO {

    private String name;
    private String lastName;
    private String dni;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthdate;
    private Integer genderId;
    private String city;
    private String phoneNumber;
    private String email;
    private Integer kitId;

    private String name2;
    private String lastName2;
    private String dni2;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthdate2;
    private Integer gender2Id;
    private String city2;
    private String phoneNumber2;
    private String email2;
    private String categoryName;
    private Integer vehicleId;
    private Integer teamId;

    public RunnerMultDTO() {
    }

    public RunnerMultDTO(String name, String lastName, String dni, Date birthdate, Integer genderId, String city, String phoneNumber, String email, Integer kitId, String name2, String lastName2, String dni2, Date birthdate2, Integer gender2Id, String city2, String phoneNumber2, String email2, String categoryName, Integer vehicleId, Integer teamId) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthdate = birthdate;
        this.genderId = genderId;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.kitId = kitId;
        this.name2 = name2;
        this.lastName2 = lastName2;
        this.dni2 = dni2;
        this.birthdate2 = birthdate2;
        this.gender2Id = gender2Id;
        this.city2 = city2;
        this.phoneNumber2 = phoneNumber2;
        this.email2 = email2;
        this.categoryName = categoryName;
        this.vehicleId = vehicleId;
        this.teamId = teamId;
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

    public Integer getKitId() {
        return kitId;
    }

    public void setKitId(Integer kitId) {
        this.kitId = kitId;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getDni2() {
        return dni2;
    }

    public void setDni2(String dni2) {
        this.dni2 = dni2;
    }

    public Date getBirthdate2() {
        return birthdate2;
    }

    public void setBirthdate2(Date birthdate2) {
        this.birthdate2 = birthdate2;
    }

    public Integer getGender2Id() {
        return gender2Id;
    }

    public void setGender2Id(Integer gender2Id) {
        this.gender2Id = gender2Id;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
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
}
