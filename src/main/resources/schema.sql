drop table if exists client;
create table client
(
    id       bigint auto_increment primary key,
    fullname varchar(255)
);
drop table if exists menu;
create table menu
(
    id   bigint auto_increment primary key,
    name varchar(255)
);
drop table if exists client_order;
create table client_order
(
    id        bigint auto_increment primary key,
    name     varchar(255),
    client_id bigint,
    menu_id  bigint,
    foreign key (client_id) references client (ID),
    foreign key (menu_id) references menu (ID)
);
