CREATE TABLE IF NOT EXISTS person (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
) ;

INSERT INTO person (fullname, email) VALUES ('user1', 'user1@example.com');
INSERT INTO person (fullname, email) VALUES ('user2', 'user2@example.com');