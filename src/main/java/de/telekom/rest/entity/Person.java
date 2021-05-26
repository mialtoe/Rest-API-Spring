package de.telekom.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;





@Entity
@Table(name="person")
public class Person {

	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  private String vorname;
	  private String nachname;
	  private Date geburtsdatum;
	  
	  public Date getGeburtsdatum() {
		 return geburtsdatum;
	  }

	  public void setGeburtsdatum(Date geburtsdatum) {
		 this.geburtsdatum = geburtsdatum;
	  }

	
	  public Person () {
      }
	  
	  public Person(String vname, String nname, Date gebdatum) {
		  this.vorname = vname;
		  this.nachname=nname;
		  this.geburtsdatum = gebdatum;
	  }
	
	  public String getVorname() {
		  return vorname;
	  }
	  
	  public void setVorname(String vname) {
		  this.vorname =  vname;
	  }
	  
	  public String getNachname() {
		  return nachname;
	  }
	  public void setNachname(String nname) {
		  this.nachname =  nname;
	  }

	  public Long getId() {
		return id;
	  }

	  public void setId(Long id) {
		this.id = id;
	  }
	  
	  
}
