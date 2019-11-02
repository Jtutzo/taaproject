CREATE TABLE personne
(
  id            UUID,
  nom           VARCHAR(50) NOT NULL,
  prenom        VARCHAR(50) NOT NULL,
  CONSTRAINT pk_personne PRIMARY KEY (ID)
);
