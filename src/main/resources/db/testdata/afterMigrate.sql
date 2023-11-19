-- Inserções para a tabela artist
insert into artist (id, name) values (1, 'Fernandinho');
insert into artist (id, name) values (2, 'Gabriela Rocha');
insert into artist (id, name) values (3, 'Hillsong');
insert into artist (id, name) values (4, 'Projeto Sola');
-- E assim por diante para os demais registros da tabela artist

-- Inserções para a tabela album
insert into album (id, title, artist_id) values (1, 'Galileu', 1);
insert into album (id, title, artist_id) values (2, 'Pra Sempre', 1);
insert into album (id, title, artist_id) values (3, 'Ceu', 2);
insert into album (id, title, artist_id) values (4, 'Pra Onde Iremos', 2);

-- Inserções para a tabela song

-- Fernandinho
-- Álbum: Galileu
INSERT INTO song (id, title, album_id) VALUES (1, 'A Alegria do Senhor', 1);
INSERT INTO song (id, title, album_id) VALUES (2, 'Teus Sonhos', 1);
INSERT INTO song (id, title, album_id) VALUES (3, 'Pra Sempre', 1);
INSERT INTO song (id, title, album_id) VALUES (4, 'Quao Lindo Esse Nome E', 1);
INSERT INTO song (id, title, album_id) VALUES (5, 'Jesus, Filho de Deus', 1);
INSERT INTO song (id, title, album_id) VALUES (6, 'Fogo Consumidor', 1);
INSERT INTO song (id, title, album_id) VALUES (7, 'Chegou o Tempo', 1);
INSERT INTO song (id, title, album_id) VALUES (8, 'O Hino', 1);
INSERT INTO song (id, title, album_id) VALUES (9, 'Jesus, Senhor de Tudo', 1);
INSERT INTO song (id, title, album_id) VALUES (10, 'Uma Coisa Peco ao Senhor', 1);
INSERT INTO song (id, title, album_id) VALUES (11, 'Santo, Santo', 1);
INSERT INTO song (id, title, album_id) VALUES (12, 'Quero Te Ver', 1);
INSERT INTO song (id, title, album_id) VALUES (13, 'Quem e Como o Nosso Deus', 1);
insert into song (id, title, album_id) values (14, 'Galileu', 1);

-- Álbum: Pra Sempre
INSERT INTO song (id, title, album_id) VALUES (15, 'Mais Alto', 2);
INSERT INTO song (id, title, album_id) VALUES (16, 'Ele Me Ama', 2);
INSERT INTO song (id, title, album_id) VALUES (17, 'Faz Chover', 2);
INSERT INTO song (id, title, album_id) VALUES (18, 'Meu Bem Maior', 2);
INSERT INTO song (id, title, album_id) VALUES (19, 'Pra Sempre', 2);
INSERT INTO song (id, title, album_id) VALUES (20, 'Deus Tem o Melhor Pra Mim', 2);
INSERT INTO song (id, title, album_id) VALUES (21, 'Yeshua', 2);
INSERT INTO song (id, title, album_id) VALUES (22, 'Avivamento', 2);
INSERT INTO song (id, title, album_id) VALUES (23, 'Uma Nova Historia', 2);
INSERT INTO song (id, title, album_id) VALUES (24, 'Me Leva', 2);
INSERT INTO song (id, title, album_id) VALUES (25, 'O Amor e a Resposta', 2);
INSERT INTO song (id, title, album_id) VALUES (26, 'Tudo Entregarei', 2);

-- Gabriela Rocha

-- Álbum: Ceu
INSERT INTO song (id, title, album_id) VALUES (27, 'Meu Salvador', 3);
INSERT INTO song (id, title, album_id) VALUES (28, 'Atos 2', 3);
INSERT INTO song (id, title, album_id) VALUES (29, 'Me Aproximou', 3);
INSERT INTO song (id, title, album_id) VALUES (30, 'Teu Santo Nome', 3);
INSERT INTO song (id, title, album_id) VALUES (31, 'Ceu', 3);
INSERT INTO song (id, title, album_id) VALUES (32, 'Eu Te Louvarei', 3);
INSERT INTO song (id, title, album_id) VALUES (33, 'Meu Primeiro Amor', 3);
INSERT INTO song (id, title, album_id) VALUES (34, 'Pai Nosso (Our Father)', 3);
INSERT INTO song (id, title, album_id) VALUES (35, 'Nossa Cancao', 3);
INSERT INTO song (id, title, album_id) VALUES (36, 'Creio Que Tu Es a Cura', 3);
INSERT INTO song (id, title, album_id) VALUES (37, 'Vou Me Lembrar do Quanto Tu Me Amas', 3);

-- Álbum: Pra Onde Iremos
INSERT INTO song (id, title, album_id) VALUES (38, 'Atos 2', 4);
INSERT INTO song (id, title, album_id) VALUES (39, 'Meu Salvador', 4);
INSERT INTO song (id, title, album_id) VALUES (40, 'Eu Te Louvarei', 4);
INSERT INTO song (id, title, album_id) VALUES (41, 'Creio que Tu Es a Cura', 4);
INSERT INTO song (id, title, album_id) VALUES (42, 'Ceu', 4);
INSERT INTO song (id, title, album_id) VALUES (43, 'Teu Santo Nome', 4);
INSERT INTO song (id, title, album_id) VALUES (44, 'Nossa Cancao', 4);
INSERT INTO song (id, title, album_id) VALUES (45, 'Me Aproximou', 4);
INSERT INTO song (id, title, album_id) VALUES (46, 'Pai Nosso (Our Father)', 4);
INSERT INTO song (id, title, album_id) VALUES (47, 'Meu Primeiro Amor', 4);
INSERT INTO song (id, title, album_id) VALUES (48, 'Uma Nova Historia', 4);
INSERT INTO song (id, title, album_id) VALUES (49, 'Vou Me Lembrar do Quanto Tu Me Amas',4);




