INSERT INTO Civilite (Id,Label)
VALUES
(1,'Homme'),
(2,'Femme'),
(3,'Martien')


INSERT INTO CentreInteret (Id,Label)
VALUES
(1,'C#'),
(2,'Java'),
(3,'CSS'),
(4,'Python'),
(5,'C'),
(6,'Javascript')

INSERT INTO Utilisateur (Nom,Prenom,Email,FK_IdCivilite,DateInscription) 
VALUES
('Meissonnier','Kévin','kevin.meissonnier@email.com',1,DATE '2015-01-26'),
('Cubeddu','Robin','cubeddu.robin@email.com',1,DATE '2015-02-26'),
('Croin','Antoine','a.croin@email.com',1,DATE '2014-03-20'),
('Cribel','Maryne','m.cribel@email.com',2,DATE '2015-01-26'),
('Rodrigues','Thomas','doob.meissonnier@email.com',3,DATE '2015-01-26'),
('Frnx','Pauline','kevin.meissonnier@email.com',1,DATE '2015-01-26'),
('Show','Arti','Arti.Show@email.com',1,DATE '2015-01-26')

INSERT INTO CentreInteret_Utilisateur (FK_IdUtilisateur, FK_IdCentreInteret)
VALUES
(1,2),
(1,3),
(1,4),
(2,3),
(2,6),
(2,1),
(3,1),
(4,6),
(4,2),
(5,1),
(5,2),
(6,1),
(6,2),
(6,3),
(0,3)



