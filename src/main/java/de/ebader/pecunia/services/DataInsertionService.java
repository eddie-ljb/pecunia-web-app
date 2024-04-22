package de.ebader.pecunia.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.ebader.pecunia.entities.inventar.InventarMinecraft;
import de.ebader.pecunia.repositories.inventar.InventarMinecraftRepository;

@Service
public class DataInsertionService {

	@Autowired
	private InventarMinecraftRepository inventarRepository;
	
	
	@Transactional("inventarTransactionManager")
	public void schreibeDatenInInventarDB(String zuhoerigkeit, Date datum, Long bankguthaben, Long chunks, Long spielerzahl, Long stadtzahl) {
		InventarMinecraft ivMinecraft = new InventarMinecraft();
		ivMinecraft.setBankguthaben(bankguthaben);
		ivMinecraft.setChunks(chunks);
		ivMinecraft.setDatum(datum);
		ivMinecraft.setSpielerzahl(spielerzahl);
		ivMinecraft.setStadtzahl(stadtzahl);
		ivMinecraft.setZugehoerigkeit(zuhoerigkeit);
		inventarRepository.save(ivMinecraft);
	}
	
	
	
	
	
}
