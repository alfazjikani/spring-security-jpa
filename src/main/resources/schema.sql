CREATE TABLE user_detail
(
    id serial NOT NULL,
    username character varying(15) NOT NULL,
    password character varying NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

CREATE TABLE role
(
    id smallserial NOT NULL,
    name character varying(20) NOT NULL,
    CONSTRAINT role_pkey PRIMARY KEY (id)
);

CREATE TABLE user_role
(
    user_id integer NOT NULL,
    role_id smallint NOT NULL,
    CONSTRAINT role_id_fkey FOREIGN KEY (role_id)
        REFERENCES role (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT user_id_fkey FOREIGN KEY (user_id)
        REFERENCES user_detail (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);