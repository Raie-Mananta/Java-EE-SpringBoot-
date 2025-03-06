CREATE TABLE collaborateurs (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL
);

CREATE TABLE periode (
    id SERIAL PRIMARY KEY,
    date_debut DATE NOT NULL,
    nb_jours INT NOT NULL
);

CREATE TABLE demande_conge (
    id SERIAL PRIMARY KEY,
    collaborateur_id INT NOT NULL,
    periode_id INT NOT NULL,
    FOREIGN KEY (collaborateur_id) REFERENCES collaborateurs(id) ON DELETE CASCADE,
    FOREIGN KEY (periode_id) REFERENCES periode(id) ON DELETE CASCADE
);
