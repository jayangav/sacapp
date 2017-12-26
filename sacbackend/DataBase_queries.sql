CREATE TABLE product(

	id IDENTITY,
	product_name VARCHAR(255),
	product_price DOUBLE,
	image_url VARCHAR(255),
	is_active  BOOLEAN,
	description VARCHAR(255),
	

CONSTRAINT pk_product_id PRIMARY KEY (id)

);

CREATE TABLE sports(

	id IDENTITY,
	sport_name VARCHAR(255),
	
	image_url VARCHAR(255),
	is_active  BOOLEAN,
	description VARCHAR(255),
	

CONSTRAINT pk_sport_id PRIMARY KEY (id)

);

drop table sports