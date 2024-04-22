package de.ebader.pecunia.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.ebader.pecunia.entities.inventar.InventarMinecraft;
import de.ebader.pecunia.repositories.inventar.InventarMinecraftRepository;

@Service
public class InventarService {
	
	@Autowired
	InventarMinecraftRepository inventarRepository;
	
	@Transactional("inventarTransactionManager")
	public List<InventarMinecraft> getAllInventarEintraegeFuerDatum(Date datum) {
		List<InventarMinecraft> inventare = new ArrayList<InventarMinecraft>();
		//inventare = inventarRepository.getInventarMinecraftVonBestimmtemDatum(datum);
		inventare = inventarRepository.getAllInventarMinecraft();
		return inventare;
	}

}
