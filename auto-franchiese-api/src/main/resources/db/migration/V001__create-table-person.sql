CREATE TABLE IF NOT EXISTS person (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
) ;

INSERT INTO person (full_name, email) VALUES ('user1', 'user1@example.com');
INSERT INTO person (full_name, email) VALUES ('user2', 'user2@example.com');

CREATE TABLE IF NOT EXISTS damaged_part (
    code VARCHAR(10) PRIMARY KEY,
    description VARCHAR(100)
);

INSERT INTO damaged_part (code, description) VALUES ('1', 'FRONT GLASS');
INSERT INTO damaged_part (code, description) VALUES ('2', 'DOOR GLASS');
INSERT INTO damaged_part (code, description) VALUES ('3', 'REAR WINDOW');
INSERT INTO damaged_part (code, description) VALUES ('4', 'MAIN HEADLIGHT WITH HALOGEN LAMP/CONV WITHOUT LED');
INSERT INTO damaged_part (code, description) VALUES ('5', 'CONVENTIONAL MILE/FOG HEADLIGHT (HALOGEN LIGHT)');
INSERT INTO damaged_part (code, description) VALUES ('6', 'COMPLETE REAR VIEW PAINTED');
INSERT INTO damaged_part (code, description) VALUES ('7', 'COMPLETE REAR VIEW PAINTED WITH INDICATOR');
INSERT INTO damaged_part (code, description) VALUES ('8', 'COMPLETE REAR VIEW WITHOUT PAINTING WITH INDICATOR');
INSERT INTO damaged_part (code, description) VALUES ('9', 'COMPLETE REAR VIEW WITHOUT PAINTING');
INSERT INTO damaged_part (code, description) VALUES ('10', 'REAR VIEW LENS');
INSERT INTO damaged_part (code, description) VALUES ('11', 'UNPAINTED REAR VIEW COVER WITH INDICATOR');
INSERT INTO damaged_part (code, description) VALUES ('12', 'UNPAINTED REAR VIEW COVER');
INSERT INTO damaged_part (code, description) VALUES ('13', 'PAINTED REAR VIEW COVER WITH INDICATOR');
INSERT INTO damaged_part (code, description) VALUES ('14', 'PAINTED REAR VIEW COVER');
INSERT INTO damaged_part (code, description) VALUES ('15', 'REAR VIEW BLINK');
INSERT INTO damaged_part (code, description) VALUES ('16', 'TAIL LIGHT WITH HALOGEN BULB');
INSERT INTO damaged_part (code, description) VALUES ('17', 'MANUAL MACHINE REPAIR');
INSERT INTO damaged_part (code, description) VALUES ('18', 'COMPLETE ELECTRIC GLASS MACHINE');
INSERT INTO damaged_part (code, description) VALUES ('19', 'ELECTRICAL MACHINE REPAIR');
INSERT INTO damaged_part (code, description) VALUES ('20', 'COMPLETE MANUAL GLASS MACHINE');

CREATE TABLE IF NOT EXISTS reason_damage (
    code INT PRIMARY KEY,
    description VARCHAR(100)
);

INSERT INTO reason_damage (code, description) VALUES (1, 'THERMAL SHOCK');
INSERT INTO reason_damage (code, description) VALUES (2, 'HAIL RAIN');
INSERT INTO reason_damage (code, description) VALUES (3, 'ACIDENTAL COLLISION');
INSERT INTO reason_damage (code, description) VALUES (4, 'ACIDENTAL DAMAGE CAUSED BY STONE, OBJECT OR FRUIT');
INSERT INTO reason_damage (code, description) VALUES (5, 'DAMAGE UNCHARACTERIZED - SOME REPAIR HAS BEEN CARRIED OUT');
INSERT INTO reason_damage (code, description) VALUES (6, 'DURING STRONG WINDS, STORMS OR FLOODS');
INSERT INTO reason_damage (code, description) VALUES (7, 'FOUND VEHICLE DAMAGED');
INSERT INTO reason_damage (code, description) VALUES (8, 'YELLOW, STAINED OR SCRATCHED ITEM');
INSERT INTO reason_damage (code, description) VALUES (9, 'INTENTIONAL OR WILLFUL BREACH');
INSERT INTO reason_damage (code, description) VALUES (10, 'FELLING THE INTERIOR REARVIEW DAMAGED THE GLASS');
INSERT INTO reason_damage (code, description) VALUES (11, 'UNSATISFACTORY REPAIR');
