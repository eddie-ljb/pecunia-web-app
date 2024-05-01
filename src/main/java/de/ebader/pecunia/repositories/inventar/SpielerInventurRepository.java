package de.ebader.pecunia.repositories.inventar;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import de.ebader.pecunia.entities.inventar.SpielerInventur;

@Repository
public interface SpielerInventurRepository extends JpaRepository<SpielerInventur, Long>{

	@Query("SELECT spielerInv FROM SpielerInventur spielerInv WHERE spielerInv.spielername = :spielername")
	List<SpielerInventur> getSpielerInventareVonBestimmtenSpieler(@Param("spielername") String spielername);
	
	@Query("SELECT spielerInv FROM SpielerInventur spielerInv WHERE spielerInv.spielername = :spielername AND spielerInv.datum = :datumAktuell")
	SpielerInventur getSpielerInventarVonBestimmtenSpielerBeiBestimmtenDatum(@Param("spielername") String spielername, @Param("datumAktuell") Date date);

	@Query("SELECT spielerInv FROM SpielerInventur spielerInv ORDER BY spielerInv.bankguthaben DESC")
	List<SpielerInventur> getAlleSpielerInventare();
	
	
	@Query("SELECT spielerInv FROM SpielerInventur spielerInv WHERE spielerInv.datum = :datumAktuell ORDER BY spielerInv.bankguthaben DESC")
	List<SpielerInventur> getAlleSpielerInventareAnBestimmtenDatum(@Param("datumAktuell") Date date);
	
}
