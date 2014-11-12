# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table course (
  course_name               varchar(255) not null,
  email                     varchar(255),
  science                   varchar(255),
  about_course              varchar(255),
  logo_id                   bigint,
  current                   tinyint(1) default 0,
  constraint pk_course primary key (course_name))
;

create table picture (
  id                        bigint auto_increment not null,
  content                   longblob,
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




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table course;

drop table picture;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

