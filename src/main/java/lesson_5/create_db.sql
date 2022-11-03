CREATE DATABASE Jaeger;

\c jaeger;

CREATE TABLE Jaeger(
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark CHAR(8),
	height INTEGER,
	weight FLOAT8,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INTEGER
	);
