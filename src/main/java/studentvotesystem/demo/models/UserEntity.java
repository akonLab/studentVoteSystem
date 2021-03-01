package studentvotesystem.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;
    private String group;
    private Integer age;
    private String interest;
    private String role;

    public UserEntity() {
    }

    public UserEntity(String fullName, String group, Integer age, String interest, String role) {
        setFullName(fullName);
        setGroup(group);
        setAge(age);
        setInterest(interest);
        setRole(role);
    }

    public UserEntity(Integer id, String fullName, String group, Integer age, String interest, String role) {
        setId(id);
        setFullName(fullName);
        setGroup(group);
        setAge(age);
        setInterest(interest);
        setRole(role);
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


}
