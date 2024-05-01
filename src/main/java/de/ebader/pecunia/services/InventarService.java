package de.ebader.pecunia.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.ebader.pecunia.entities.inventar.InventarMinecraft;
import de.ebader.pecunia.entities.inventar.SpielerInventur;
import de.ebader.pecunia.repositories.inventar.InventarMinecraftRepository;
import de.ebader.pecunia.repositories.inventar.SpielerInventurRepository;

@Service
public class InventarService {
	
	@Autowired
	InventarMinecraftRepository inventarRepository;
	@Autowired
	SpielerInventurRepository spielerRepository;
	
	@Transactional("inventarTransactionManager")
	public List<InventarMinecraft> getAllInventarEintraegeFuerDatum(Date datum) {
		List<InventarMinecraft> inventare = new ArrayList<InventarMinecraft>();
		inventare = inventarRepository.getAllInventarMinecraft();
		return inventare;
	}
	
	@Transactional("inventarTransactionManager")
	public List<SpielerInventur> getAlleSpielerInventarFuerBestimmtesDatum(Date datum) {
		List<SpielerInventur> inventare = new ArrayList<SpielerInventur>();
		inventare = spielerRepository.getAlleSpielerInventare();
		return inventare;
	}

}
