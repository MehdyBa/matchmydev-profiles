DELETE FROM contract_types;
DELETE FROM profiles;

INSERT INTO contract_types(name)
	VALUES('Permanent'),('Contractor');
	
INSERT INTO profiles(first_name, last_name, identifier, email, job_title, contract_id, hiring_date, avatar, description, tech_lead)
	VALUES ('Damla', 'SUBASI', 'dsubasi030123', 'damla@subasi.com', 'Developer',(
		SELECT id FROM contract_types WHERE name ='Permanent'
		), '2023-01-03', '','Excellent full stack developer', false),
	('Lisa', 'MUNSY', 'lmunsy030123', 'lisa@munsy.com', 'Developer', (
		SELECT id FROM contract_types WHERE name ='Contractor'
		), '2023-01-03', '','Curious duck lover', true),
	('Laurine', 'DA SILVA', 'ldasilv030123', 'laurine@dasilva.com', 'Developer', (
		SELECT id FROM contract_types WHERE name ='Permanent'
		), '2023-01-03', '', 'Best delegate ever', true),
	('Milena', 'MANNEVILLE', 'mmannev030123', 'milena@mannev.com', 'Developer', (
		SELECT id FROM contract_types WHERE name ='Contractor'
		), '2023-01-03', '', 'Always learning', false);
	