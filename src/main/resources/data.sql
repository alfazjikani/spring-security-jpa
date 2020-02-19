insert into user_detail (username, password) values ('user', '$2y$12$kEUpNz1V6w8k2TLdcpYF7eFUsjh0pFvc4s1mzMDr/cmNB9X1L8mfi');
insert into user_detail (username, password) values ('admin', '$2y$12$dDDXzr5Jg.PgGjM6Cpob8e17ApEEF5VYruOeKx6x7Y1AxBzcEegim');

insert into role (name) values ('ROLE_USER');
insert into role (name) values ('ROLE_ADMIN');

insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 2);