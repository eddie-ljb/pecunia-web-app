package de.ebader.pecunia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HibernateUtil {
	
	public static void createSequence() throws SQLException {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://pecunia-web-pecunia-web.b.aivencloud.com:26571/pecunia-inventur-minecraft", "avnadmin", "AVNS_ZowLrPEs2We4NQLgXXi")) {
			try (Statement statement = connection.createStatement()) {
				statement.executeUpdate("CREATE TABLE inventur_minecraft.inventur (ZUGEHOERIGKEIT VARCHAR(255) NOT NULL, DATUM DATE NOT NULL, BANKGUTHABEN BIGINT NOT NULL, CHUNKS BIGINT NOT NULL, SPIELERZAHL BIGINT NOT NULL, STADTZAHL BIGINT, PRIMARY KEY (ZUGEHOERIGKEIT));");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
