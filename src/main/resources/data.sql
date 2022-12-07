insert into event (id, event_name, event_desc,event_date,total_tickets) values (1, 'Microservice', 'AWS microservice impl',TO_DATE('27/04/2022', 'DD/MM/YYYY'),50);
insert into event (id, event_name, event_desc,event_date,total_tickets) values (2, 'Clound','Azur Cloud Fundamentals',TO_DATE('07/05/2022', 'DD/MM/YYYY'),100);
insert into event (id, event_name, event_desc,event_date,total_tickets) values (3, 'AI','Google AI search optimization',TO_DATE('17/04/2022', 'DD/MM/YYYY'),200);
insert into ticket (id, type, count, event_id) values (1, 'Primium', 5, 1);
insert into ticket (id, type, count, event_id) values (2, 'Silver', 6,2);
insert into ticket (id, type, count, event_id) values (3, 'Platinum',3,2);
insert into ticket (id, type, count, event_id) values (4, 'Primium', 4,1);
insert into ticket (id, type, count, event_id) values (5, 'Gold', 9,1);
insert into ticket (id, type, count, event_id) values (6, 'Platinum', 10,2);
insert into ticket (id, type, count, event_id) values (7, 'Silver', 4, 2);
insert into ticket (id, type, count, event_id) values (8, 'Platinum', 6,3);
insert into ticket (id, type, count, event_id) values (9, 'Primium', 5, 3);
insert into ticket (id, type, count, event_id) values (10, 'Platinum', 4, 2);
insert into ticket (id, type, count, event_id) values (11, 'Silver', 3,1);
insert into ticket (id, type, count, event_id) values (12, 'Platinum',4, 3);
insert into ticket (id, type, count, event_id) values (13, 'Gold', 2,2);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (1, 'John', 'Smith','jhonsmit@gmail.com','Developer', 1, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (2, 'Will', 'Smith','willsmit@gmail.com','Developer', 2, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (3, 'John', 'Son','jhonson@gmail.com','Networking', 3, 2);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (4, 'Peter', 'Son','peterson@gmail.com','Developer', 4, 2);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (5, 'John', 'Shalman','jhonshalaman@gmail.com','SolutionArchitect', 5, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (6, 'Jamesh', 'raj','jameshraj@gmail.com','Developer', 6, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (7, 'Arul', 'jamesh','aruljamesh@gmail.com','BusinessAnalyst', 7, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (8, 'Rohit', 'Khan','rohitkhan@gmail.com','Developer', 8, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (9, 'Mohamad', 'Samy','mohamadsamy@gmail.com','Developer', 9, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (10, 'Angela', 'kiara','Angelakiara@gmail.com','Analyst', 10, 1);
insert into user (id, first_name, last_name, email,role, ticket_id, event_id) values (11, 'rosa', 'sawa','rosasawa@gmail.com','Developer', 11, 1);
