
/*==============================================================*/
/* Table: AREA                                                  */
/*==============================================================*/
create table AREA (
   IDCOMPLEJO           CHAR(5)              not null,
   IDAREA               VARCHAR(3)           not null,
   NOMAREA              VARCHAR(10)          not null,
   UBICACION            VARCHAR(30)          not null,
   constraint PK_AREA primary key (IDCOMPLEJO, IDAREA)
);

/*==============================================================*/
/* Index: AREA_PK                                               */
/*==============================================================*/
create unique index AREA_PK on AREA (
IDCOMPLEJO,
IDAREA
);

/*==============================================================*/
/* Index: SEDEAREA_FK                                           */
/*==============================================================*/
create  index SEDEAREA_FK on AREA (
IDCOMPLEJO
);

/*==============================================================*/
/* Table: COMIDEPOR                                             */
/*==============================================================*/
create table COMIDEPOR (
   CODPERSONA           VARCHAR(4)           not null,
   IDDEPORTE            VARCHAR(5)           not null,
   constraint PK_COMIDEPOR primary key (CODPERSONA, IDDEPORTE)
);

/*==============================================================*/
/* Index: COMIDEPOR_PK                                          */
/*==============================================================*/
create unique index COMIDEPOR_PK on COMIDEPOR (
CODPERSONA,
IDDEPORTE
);

/*==============================================================*/
/* Index: COMIDEPOR2_FK                                         */
/*==============================================================*/
create  index COMIDEPOR2_FK on COMIDEPOR (
IDDEPORTE
);

/*==============================================================*/
/* Index: COMIDEPOR_FK                                          */
/*==============================================================*/
create  index COMIDEPOR_FK on COMIDEPOR (
CODPERSONA
);

/*==============================================================*/
/* Table: COMISARIODEPORTE                                      */
/*==============================================================*/
create table COMISARIODEPORTE (
   CODPERSONA           VARCHAR(4)           not null,
   IDDEPORTE2           VARCHAR(4)           not null,
   constraint PK_COMISARIODEPORTE primary key (CODPERSONA, IDDEPORTE2)
);

/*==============================================================*/
/* Index: COMISARIODEPORTE_PK                                   */
/*==============================================================*/
create unique index COMISARIODEPORTE_PK on COMISARIODEPORTE (
CODPERSONA,
IDDEPORTE2
);

/*==============================================================*/
/* Index: COMISARIODEPORTE2_FK                                  */
/*==============================================================*/
create  index COMISARIODEPORTE2_FK on COMISARIODEPORTE (
IDDEPORTE2
);

/*==============================================================*/
/* Index: COMISARIODEPORTE_FK                                   */
/*==============================================================*/
create  index COMISARIODEPORTE_FK on COMISARIODEPORTE (
CODPERSONA
);

/*==============================================================*/
/* Table: COMISARIOEVENTO                                       */
/*==============================================================*/
create table COMISARIOEVENTO (
   CONSECCOMISARIO      NUMERIC(3,0)         not null,
   CONSEC               NUMERIC(5,0)         not null,
   CODPERSONA           VARCHAR(4)           not null,
   IDTAREA              VARCHAR(3)           not null,
   FECHA                DATE                 not null,
   constraint PK_COMISARIOEVENTO primary key (CONSECCOMISARIO)
);

/*==============================================================*/
/* Index: COMISARIOEVENTO_PK                                    */
/*==============================================================*/
create unique index COMISARIOEVENTO_PK on COMISARIOEVENTO (
CONSECCOMISARIO
);

/*==============================================================*/
/* Index: EVENTO_FK                                             */
/*==============================================================*/
create  index EVENTO_FK on COMISARIOEVENTO (
CONSEC
);

/*==============================================================*/
/* Index: COMISARIO_FK                                          */
/*==============================================================*/
create  index COMISARIO_FK on COMISARIOEVENTO (
CODPERSONA
);

/*==============================================================*/
/* Index: TAREA_FK                                              */
/*==============================================================*/
create  index TAREA_FK on COMISARIOEVENTO (
IDTAREA
);

/*==============================================================*/
/* Table: DEPORTE                                               */
/*==============================================================*/
create table DEPORTE (
   IDDEPORTE            VARCHAR(5)           not null,
   NOMDEPORTE           VARCHAR(30)          not null,
   NMAXINTEGRANTES      NUMERIC(2,0)         not null,
   constraint PK_DEPORTE primary key (IDDEPORTE)
);

/*==============================================================*/
/* Index: DEPORTE_PK                                            */
/*==============================================================*/
create unique index DEPORTE_PK on DEPORTE (
IDDEPORTE
);

/*==============================================================*/
/* Table: DEPORTE2                                              */
/*==============================================================*/
create table DEPORTE2 (
   IDDEPORTE2           VARCHAR(4)           not null,
   NOMDEPORTE           VARCHAR(30)          not null,
   NMAXINTEGRANTES      NUMERIC(2,0)         not null,
   constraint PK_DEPORTE2 primary key (IDDEPORTE2)
);

/*==============================================================*/
/* Index: DEPORTE2_PK                                           */
/*==============================================================*/
create unique index DEPORTE2_PK on DEPORTE2 (
IDDEPORTE2
);

/*==============================================================*/
/* Table: EQUIPO                                                */
/*==============================================================*/
create table EQUIPO (
   IDEQUIPO             VARCHAR(3)           not null,
   NOMEQUIPO            VARCHAR(30)          not null,
   NPARES               NUMERIC(4,0)         not null,
   constraint PK_EQUIPO primary key (IDEQUIPO)
);

/*==============================================================*/
/* Index: EQUIPO_PK                                             */
/*==============================================================*/
create unique index EQUIPO_PK on EQUIPO (
IDEQUIPO
);

/*==============================================================*/
/* Table: EQUIPODEPORTE                                         */
/*==============================================================*/
create table EQUIPODEPORTE (
   IDEQUIPO             VARCHAR(3)           not null,
   IDDEPORTE            VARCHAR(5)           not null,
   constraint PK_EQUIPODEPORTE primary key (IDEQUIPO, IDDEPORTE)
);

/*==============================================================*/
/* Index: EQUIPODEPORTE_PK                                      */
/*==============================================================*/
create unique index EQUIPODEPORTE_PK on EQUIPODEPORTE (
IDEQUIPO,
IDDEPORTE
);

/*==============================================================*/
/* Index: EQUIPODEPORTE2_FK                                     */
/*==============================================================*/
create  index EQUIPODEPORTE2_FK on EQUIPODEPORTE (
IDDEPORTE
);

/*==============================================================*/
/* Index: EQUIPODEPORTE_FK                                      */
/*==============================================================*/
create  index EQUIPODEPORTE_FK on EQUIPODEPORTE (
IDEQUIPO
);

/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table ESTADO (
   IDESTADO             VARCHAR(2)           not null,
   DESCESTADO           VARCHAR(30)          not null,
   constraint PK_ESTADO primary key (IDESTADO)
);

/*==============================================================*/
/* Index: ESTADO_PK                                             */
/*==============================================================*/
create unique index ESTADO_PK on ESTADO (
IDESTADO
);

/*==============================================================*/
/* Table: EVENTO                                                */
/*==============================================================*/
create table EVENTO (
   CONSEC               NUMERIC(5,0)         not null,
   IDDEPORTE            VARCHAR(5)           not null,
   IDCOMPLEJO           CHAR(5)              not null,
   ARE_IDCOMPLEJO       CHAR(5)              null,
   IDAREA               VARCHAR(3)           null,
   CODPERSONA           VARCHAR(4)           not null,
   FECHAHORA            DATE                 not null,
   DURACION             TIME                 not null,
   NPARTICIPANTE        NUMERIC(3,0)         not null,
   NCOMISARIO           NUMERIC(3,0)         null,
   constraint PK_EVENTO primary key (CONSEC)
);

/*==============================================================*/
/* Index: EVENTO_PK                                             */
/*==============================================================*/
create unique index EVENTO_PK on EVENTO (
CONSEC
);

/*==============================================================*/
/* Index: DEPORTEEVENTO_FK                                      */
/*==============================================================*/
create  index DEPORTEEVENTO_FK on EVENTO (
IDDEPORTE
);

/*==============================================================*/
/* Index: SEDEEVENTO_FK                                         */
/*==============================================================*/
create  index SEDEEVENTO_FK on EVENTO (
IDCOMPLEJO
);

/*==============================================================*/
/* Index: AREAEVENTO_FK                                         */
/*==============================================================*/
create  index AREAEVENTO_FK on EVENTO (
ARE_IDCOMPLEJO,
IDAREA
);

/*==============================================================*/
/* Index: ADMINISTRADOR_FK                                      */
/*==============================================================*/
create  index ADMINISTRADOR_FK on EVENTO (
CODPERSONA
);

/*==============================================================*/
/* Table: INVENTARIO                                            */
/*==============================================================*/
create table INVENTARIO (
   IDEQUIPO             VARCHAR(3)           not null,
   IDCOMPLEJO           CHAR(5)              not null,
   CONSECINVE           NUMERIC(4,0)         not null,
   IDESTADO             VARCHAR(2)           not null,
   NPIEZAS              NUMERIC(3,0)         not null,
   constraint PK_INVENTARIO primary key (IDEQUIPO, IDCOMPLEJO, CONSECINVE)
);

/*==============================================================*/
/* Index: INVENTARIO_PK                                         */
/*==============================================================*/
create unique index INVENTARIO_PK on INVENTARIO (
IDEQUIPO,
IDCOMPLEJO,
CONSECINVE
);

/*==============================================================*/
/* Index: SEDEINVENTARIO_FK                                     */
/*==============================================================*/
create  index SEDEINVENTARIO_FK on INVENTARIO (
IDCOMPLEJO
);

/*==============================================================*/
/* Index: ESTADOINVENTARIO_FK                                   */
/*==============================================================*/
create  index ESTADOINVENTARIO_FK on INVENTARIO (
IDESTADO
);

/*==============================================================*/
/* Index: EQUIPOINVENTARIO_FK                                   */
/*==============================================================*/
create  index EQUIPOINVENTARIO_FK on INVENTARIO (
IDEQUIPO
);

/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA (
   CODPERSONA           VARCHAR(4)           not null,
   IDTIPOPERSONA        VARCHAR(3)           not null,
   NOMPERSONA           VARCHAR(30)          not null,
   APEPERSONA           VARCHAR(30)               not null,
   USERPER              VARCHAR(6)           not null,
   CORREOPER            VARCHAR(50)          not null,
   PASWORD              VARCHAR(5)           not null,
   constraint PK_PERSONA primary key (CODPERSONA)
);

/*==============================================================*/
/* Index: PERSONA_PK                                            */
/*==============================================================*/
create unique index PERSONA_PK on PERSONA (
CODPERSONA
);

/*==============================================================*/
/* Index: TIPO_FK                                               */
/*==============================================================*/
create  index TIPO_FK on PERSONA (
IDTIPOPERSONA
);

/*==============================================================*/
/* Table: POLIDEPORTIVO                                         */
/*==============================================================*/
create table POLIDEPORTIVO (
   IDPOLI               VARCHAR(4)           not null,
   IDCOMPLEJO           CHAR(5)              not null,
   IDAREA               VARCHAR(3)           not null,
   IDDEPORTE            VARCHAR(5)           not null,
   constraint PK_POLIDEPORTIVO primary key (IDPOLI)
);

/*==============================================================*/
/* Index: POLIDEPORTIVO_PK                                      */
/*==============================================================*/
create unique index POLIDEPORTIVO_PK on POLIDEPORTIVO (
IDPOLI
);

/*==============================================================*/
/* Index: AREAPOLI_FK                                           */
/*==============================================================*/
create  index AREAPOLI_FK on POLIDEPORTIVO (
IDCOMPLEJO,
IDAREA
);

/*==============================================================*/
/* Index: POLIDEPORTIVO_FK                                      */
/*==============================================================*/
create  index POLIDEPORTIVO_FK on POLIDEPORTIVO (
IDDEPORTE
);

/*==============================================================*/
/* Table: PRESTAMO                                              */
/*==============================================================*/
create table PRESTAMO (
   CONSECPRESTA         NUMERIC(3,0)         not null,
   IDESTADO             VARCHAR(2)           not null,
   IDEQUIPO             VARCHAR(3)           not null,
   IDCOMPLEJO           CHAR(5)              not null,
   CONSECINVE           NUMERIC(4,0)         not null,
   CODPERSONA           VARCHAR(4)           not null,
   FECHAPREST           DATE                 not null,
   constraint PK_PRESTAMO primary key (CONSECPRESTA)
);

/*==============================================================*/
/* Index: PRESTAMO_PK                                           */
/*==============================================================*/
create unique index PRESTAMO_PK on PRESTAMO (
CONSECPRESTA
);

/*==============================================================*/
/* Index: ESTADOPRESTAMO_FK                                     */
/*==============================================================*/
create  index ESTADOPRESTAMO_FK on PRESTAMO (
IDESTADO
);

/*==============================================================*/
/* Index: INVENPRESTAMO_FK                                      */
/*==============================================================*/
create  index INVENPRESTAMO_FK on PRESTAMO (
IDEQUIPO,
IDCOMPLEJO,
CONSECINVE
);

/*==============================================================*/
/* Index: ADMINSITRAPRESTA_FK                                   */
/*==============================================================*/
create  index ADMINSITRAPRESTA_FK on PRESTAMO (
CODPERSONA
);

/*==============================================================*/
/* Table: SEDE                                                  */
/*==============================================================*/
create table SEDE (
   IDCOMPLEJO           CHAR(5)              not null,
   NOMCOMPLEJO          VARCHAR(30)          not null,
   PRESUPUESTO          NUMERIC(7,2)         not null,
   DIRECCION            VARCHAR(30)          not null,
   constraint PK_SEDE primary key (IDCOMPLEJO)
);

/*==============================================================*/
/* Index: SEDE_PK                                               */
/*==============================================================*/
create unique index SEDE_PK on SEDE (
IDCOMPLEJO
);

/*==============================================================*/
/* Table: TAREA                                                 */
/*==============================================================*/
create table TAREA (
   IDTAREA              VARCHAR(3)           not null,
   DESCTAREA            VARCHAR(20)          not null,
   constraint PK_TAREA primary key (IDTAREA)
);

/*==============================================================*/
/* Index: TAREA_PK                                              */
/*==============================================================*/
create unique index TAREA_PK on TAREA (
IDTAREA
);

/*==============================================================*/
/* Table: TIPOPERSONA                                           */
/*==============================================================*/
create table TIPOPERSONA (
   IDTIPOPERSONA        VARCHAR(3)           not null,
   DESCTIPOPERSO        VARCHAR(30)          not null,
   constraint PK_TIPOPERSONA primary key (IDTIPOPERSONA)
);

/*==============================================================*/
/* Index: TIPOPERSONA_PK                                        */
/*==============================================================*/
create unique index TIPOPERSONA_PK on TIPOPERSONA (
IDTIPOPERSONA
);

/*==============================================================*/
/* Table: UNICO                                                 */
/*==============================================================*/
create table UNICO (
   IDUNICO              VARCHAR(4)           not null,
   IDDEPORTE            VARCHAR(5)           not null,
   IDCOMPLEJO           CHAR(5)              not null,
   AREAUNICO            NUMERIC(4,2)         not null,
   constraint PK_UNICO primary key (IDUNICO)
);

/*==============================================================*/
/* Index: UNICO_PK                                              */
/*==============================================================*/
create unique index UNICO_PK on UNICO (
IDUNICO
);

/*==============================================================*/
/* Index: DEPORTEUNICO_FK                                       */
/*==============================================================*/
create  index DEPORTEUNICO_FK on UNICO (
IDDEPORTE
);

alter table AREA
   add constraint FK_AREA_SEDEAREA_SEDE foreign key (IDCOMPLEJO)
      references SEDE (IDCOMPLEJO)
      on delete restrict on update restrict;

alter table COMIDEPOR
   add constraint FK_COMIDEPO_COMIDEPOR_PERSONA foreign key (CODPERSONA)
      references PERSONA (CODPERSONA)
      on delete restrict on update restrict;

alter table COMIDEPOR
   add constraint FK_COMIDEPO_COMIDEPOR_DEPORTE foreign key (IDDEPORTE)
      references DEPORTE (IDDEPORTE)
      on delete restrict on update restrict;

alter table COMISARIODEPORTE
   add constraint FK_COMISARI_COMISARIO_PERSONA foreign key (CODPERSONA)
      references PERSONA (CODPERSONA)
      on delete restrict on update restrict;

alter table COMISARIODEPORTE
   add constraint FK_COMISARI_COMISARIO_DEPORTE2 foreign key (IDDEPORTE2)
      references DEPORTE2 (IDDEPORTE2)
      on delete restrict on update restrict;

alter table COMISARIOEVENTO
   add constraint FK_COMISARI_COMISARIO_PERSONA foreign key (CODPERSONA)
      references PERSONA (CODPERSONA)
      on delete restrict on update restrict;

alter table COMISARIOEVENTO
   add constraint FK_COMISARI_EVENTO_EVENTO foreign key (CONSEC)
      references EVENTO (CONSEC)
      on delete restrict on update restrict;

alter table COMISARIOEVENTO
   add constraint FK_COMISARI_TAREA_TAREA foreign key (IDTAREA)
      references TAREA (IDTAREA)
      on delete restrict on update restrict;

alter table EQUIPODEPORTE
   add constraint FK_EQUIPODE_EQUIPODEP_EQUIPO foreign key (IDEQUIPO)
      references EQUIPO (IDEQUIPO)
      on delete restrict on update restrict;

alter table EQUIPODEPORTE
   add constraint FK_EQUIPODE_EQUIPODEP_DEPORTE foreign key (IDDEPORTE)
      references DEPORTE (IDDEPORTE)
      on delete restrict on update restrict;

alter table EVENTO
   add constraint FK_EVENTO_ADMINISTR_PERSONA foreign key (CODPERSONA)
      references PERSONA (CODPERSONA)
      on delete restrict on update restrict;

alter table EVENTO
   add constraint FK_EVENTO_AREAEVENT_AREA foreign key (ARE_IDCOMPLEJO, IDAREA)
      references AREA (IDCOMPLEJO, IDAREA)
      on delete restrict on update restrict;

alter table EVENTO
   add constraint FK_EVENTO_DEPORTEEV_DEPORTE foreign key (IDDEPORTE)
      references DEPORTE (IDDEPORTE)
      on delete restrict on update restrict;

alter table EVENTO
   add constraint FK_EVENTO_SEDEEVENT_SEDE foreign key (IDCOMPLEJO)
      references SEDE (IDCOMPLEJO)
      on delete restrict on update restrict;

alter table INVENTARIO
   add constraint FK_INVENTAR_EQUIPOINV_EQUIPO foreign key (IDEQUIPO)
      references EQUIPO (IDEQUIPO)
      on delete restrict on update restrict;

alter table INVENTARIO
   add constraint FK_INVENTAR_ESTADOINV_ESTADO foreign key (IDESTADO)
      references ESTADO (IDESTADO)
      on delete restrict on update restrict;

alter table INVENTARIO
   add constraint FK_INVENTAR_SEDEINVEN_SEDE foreign key (IDCOMPLEJO)
      references SEDE (IDCOMPLEJO)
      on delete restrict on update restrict;

alter table PERSONA
   add constraint FK_PERSONA_TIPO_TIPOPERS foreign key (IDTIPOPERSONA)
      references TIPOPERSONA (IDTIPOPERSONA)
      on delete restrict on update restrict;

alter table POLIDEPORTIVO
   add constraint FK_POLIDEPO_AREAPOLI_AREA foreign key (IDCOMPLEJO, IDAREA)
      references AREA (IDCOMPLEJO, IDAREA)
      on delete restrict on update restrict;

alter table POLIDEPORTIVO
   add constraint FK_POLIDEPO_POLIDEPOR_DEPORTE foreign key (IDDEPORTE)
      references DEPORTE (IDDEPORTE)
      on delete restrict on update restrict;

alter table PRESTAMO
   add constraint FK_PRESTAMO_ADMINSITR_PERSONA foreign key (CODPERSONA)
      references PERSONA (CODPERSONA)
      on delete restrict on update restrict;

alter table PRESTAMO
   add constraint FK_PRESTAMO_ESTADOPRE_ESTADO foreign key (IDESTADO)
      references ESTADO (IDESTADO)
      on delete restrict on update restrict;

alter table PRESTAMO
   add constraint FK_PRESTAMO_INVENPRES_INVENTAR foreign key (IDEQUIPO, IDCOMPLEJO, CONSECINVE)
      references INVENTARIO (IDEQUIPO, IDCOMPLEJO, CONSECINVE)
      on delete restrict on update restrict;

alter table UNICO
   add constraint FK_UNICO_DEPORTEUN_DEPORTE foreign key (IDDEPORTE)
      references DEPORTE (IDDEPORTE)
      on delete restrict on update restrict;

alter table UNICO
   add constraint FK_UNICO_SEDEUNICO_SEDE foreign key (IDCOMPLEJO)
      references SEDE (IDCOMPLEJO)
      on delete restrict on update restrict;

