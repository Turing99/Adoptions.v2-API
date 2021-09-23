package com.p5.adoptions_v2api.reosotory.shelter;

import com.p5.adoptions_v2api.reosotory.cats.Cat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AnimalShelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    //    Unidirectional OneToMany
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "shelter_id")
    private List<Cat> cats = new ArrayList<>();

    public List<Cat> getCats() {
        return cats;
    }

    //    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //    @JoinColumn(name = "cat_id")
    //    private Cat cat;

    //    Bidirectional
    //    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shelter")
    //    private List<Cat> cats = new ArrayList<>();

    //    @ManyToMany
    //    @JoinTable(name = "shelters_cats",
    //               joinColumns = @JoinColumn(name = "shelter_id", referencedColumnName = "id"),
    //               inverseJoinColumns = @JoinColumn(name = "cat_id", referencedColumnName = "id"))
    //    private List<Cat> cats = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public AnimalShelter setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AnimalShelter setName(String name) {
        this.name = name;
        return this;
    }
}
