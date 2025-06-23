package org.sid.cinema.dao;

import java.util.Collection;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Salle   {
  private Long id;
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private String name;
  private int nombrePlace;
  @ManyToOne
  private Cinema cinema;
  @OneToMany( mappedBy = "salle")
  private Collection<Place> places;
  @OneToMany(mappedBy = "salle")
  private Collection<Projection> projections; 
}
