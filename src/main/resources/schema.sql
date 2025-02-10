CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    firstname VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    contact_number VARCHAR(20),
    enabled BOOLEAN NOT NULL DEFAULT TRUE,
    created TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    login_attempts INT DEFAULT 0 CHECK (login_attempts >= 0),
    last_logout TIMESTAMP,
    login TIMESTAMP,
    lastpasswordmodifieddate TIMESTAMP,
    oldpassword1 VARCHAR(255),
    oldpassword2 VARCHAR(255),
    oldpassword3 VARCHAR(255),
    oldpassword4 VARCHAR(255),
    oldpassword5 VARCHAR(255),
    passwordchange_count INT DEFAULT 0 CHECK (passwordchange_count >= 0),
    passwordchangeddate TIMESTAMP,
    status INT NOT NULL DEFAULT 1 CHECK (status IN (0, 1, 2)), -- Adjust valid status values as needed
    token_password VARCHAR(255)
);
