package ru.iu3.backend.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.*;
import ru.iu3.backend.models.Artist;
import ru.iu3.backend.models.Museum;


@Entity
@Table(name = "paintings")
@Access(AccessType.FIELD)
public class Painting {
    public Painting() {}

    public Painting(Long id) { this.id = id; }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public long id;

    @Column(name = "name", nullable = false, unique = true)
    public String name;

    @ManyToOne
    @JoinColumn(name="artistid")
    public Artist artist;

    @ManyToOne
    @JoinColumn(name="museumid")
    public Museum museum;

    @Column(name = "year")
    public long year;

}