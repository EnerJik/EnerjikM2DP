/*==============================================================*/
/* Nom de SGBD :  ORACLE Version 11g                            */
/* Date de création :  22/05/2013 20:16:07                      */
/*==============================================================*/


alter table CAPTER
   drop constraint FK_CAPTER_COMPOSE_EQUIPEME;

alter table CAPTER
   drop constraint FK_CAPTER_HAS_HOUSE;

alter table MEASURE
   drop constraint FK_MEASURE_HADMESURE_CAPTER;

drop index COMPOSE_FK;

drop index HAS_FK;

drop table CAPTER cascade constraints;

drop table EQUIPEMENT cascade constraints;

drop table HOUSE cascade constraints;

drop index HADMESURE_FK;

drop table MEASURE cascade constraints;

/*==============================================================*/
/* Table : CAPTER                                               */
/*==============================================================*/
create table CAPTER 
(
   CP_ID                INTEGER              not null,
   HS_ID                NUMBER               not null,
   MS_ID                INTEGER              not null,
   CP_DESCRIPTION       VARCHAR(50),
   CP_LOCALISATION      VARCHAR(50),
   constraint PK_CAPTER primary key (CP_ID)
);

/*==============================================================*/
/* Index : HAS_FK                                               */
/*==============================================================*/
create index HAS_FK on CAPTER (
   HS_ID ASC
);

/*==============================================================*/
/* Index : COMPOSE_FK                                           */
/*==============================================================*/
create index COMPOSE_FK on CAPTER (
   MS_ID ASC
);

/*==============================================================*/
/* Table : EQUIPEMENT                                           */
/*==============================================================*/
create table EQUIPEMENT 
(
   MS_ID                INTEGER              not null,
   EQ_NAME              VARCHAR(50)                 not null,
   EQ_UNITY             VARCHAR(50)                 not null,
   constraint PK_EQUIPEMENT primary key (MS_ID)
);

/*==============================================================*/
/* Table : HOUSE                                                */
/*==============================================================*/
create table HOUSE 
(
   HS_ID                NUMBER               not null,
   HS_NAME              VARCHAR(50),
   constraint PK_HOUSE primary key (HS_ID)
);

/*==============================================================*/
/* Table : MEASURE                                              */
/*==============================================================*/
create table MEASURE 
(
   MS_ID                INTEGER              not null,
   CP_ID                INTEGER              not null,
   MS_VALUE             NUMBER   			 not null,
   MS_STATE             SMALLINT				,
   MS_DATE              DATE                 not null,
   constraint PK_MEASURE primary key (MS_ID)
);

/*==============================================================*/
/* Index : HADMESURE_FK                                         */
/*==============================================================*/
create index HADMESURE_FK on MEASURE (
   CP_ID ASC
);

alter table CAPTER
   add constraint FK_CAPTER_COMPOSE_EQUIPEME foreign key (MS_ID)
      references EQUIPEMENT (MS_ID);

alter table CAPTER
   add constraint FK_CAPTER_HAS_HOUSE foreign key (HS_ID)
      references HOUSE (HS_ID);

alter table MEASURE
   add constraint FK_MEASURE_HADMESURE_CAPTER foreign key (CP_ID)
      references CAPTER (CP_ID);