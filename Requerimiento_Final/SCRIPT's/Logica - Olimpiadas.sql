-- INTERFAZ INVENTARIO

-- MOSTRAR TABLA DEPORTE
-- Si se escoge desde la Sede con ID = 10001 hasta la Sede con ID = 10005, significa que es una Sede de Unico Deporte, por tanto:
SELECT D.iddeporte, D.nomdeporte, D.nmaxintegrantes FROM deporte D, unico U, sede S WHERE ((D.iddeporte = U.iddeporte) AND (S.idcomplejo = U.idcomplejo) AND (S.idcomplejo = '10001'))
-- Si se escoge desde la Sede con ID = 10006 hasta la Sede con ID = 10015, significa que es una Sede Polideportivo, por tanto:
SELECT D.iddeporte, D.nomdeporte, D.nmaxintegrantes FROM deporte D, polideportivo P, area A, sede S WHERE ((D.iddeporte = P.iddeporte) AND (P.idarea = A.idarea) AND (A.idcomplejo = S.idcomplejo) AND (S.idcomplejo = '10014'))  

-- MOSTRAR TABLA EQUIPO
SELECT E.idequipo, E.nomequipo, E.npares FROM equipo E, equipodeporte ED, deporte D WHERE ((ED.idequipo = E.idequipo) AND (ED.iddeporte = D.iddeporte) AND (ED.iddeporte = '10018'));

-- MOSTRAR TABLA ESTADO
SELECT * FROM estado;
--SELECT ES.idestado, ES.descestado FROM estado ES, inventario I, equipo E WHERE ((ES.idestado = I.idestado) AND (I.idequipo = E.idequipo) AND (E.idequipo = '15')); 

-- INSERTAR DATOS EN INVENTARIO
INSERT INTO inventario(idequipo, idcomplejo, consecinve, idestado, npiezas) VALUES(idequipo, idcomplejo, consecinve, idestado, npiezas);

INTERFAZ UNICO

-- MOSTRAR TABLA SEDES CON UNICO DEPORTE
SELECT S.idcomplejo, S.nomcomplejo, S.presupuesto, S.direccion FROM sede S, unico U WHERE ((S.idcomplejo = U.idcomplejo));

-- INSERTAR DATOS EN DEPORTE
INSERT INTO deporte(iddeporte, nomdeporte, nmaxintegrantes) VALUES (, , );
-- INSERTAR DATOS EN UNICO
INSERT INTO unico(idunico, iddeporte, idcomplejo, areaunico) VALUES (, , , );