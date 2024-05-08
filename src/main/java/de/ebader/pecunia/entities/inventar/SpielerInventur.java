package de.ebader.pecunia.entities.inventar;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "spieler_inventur", schema = "inventur_minecraft")
public class SpielerInventur {
	
	@jakarta.persistence.Id
	@Column(name = "id", nullable = false)
	private Long Id;
	
	@Column(name = "spielername", nullable = false)
	private String spielername;
	
	@Column(name = "stadtzugehoerigkeit", nullable = false)
	private String stadtzugehoerigkeit;
	
	@Column(name = "datum", nullable = false)
	private Date datum;
	
	@Column(name = "bankguthaben", nullable = false)
	private Long bankguthaben;
	
	@Column(name = "platzierunginsgesamt")
	private Long platz;
	
	// GETTER UND SETTER

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getSpielername() {
		return spielername;
	}

	public void setSpielername(String spielername) {
		this.spielername = spielername;
	}

	public String getStadtzugehoerigkeit() {
		return stadtzugehoerigkeit;
	}

	public void setStadtzugehoerigkeit(String stadtzugehoerigkeit) {
		this.stadtzugehoerigkeit = stadtzugehoerigkeit;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Long getBankguthaben() {
		return bankguthaben;
	}

	public void setBankguthaben(Long bankguthaben) {
		this.bankguthaben = bankguthaben;
	}

	public Long getPlatz() {
		return platz;
	}

	public void setPlatz(Long platz) {
		this.platz = platz;
	}
	
	
}
