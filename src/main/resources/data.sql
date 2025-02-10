INSERT INTO users (
    username, password, firstname, surname, email, contact_number, enabled, created, modified,
    login_attempts, last_logout, login, lastpasswordmodifieddate,
    oldpassword1, oldpassword2, oldpassword3, oldpassword4, oldpassword5,
    passwordchange_count, passwordchangeddate, status, token_password
) VALUES (
    'johndoe',
    '$2a$10$GZ81b2eidDjerimP1HliZeDW83xELYjpYcdD8adYfeuD12ExMMrz6', -- Hashed Password
    'John', 'Doe', 'johndoe@example.com', '+1234567890', true,
    '2024-02-09 12:00:00', '2024-02-09 12:30:00', 0,
    '2024-02-08 18:00:00', '2024-02-09 12:00:00', null,
    null, null, null, null, null,
    0, null, 1, 'randomGeneratedToken123'
);
