INSERT INTO public_users (username)
VALUES ('Juan Pérez');

INSERT INTO public_users (username)
VALUES ('Ana Gómez');

INSERT INTO public_users (username)
VALUES ('Carlos Ruiz');

-- Inserción en private_users con los id correspondientes
INSERT INTO private_users (id_public_user, email, password)
VALUES (1, 'juan.perez@email.com', 'password123');

INSERT INTO private_users (id_public_user, email, password)
VALUES (3, 'carlos.ruiz@email.com', 'password123');

INSERT INTO private_users (id_public_user, email, password)
VALUES (2, 'ana.gomez@email.com', 'password123');
