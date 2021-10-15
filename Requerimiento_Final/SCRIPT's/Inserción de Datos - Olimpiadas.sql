--Inscribir 20 deportes
INSERT INTO deporte VALUES ('10001', 'Basket', 12);
INSERT INTO deporte VALUES ('10002', 'Football', 24);
INSERT INTO deporte VALUES ('10003', 'Balonmano', 10);
INSERT INTO deporte VALUES ('10004', 'Micro', 12);
INSERT INTO deporte VALUES ('10005', 'Beisbol', 22);
INSERT INTO deporte VALUES ('10006', 'ciclismo', 1);
INSERT INTO deporte VALUES ('10007', 'Atletismo', 1);
INSERT INTO deporte VALUES ('10008', 'Natacion', 1);
INSERT INTO deporte VALUES ('10009', 'Volleyball', 12);
INSERT INTO deporte VALUES ('10010', 'Tennis de mesa', 1);
INSERT INTO deporte VALUES ('10011', 'Badminton', 1);
INSERT INTO deporte VALUES ('10012', 'Kárate', 1);
INSERT INTO deporte VALUES ('10013', 'Canotaje', 6);
INSERT INTO deporte VALUES ('10014', 'Triatlón', 3);
INSERT INTO deporte VALUES ('10015', 'Tiro con arco', 2);
INSERT INTO deporte VALUES ('10016', 'Gimnasia', 1);
INSERT INTO deporte VALUES ('10017', 'Voleyball playa', 2);
INSERT INTO deporte VALUES ('10018', 'Tennis', 1);
INSERT INTO deporte VALUES ('10019', 'Boxeo', 1);
INSERT INTO deporte VALUES ('10020', 'Waterpolo', 10);
--Inscribir TipoPersona (1, Administrador; y 2, Comisario)
INSERT INTO tipopersona VALUES ('101', 'Administrador');
INSERT INTO tipopersona VALUES ('102', 'Comisario');
--Inscribir 10 Personas (3 administradores y 7 comisarios)
INSERT INTO persona VALUES ('1001', '101', 'Danilo', 'Rojas', 'admin', 'admindanilo@gmail.com', '123');
INSERT INTO persona VALUES ('1002', '101', 'Carlos', 'Pinilla', 'admca', 'admincarlos@gmail.com', '876');
INSERT INTO persona VALUES ('1003', '101', 'Julio', 'Torres', 'admju', 'adminjulio@gmail.com', '598');
INSERT INTO persona VALUES ('1005', '102', 'Jose', 'Alvares', 'comjo', 'comisariojose@gmail.com', '087');
INSERT INTO persona VALUES ('1006', '102', 'Alvaro', 'Sanchez', 'comal', 'comisarioalvaro@gmail.com', '374');
INSERT INTO persona VALUES ('1007', '102', 'Gustavo', 'Avella', 'comgu', 'comisariogustavo@gmail.com', '198');
INSERT INTO persona VALUES ('1008', '102', 'Duvan', 'Chaparro', 'comdu', 'comisarioduvan@gmail.com', '714');
INSERT INTO persona VALUES ('1009', '102', 'Jonatan', 'Duarte', 'comjo', 'comisariojonatan@gmail.com', '467');
INSERT INTO persona VALUES ('1010', '102', 'Cesar', 'Ariza', 'comce', 'comisariocesar@gmail.com', '020');
--Inscribir 15 sedes, 5 con un único deporte y 10 con varios deportes

insert into sede values('10001',  'Complejo 1', 3500, 'Cra 1 7-9');
insert into sede values('10002',  'Complejo 2', 6700, 'Cra 2 4-6');
insert into sede values('10003',  'Complejo 3', 9800, 'Cra 3 7-1');
insert into sede values('10004',  'Complejo 4', 1200, 'Cra 4 6-1');
insert into sede values('10005',  'Complejo 5', 5400, 'Cra 5 3-6');
insert into sede values('10006',  'Complejo 6', 3200, 'Cra 6 1-3');
insert into sede values('10007',  'Complejo 7', 7600, 'Cra 7 7-6');
insert into sede values('10008',  'Complejo 8', 3400, 'Cra 8 3-8');
insert into sede values('10009',  'Complejo 9', 7900, 'Cra 9 2-3');
insert into sede values('10010',  'Complejo 10', 5800, 'Cra 10 6-1');
insert into sede values('10011',  'Complejo 11', 4500, 'Cra 11 8-2');
insert into sede values('10012',  'Complejo 12', 2700, 'Cra 12 4-3');
insert into sede values('10013',  'Complejo 13', 9800, 'Cra 13 1-7');
insert into sede values('10014',  'Complejo 14', 7600, 'Cra 14 9-5');
insert into sede values('10015',  'Complejo 15', 5400, 'Cra 15 3-3');

--Unico deporte
insert into unico values('001', '10006', '10001', 90.2);
insert into unico values('002', '10007', '10002', 80.2);
insert into unico values('003', '10018', '10003', 95.2);
insert into unico values('004', '10019', '10004', 50.2);
insert into unico values('005', '10020', '10005', 30.2);

--Areas
insert into area values('10006', '006', 'Area 101', 'Norte');
insert into area values('10007', '007', 'Area 102', 'Sur');
insert into area values('10008', '008', 'Area 103', 'Este');
insert into area values('10009', '009', 'Area 104', 'Oeste');
insert into area values('10010', '010', 'Area 105', 'Noreste');
insert into area values('10011', '011', 'Area 106', 'Noroeste');
insert into area values('10012', '012', 'Area 107', 'Sureste');
insert into area values('10013', '013', 'Area 108', 'Suroeste');
insert into area values('10014', '014', 'Area 109', 'Nortecentro');
insert into area values('10015', '015', 'Area 110', 'Surcentro');

--Poli deportivo
insert into polideportivo values('01', '10006', '006', '10001');
insert into polideportivo values('02', '10007', '007', '10002');
insert into polideportivo values('03', '10008', '008', '10003');
insert into polideportivo values('04', '10009', '009', '10004');
insert into polideportivo values('05', '10010', '010', '10005');
insert into polideportivo values('06', '10011', '011', '10009');
insert into polideportivo values('07', '10012', '012', '10013');
insert into polideportivo values('08', '10013', '013', '10014');
insert into polideportivo values('09', '10014', '014', '10017');
insert into polideportivo values('10', '10015', '015', '10020');

--Inscribir 20 equipos (equipamiento)

insert into equipo values('1', 'Balon de football', 5);
insert into equipo values('2', 'Balon de baloncesto', 8);
insert into equipo values('3', 'Bate', 4);
insert into equipo values('4', 'Cuerda', 12);
insert into equipo values('5', 'Silbato', 5);
insert into equipo values('6', 'Pelota de tennis', 15);
insert into equipo values('7', 'Raqueta de tennis de mesa', 7);
insert into equipo values('8', 'baston', 3);
insert into equipo values('9', 'Raqueta de tenis', 2);
insert into equipo values('10', 'Volante de bádminton', 8);
insert into equipo values('11', 'Raqueta de bádminton', 3);
insert into equipo values('12', 'Balón de voleibol', 5);
insert into equipo values('13', 'Red de voleibol', 8);
insert into equipo values('14', 'Balón de waterpolo', 2);
insert into equipo values('15', 'Arco', 6);
insert into equipo values('16', 'Casco', 3);
insert into equipo values('17', 'Trampolin', 2);
insert into equipo values('18', 'Pesa', 5);
insert into equipo values('19', 'Cinta', 8);
insert into equipo values('20', 'Flecha', 30);

--Inscribir 20 registros en EquipoDeporte
insert into equipodeporte values ('2', '10001');
insert into equipodeporte values ('1', '10002');
insert into equipodeporte values ('3', '10005');
insert into equipodeporte values ('4', '10003');
insert into equipodeporte values ('5', '10007');
insert into equipodeporte values ('6', '10018');
insert into equipodeporte values ('7', '10010');
insert into equipodeporte values ('8', '10007');
insert into equipodeporte values ('9', '10018');
insert into equipodeporte values ('10', '10011');
insert into equipodeporte values ('11', '10011');
insert into equipodeporte values ('12', '10009');
insert into equipodeporte values ('13', '10009');
insert into equipodeporte values ('14', '10020');
insert into equipodeporte values ('15', '10015');
insert into equipodeporte values ('16', '10015');
insert into equipodeporte values ('17', '10007');
insert into equipodeporte values ('18', '10007');
insert into equipodeporte values ('19', '10007');
insert into equipodeporte values ('20', '10015');


--Inscribir Estado (1 Libre; 2 Dañado; 3 Perdido; 4 Prestado; 5 Préstamo Evento; 6 Préstamo Práctica)
INSERT INTO estado VALUES ('1', 'Libre');
INSERT INTO estado VALUES ('2', 'Dañado');
INSERT INTO estado VALUES ('3', 'Perdido');
INSERT INTO estado VALUES ('4', 'Prestado');
INSERT INTO estado VALUES ('5', 'Préstamo Evento');
INSERT INTO estado VALUES ('6', 'Préstamo Práctica');

--Inscribir Tarea (1 Juez; 2 Observador)
INSERT INTO tarea VALUES ('1', 'Libre');
INSERT INTO tarea VALUES ('2', 'Libre');
