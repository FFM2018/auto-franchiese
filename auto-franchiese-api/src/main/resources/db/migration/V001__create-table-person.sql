CREATE TABLE IF NOT EXISTS person (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
) ;

INSERT INTO person (full_name, email) VALUES ('user1', 'user1@example.com');
INSERT INTO person (full_name, email) VALUES ('user2', 'user2@example.com');