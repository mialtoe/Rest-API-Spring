package de.telekom.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import de.telekom.rest.lookup.*;




@Entity
@Table(name="person")
public class Person {

	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  private String vorname;
	  private String nachname;
	  private Salutation anrede;
	  
	  public Salutation getAnrede() {
		 return anrede;
	  }

	  public void setAnrede(byte b) {
		 this.anrede = Salutation.fromByte(b);
	  }

	
	  public Person () {
      }
	  
	  public Person(String vname, String nname, Salutation anrede) {
		  this.vorname = vname;
		  this.nachname=nname;
		  this.anrede = anrede;
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
