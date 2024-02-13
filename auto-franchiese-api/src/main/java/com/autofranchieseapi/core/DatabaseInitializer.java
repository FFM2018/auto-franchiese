package com.autofranchieseapi.core;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements InitializingBean {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public void afterPropertiesSet() throws Exception {
    jdbcTemplate.execute(

      "CREATE TABLE IF NOT EXISTS insured ("
    + "id INT AUTO_INCREMENT PRIMARY KEY,"
    + " full_name VARCHAR(100) NOT NULL,"
    + " telephone VARCHAR(20) NOT NULL,"
    + " email VARCHAR(80) NOT NULL,"
    + " document VARCHAR(20) NOT NULL);"
    		
	+ " CREATE TABLE IF NOT EXISTS reason_damage ("
	+ " id INT AUTO_INCREMENT PRIMARY KEY,"
	+ " description VARCHAR(100));"
	
	+ " CREATE TABLE IF NOT EXISTS damaged_part ("
	+ " id INT AUTO_INCREMENT PRIMARY KEY,"
	+ " description VARCHAR(100));"
	
	+ " CREATE TABLE IF NOT EXISTS policy ("
	+ " id INT AUTO_INCREMENT PRIMARY KEY,"
	+ " id_insured INT,"
	+ " id_claim INT,"
	+ " startDateValidity DATE,"
	+ " endDateValidity DATE,"
	+ " policy_value DECIMAL(10, 2),"
	+ " license_plate VARCHAR(20),"
	+ " policy_num VARCHAR(20),"
	+ " vehicle VARCHAR(100),"
	+ " chassis VARCHAR(100),"
	+ " FOREIGN KEY (id_insured) REFERENCES insured(id));"
	
	+ " CREATE TABLE IF NOT EXISTS claim ("
	+ " id INT AUTO_INCREMENT PRIMARY KEY,"
	+ " id_policy INT,"
	+ " date_damage DATE,"
	+ " id_damaged_part INT,"
	+ " id_reason_damage INT,"
	+ " FOREIGN KEY (id_policy) REFERENCES policy(id),"
	+ " FOREIGN KEY (id_damaged_part) REFERENCES damaged_part(id),"
	+ " FOREIGN KEY (id_reason_damage) REFERENCES reason_damage(id));"

    );
    
    jdbcTemplate.update(
    		 "INSERT INTO insured (id, full_name, telephone, email, document) VALUES (1, 'Michael Williams', '712 32468-2246', 'mw@hotmail.com', 'AC2468746');"
    		+ "INSERT INTO insured (id, full_name, telephone, email, document) VALUES (2, 'Lucia White', '712 46549-4548', 'lc@hotmail.com', 'AC4579246');"
    				 
			+ "INSERT INTO reason_damage (id, description) VALUES (1, 'THERMAL SHOCK');"
			+ "INSERT INTO reason_damage (id, description) VALUES (2, 'HAIL RAIN');"
			+ "INSERT INTO reason_damage (id, description) VALUES (3, 'ACIDENTAL COLLISION');"
			+ "INSERT INTO reason_damage (id, description) VALUES (4, 'ACIDENTAL DAMAGE CAUSED BY STONE, OBJECT OR FRUIT');"
			+ "INSERT INTO reason_damage (id, description) VALUES (5, 'DAMAGE UNCHARACTERIZED - SOME REPAIR HAS BEEN CARRIED OUT');"
			+ "INSERT INTO reason_damage (id, description) VALUES (6, 'DURING STRONG WINDS, STORMS OR FLOODS');"
			+ "INSERT INTO reason_damage (id, description) VALUES (7, 'FOUND VEHICLE DAMAGED');"
			+ "INSERT INTO reason_damage (id, description) VALUES (8, 'YELLOW, STAINED OR SCRATCHED ITEM');"
			+ "INSERT INTO reason_damage (id, description) VALUES (9, 'INTENTIONAL OR WILLFUL BREACH');"
			+ "INSERT INTO reason_damage (id, description) VALUES (10, 'FELLING THE INTERIOR REARVIEW DAMAGED THE GLASS');"
			+ "INSERT INTO reason_damage (id, description) VALUES (11, 'UNSATISFACTORY REPAIR');"
			
			+ "INSERT INTO damaged_part (id, description) VALUES ('1', 'FRONT GLASS');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('2', 'DOOR GLASS');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('3', 'REAR WINDOW');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('4', 'MAIN HEADLIGHT WITH HALOGEN LAMP/CONV WITHOUT LED');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('5', 'CONVENTIONAL MILE/FOG HEADLIGHT (HALOGEN LIGHT)');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('6', 'COMPLETE REAR VIEW PAINTED');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('7', 'COMPLETE REAR VIEW PAINTED WITH INDICATOR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('8', 'COMPLETE REAR VIEW WITHOUT PAINTING WITH INDICATOR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('9', 'COMPLETE REAR VIEW WITHOUT PAINTING');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('10', 'REAR VIEW LENS');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('11', 'UNPAINTED REAR VIEW COVER WITH INDICATOR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('12', 'UNPAINTED REAR VIEW COVER');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('13', 'PAINTED REAR VIEW COVER WITH INDICATOR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('14', 'PAINTED REAR VIEW COVER');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('15', 'REAR VIEW BLINK');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('16', 'TAIL LIGHT WITH HALOGEN BULB');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('17', 'MANUAL MACHINE REPAIR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('18', 'COMPLETE ELECTRIC GLASS MACHINE');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('19', 'ELECTRICAL MACHINE REPAIR');"
			+ "INSERT INTO damaged_part (id, description) VALUES ('20', 'COMPLETE MANUAL GLASS MACHINE');"
			
			+ "INSERT INTO policy (id, id_insured, id_claim, startDateValidity, endDateValidity, policy_value, license_plate, policy_num, vehicle, chassis) "
			+ "VALUES (1, 1, 1, '2024-01-01', '2025-01-01', 10000.00, 'License Plate 1', '1545351', 'Ford F-150', '9BFA46548442299');"			    		
			+ "INSERT INTO policy (id, id_insured, id_claim, startDateValidity, endDateValidity, policy_value, license_plate, policy_num, vehicle, chassis) "
			+ "VALUES (2, 2, 2, '2024-01-01', '2025-01-01', 15000.00, 'License Plate 2', '1564654', 'Toyota Camry', '9ASGK446548898');"
    );
    
  }
}