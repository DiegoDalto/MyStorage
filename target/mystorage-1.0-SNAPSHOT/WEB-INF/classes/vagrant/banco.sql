CREATE TABLE public.pessoa
(
	id bigserial NOT NULL,
	nome character varying(45) NOT NULL,
	login character varying(45) NOT NULL,
	senha character varying(45) NOT NULL,
	PRIMARY KEY (id)
)
WITH (
	OIDS = FALSE
);