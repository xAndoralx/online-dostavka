insert into client (fullname)
values ('John Bunyan'),
       ('Gianni Rodari'),
       ('Daniel Defoe');

insert into menu (name)
values ('Pizza'),
       ('Sushi'),
       ('WOK');

insert into client_order (name, client_id, menu_id)
values ('zakaz_1', 1, 1),
       ('zakaz_2', 2, 2),
       ('zakaz_3', 1, 1);