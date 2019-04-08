CREATE SCHEMA sis_comanda;


--Tabelas	
create table sis_comanda.enableinsert(
	code serial not null,
	tablelist char(3),
	guestcheck char(3),
	constraint enableinsert_pk1 primary key (code));

create table if not exists sis_comanda.tablelist(
	code serial not null,
	description varchar(10),
	active char(3),
	constraint tablelist_pk1 primary key (code));
	
create table if not exists sis_comanda.guestcheck(
	code serial not null,
	barcode varchar(10),
	active char(3),
	constraint guestcheck_pk1 primary key (code));
	
create table if not exists sis_comanda.category(
	code serial not null,
	description varchar(40),
	constraint category_pk1 primary key (code));
	
create table if not exists sis_comanda.item(
	code serial not null,
	description varchar(40),
	price decimal(6,2),
	preparation varchar(10),
	additional char(3),
	active char(3),
	code_category integer,
	constraint item_pk1 primary key (code),
	constraint item_fk1 foreign key (code_category) references sis_comanda.category(code));
	
create table if not exists sis_comanda.additional(
	code serial not null,
	description varchar(40),
	price decimal(6,2),
	active char(3),
	code_category integer,
	constraint additional_pk1 primary key (code),
	constraint additional_fk1 foreign key (code_category) references sis_comanda.category(code));
	
create table if not exists sis_comanda.request(
	code serial not null,
	status varchar(20),
	datetimeins timestamp,
	datetimeend timestamp,
	paymoney decimal(6,2),
	paycard decimal(6,2),
	cardtype varchar(2),
	code_guestcheck integer,
	code_tablelist integer,
	constraint request_pk1 primary key (code),
	constraint request_fk2 foreign key (code_guestcheck) references sis_comanda.guestcheck(code),
	constraint request_fk3 foreign key (code_tablelist) references sis_comanda.tablelist(code));
	
create table if not exists sis_comanda.requestitem(
	code serial not null,
	status varchar(20),
	countitem integer,
	note varchar(150),
	check_requeststart char(1),
	datetimeins timestamp,
	datetimeupd timestamp,
	code_request integer,
	code_item integer,
	constraint requestitem_pk1 primary key (code),
	constraint requestitem_fk1 foreign key (code_request) references sis_comanda.request(code),
	constraint requestitem_fk2 foreign key (code_item) references sis_comanda.item(code));
	
create table if not exists sis_comanda.requestadditionalitem(
	code serial not null,
	code_requestitem integer,
	code_additional integer,
	constraint requestadditional_pk1 primary key (code),
	constraint requestadditional_fk1 foreign key (code_requestitem) references sis_comanda.requestitem(code),
	constraint requestadditional_fk2 foreign key (code_additional) references sis_comanda.additional(code));
	
create table if not exists sis_comanda.filterhistory(
	code serial not null,
	code_category integer,
	constraint filterhistory_pk1 primary key (code),
	constraint filterhistory_fk1 foreign key (code_category) references sis_comanda.category(code));
	
create table if not exists sis_comanda.comboitem(
	code serial not null,
	countitem integer,
	code_item integer,
	code_comboitem integer,
	constraint comboitem_pk1 primary key (code),
	constraint comboitem_fk1 foreign key (code_item) references sis_comanda.item(code),
	constraint comboitem_fk2 foreign key (code_comboitem) references sis_comanda.item(code));
	
create table if not exists sis_comanda.additionalitem(
	code serial not null,
	code_additional integer,
	code_item integer,
	constraint additionalitem_pk1 primary key (code),
	constraint additionalitem_fk1 foreign key (code_additional) references sis_comanda.additional(code),
	constraint additionalitem_fk2 foreign key (code_item) references sis_comanda.item(code));	
	

--Index
create unique index if not exists tablelist_idxu1 on sis_comanda.tablelist(description);
create unique index if not exists guestcheck_idxu1 on sis_comanda.guestcheck(barcode);
create unique index if not exists requestadditionalitem_idxu1 on sis_comanda.requestadditionalitem(code_requestitem,code_additional);

--Insert
insert into sis_comanda.enableinsert (code,tablelist,guestcheck) values (1,'f','f');
insert into sis_comanda.category (code,description) values (nextval('sis_comanda.category_code_seq'),'COMBOS');