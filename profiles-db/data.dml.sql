DELETE FROM profiles;

INSERT INTO profiles(first_name, last_name, identifier, email, job_title, contract_type, hiring_date, avatar, description, tech_lead)
	VALUES ('Damla', 'SUBASI', 'dsubasi030123', 'damla@subasi.com', 'Developer', 'Permanent', '2023-01-03', 'https://i.kym-cdn.com/entries/icons/original/000/021/441/chill_cat.jpg','Excellent full stack developer', false),
	('Lisa', 'MUNSY', 'lmunsy030123', 'lisa@munsy.com', 'Developer', 'Permanent', '2023-01-03', 'https://encredebretagne.bzh/wp-content/uploads/2015/12/chat-breton.jpg','Curious duck lover', true),
	('Laurine', 'DA SILVA', 'ldasilv030123', 'laurine@dasilva.com', 'Developer', 'Permanent', '2023-01-03', 'https://upload.wikimedia.org/wikipedia/commons/b/b2/Nutkin.jpg', 'Best delegate ever', true);
	