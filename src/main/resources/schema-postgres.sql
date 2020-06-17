DROP TABLE IF EXISTS battery CASCADE;
DROP TABLE IF EXISTS vendor CASCADE;
DROP TABLE IF EXISTS vendorlist;

CREATE TABLE battery(
	batteryid serial PRIMARY KEY,
	manufacturer VARCHAR (50) NOT NULL,
	make VARCHAR (50) NOT NULL,
	model VARCHAR (50) NOT NULL,
	capacity VARCHAR (50) NOT NULL,
	range_in_km integer NOT NULL,
	range_in_mi integer NOT NULL,
	wh_per_km integer NOT NULL,
	wh_per_mi integer NOT NULL,
	energycost_per_km real NOT NULL,
	energycost_per_mi real NOT NULL,
	charge_times VARCHAR (355) NOT NULL
);


CREATE TABLE vendor(
	business_id serial PRIMARY KEY,
	business_name VARCHAR (50) NOT NULL,
	business_website VARCHAR (50) NOT NULL,
	phone_number VARCHAR (50) NOT NULL,
	email VARCHAR (50) NOT NULL,
	address VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL,
	buffer_1 VARCHAR (50) NOT NULL,
	buffer_2 VARCHAR (50) NOT NULL
);