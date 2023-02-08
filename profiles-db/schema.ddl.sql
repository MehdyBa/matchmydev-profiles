DROP TABLE IF EXISTS contract_types;
DROP TABLE IF EXISTS profiles;

CREATE TABLE contract_types(
	id SERIAL PRIMARY KEY,
	name VARCHAR(200) UNIQUE NOT NULL
);

CREATE TABLE profiles (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	identifier VARCHAR(13) NOT NULL,
	email VARCHAR(155) UNIQUE NOT NULL,
	job_title VARCHAR(50) NOT NULL,
	contract_id INTEGER NOT NULL,
	CONSTRAINT fk_contract_id
		FOREIGN KEY (contract_id)
		REFERENCES contract_types(id),
	hiring_date TIMESTAMP NOT NULL,
	avatar VARCHAR(300) NOT NULL,
	description VARCHAR(1000) NOT NULL,
	tech_lead BOOLEAN NOT NULL

)