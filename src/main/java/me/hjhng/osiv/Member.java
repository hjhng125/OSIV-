package me.hjhng.osiv;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member implements MemberView{

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Team team;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
