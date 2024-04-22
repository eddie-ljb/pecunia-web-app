package de.ebader.pecunia.entities.inventar;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "inventur", schema = "inventur_minecraft")
public class InventarMinecraft {

	@jakarta.persistence.Id
	@Column(name = "zugehoerigkeit", nullable = false)
	private String zugehoerigkeit;
	
	@Column(name = "datum", nullable = false)
	private Date datum;
	
	@Column(name = "bankguthaben", nullable = false)
	private Long bankguthaben;
	
	@Column(name = "chunks", nullable = false)
	private Long chunks;
	
	@Column(name = "spielerzahl", nullable = false)
	private Long spielerzahl;
	
	@Column(name = "stadtzahl", nullable = true)
	private Long stadtzahl;
	
	public String getZugehoerigkeit() {
		return zugehoerigkeit;
	}

	public void setZugehoerigkeit(String zugehoerigkeit) {
		this.zugehoerigkeit = zugehoerigkeit;
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

	public Long getChunks() {
		return chunks;
	}

	public void setChunks(Long chunks) {
		this.chunks = chunks;
	}

	public Long getSpielerzahl() {
		return spielerzahl;
	}

	public void setSpielerzahl(Long spielerzahl) {
		this.spielerzahl = spielerzahl;
	}

	public Long getStadtzahl() {
		return stadtzahl;
	}

	public void setStadtzahl(Long stadtzahl) {
		this.stadtzahl = stadtzahl;
	}
	
	
}
