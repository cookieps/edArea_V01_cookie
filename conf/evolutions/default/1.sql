# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table course (
  course_name               varchar(255) not null,
  email                     varchar(255),
  science                   varchar(255),
  about_course              TEXT,
  logo_path                 varchar(255),
  current                   boolean,
  constraint pk_course primary key (course_name))
;

create table picture (
  id                        bigint not null,
  content                   blob,
  content_type              varchar(255),
  constraint pk_picture primary key (id))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  user_type                 integer,
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create sequence course_seq;

create sequence picture_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists course;

drop table if exists picture;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists course_seq;

drop sequence if exists picture_seq;

drop sequence if exists user_seq;

