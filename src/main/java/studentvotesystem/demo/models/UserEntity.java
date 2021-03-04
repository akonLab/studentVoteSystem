package studentvotesystem.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;
    private String group;
    private Integer age;
    private String interest;
    private String role;
    private String authorities;

    public UserEntity() {
    }

    public UserEntity(String fullName, String group, Integer age, String interest, String role, String authorities) {

        this.fullName = fullName;
        this.group = group;
        this.age = age;
        this.interest = interest;
        this.role = role;
        this.authorities = authorities;
    }

    public UserEntity(Integer id, String fullName, String group, Integer age, String interest, String role, String authorities) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.age = age;
        this.interest = interest;
        this.role = role;
        this.authorities = authorities;
    }

    //getter
    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroup() {
        return group;
    }

    public Integer getAge() {
        return age;
    }

    public String getInterest() {
        return interest;
    }

    public String getRole() {
        return role;
    }

    public String getAuthorities() {
        return authorities;
    }

    //setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}
