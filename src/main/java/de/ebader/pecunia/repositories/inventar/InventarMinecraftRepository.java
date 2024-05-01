package de.ebader.pecunia.repositories.inventar;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import de.ebader.pecunia.entities.inventar.InventarMinecraft;

@Repository
public interface InventarMinecraftRepository extends JpaRepository<InventarMinecraft, String> {
	
	@Query("SELECT ivMinecraft FROM InventarMinecraft ivMinecraft WHERE ivMinecraft.datum = :datumAktuell ORDER BY ivMinecraft.bankguthaben DESC")
	List<InventarMinecraft> getInventarMinecraftVonBestimmtemDatum(@Param("datumAktuell") Date datumAktuell);
	
	@Query("SELECT ivMinecraft FROM InventarMinecraft ivMinecraft ORDER BY ivMinecraft.bankguthaben DESC")
	List<InventarMinecraft> getAllInventarMinecraft();
	

}
