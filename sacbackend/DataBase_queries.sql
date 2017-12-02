create table product(

	id IDENTITY,
	product_name VARCHAR(50),
	product_price DOUBLE,
	image_url VARCHAR(50),
	is_active = boolean,
	description VARCHAR(50),
	

CONSTRAINT pk_product_id PRIMARY KEY (ID)

);