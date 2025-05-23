DROP TABLE IF EXISTS dog;

CREATE TABLE IF NOT EXISTS dog (
                                   id          SERIAL PRIMARY KEY,
                                   name        TEXT NOT NULL,
                                   owner       TEXT NULL,
                                   description TEXT NOT NULL
);
