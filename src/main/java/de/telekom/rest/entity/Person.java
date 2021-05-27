package de.telekom.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import de.telekom.rest.lookup.Salutation;




@Entity
@Table(name="person")
public class Person {

	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	  
	  private String vorname;
	  private String nachname;
	  private byte anrede;
	  
	  public byte getAnrede() {
//		  System.out.println("XXX"+Salutation.fromByte(this.anrede));
		 return anrede;
	  }

	  public void setAnrede(byte anrede) {
		 this.anrede = anrede;
//		 System.out.println("YYYY"+Salutation.fromByte(this.anrede));
	  }

	
	  public Person () {
      }
	  
	  public Person(String vname, String nname, byte anrede) {
		  this.vorname = vname;
		  this.nachname=nname;
		  this.anrede = anrede;
		  System.out.println("ZZZZ"+this.anrede);
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

	  public Integer getId() {
		return id;
	  }

	  public void setId(Integer id) {
		this.id = id;
	  }
	  
	  
}
