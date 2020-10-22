create table regions
(
    id bigint not null auto_increment,
    name varchar(255) not null
    abbreviate varchar(255) not null,
    primary key(id)
);

insert into regions(name, abbreviate) values('Кабардино-Балкарская Республика', '')