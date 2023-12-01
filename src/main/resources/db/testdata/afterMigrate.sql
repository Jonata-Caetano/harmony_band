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
INSERT INTO song (id, title, tempo, album_id, song_key, bpm, time_sig, status, chart, song, playback)
VALUES
(1, 'Luz do Mundo', '100', 1, 'C#', '120', '4/4', 1, 'chart_value_1', 'song_value_1', 'playback_value_1'),
(2, 'Teus Sonhos', '152', 1, 'F#', '130', '3/4', 1, 'chart_value_2', 'song_value_2', 'playback_value_2'),
(3, 'Pra Sempre', '80', 1, 'G', '110', '6/8', 1, 'chart_value_3', 'song_value_3', 'playback_value_3'),
(4, 'Quao Lindo Esse Nome E', '100', 1, 'G#', '125', '4/4', 1, 'chart_value_4', 'song_value_4', 'playback_value_4'),
(5, 'Jesus, Filho de Deus', '110', 1, 'A#', '115', '3/4', 1, 'chart_value_5', 'song_value_5', 'playback_value_5'),
(6, 'Fogo Consumidor', '95', 1, 'C', '105', '6/8', 1, 'chart_value_6', 'song_value_6', 'playback_value_6'),
(7, 'Chegou o Tempo', '120', 1, 'D', '130', '4/4', 1, 'chart_value_7', 'song_value_7', 'playback_value_7'),
(8, 'O Hino', '85', 1, 'F', '95', '4/4', 1, 'chart_value_8', 'song_value_8', 'playback_value_8'),
(9, 'Jesus, Senhor de Tudo', '130', 1, 'E', '140', '3/4', 1, 'chart_value_9', 'song_value_9', 'playback_value_9'),
(10, 'Uma Coisa Peco ao Senhor', '75', 1, 'B', '85', '6/8', 1, 'chart_value_10', 'song_value_10', 'playback_value_10'),
(11, 'Santo, Santo', '100', 1, 'A', '110', '4/4', 1, 'chart_value_11', 'song_value_11', 'playback_value_11'),
(12, 'Quero Te Ver', '90', 1, 'D#', '100', '4/4', 1, 'chart_value_12', 'song_value_12', 'playback_value_12'),
(13, 'Quem e Como o Nosso Deus', '105', 1, 'F#', '115', '3/4', 1, 'chart_value_13', 'song_value_13', 'playback_value_13'),

-- Álbum: Pra Sempre
(15, 'Mais Alto', '95', 2, 'C#', '105', '4/4', 1, 'chart_value_15', 'song_value_15', 'playback_value_15'),
(16, 'Ele Me Ama', '100', 2, 'F', '110', '3/4', 1, 'chart_value_16', 'song_value_16', 'playback_value_16'),
(17, 'Faz Chover', '110', 2, 'A', '120', '6/8', 1, 'chart_value_17', 'song_value_17', 'playback_value_17'),
(18, 'Meu Bem Maior', '120', 2, 'G', '130', '4/4', 1, 'chart_value_18', 'song_value_18', 'playback_value_18'),
(19, 'Pra Sempre', '85', 2, 'D', '95', '4/4', 1, 'chart_value_19', 'song_value_19', 'playback_value_19'),
(20, 'Deus Tem o Melhor Pra Mim', '130', 2, 'E', '140', '3/4', 1, 'chart_value_20', 'song_value_20', 'playback_value_20'),
(21, 'Yeshua', '70', 2, 'B', '80', '6/8', 1, 'chart_value_21', 'song_value_21', 'playback_value_21'),
(22, 'Avivamento', '105', 2, 'G#', '115', '4/4', 1, 'chart_value_22', 'song_value_22', 'playback_value_22'),
(23, 'Uma Nova Historia', '115', 2, 'A#', '125', '4/4', 1, 'chart_value_23', 'song_value_23', 'playback_value_23'),
(24, 'Me Leva', '90', 2, 'C', '100', '3/4', 1, 'chart_value_24', 'song_value_24', 'playback_value_24'),
(25, 'O Amor e a Resposta', '100', 2, 'D#', '110', '6/8', 1, 'chart_value_25', 'song_value_25', 'playback_value_25'),
(26, 'Tudo Entregarei', '80', 2, 'F#', '90', '4/4', 1, 'chart_value_26', 'song_value_26', 'playback_value_26'),


-- Gabriela Rocha
-- Álbum: Ceu
(27, 'Meu Salvador', '95', 3, 'C#', '105', '4/4', 1, 'chart_value_27', 'song_value_27', 'playback_value_27'),
(28, 'Atos 2', '100', 3, 'F', '110', '3/4', 1, 'chart_value_28', 'song_value_28', 'playback_value_28'),
(29, 'Me Aproximou', '110', 3, 'A', '120', '6/8', 1, 'chart_value_29', 'song_value_29', 'playback_value_29'),
(30, 'Teu Santo Nome', '120', 3, 'G', '130', '4/4', 1, 'chart_value_30', 'song_value_30', 'playback_value_30'),
(31, 'Ceu', '85', 3, 'D', '95', '4/4', 1, 'chart_value_31', 'song_value_31', 'playback_value_31'),
(32, 'Eu Te Louvarei', '130', 3, 'E', '140', '3/4', 1, 'chart_value_32', 'song_value_32', 'playback_value_32'),
(33, 'Meu Primeiro Amor', '70', 3, 'B', '80', '6/8', 1, 'chart_value_33', 'song_value_33', 'playback_value_33'),
(34, 'Pai Nosso (Our Father)', '105', 3, 'G#', '115', '4/4', 1, 'chart_value_34', 'song_value_34', 'playback_value_34'),
(35, 'Nossa Cancao', '115', 3, 'A#', '125', '4/4', 1, 'chart_value_35', 'song_value_35', 'playback_value_35'),
(36, 'Creio Que Tu Es a Cura', '90', 3, 'C', '100', '3/4', 1, 'chart_value_36', 'song_value_36', 'playback_value_36'),
(37, 'Vou Me Lembrar do Quanto Tu Me Amas', '100', 3, 'D#', '110', '6/8', 1, 'chart_value_37', 'song_value_37', 'playback_value_37'),


-- Álbum: Pra Onde Iremos
(38, 'Atos 2', '95', 4, 'C#', '105', '4/4', 1, 'chart_value_38', 'song_value_38', 'playback_value_38'),
(39, 'Meu Salvador', '100', 4, 'F', '110', '3/4', 1, 'chart_value_39', 'song_value_39', 'playback_value_39'),
(40, 'Eu Te Louvarei', '110', 4, 'A', '120', '6/8', 1, 'chart_value_40', 'song_value_40', 'playback_value_40'),
(41, 'Creio que Tu Es a Cura', '120', 4, 'G', '130', '4/4', 1, 'chart_value_41', 'song_value_41', 'playback_value_41'),
(42, 'Ceu', '85', 4, 'D', '95', '4/4', 1, 'chart_value_42', 'song_value_42', 'playback_value_42'),
(43, 'Teu Santo Nome', '130', 4, 'E', '140', '3/4', 1, 'chart_value_43', 'song_value_43', 'playback_value_43'),
(44, 'Nossa Cancao', '70', 4, 'B', '80', '6/8', 1, 'chart_value_44', 'song_value_44', 'playback_value_44'),
(45, 'Me Aproximou', '105', 4, 'G#', '115', '4/4', 1, 'chart_value_45', 'song_value_45', 'playback_value_45'),
(46, 'Pai Nosso (Our Father)', '115', 4, 'A#', '125', '4/4', 1, 'chart_value_46', 'song_value_46', 'playback_value_46'),
(47, 'Meu Primeiro Amor', '90', 4, 'C', '100', '3/4', 1, 'chart_value_47', 'song_value_47', 'playback_value_47'),
(48, 'Uma Nova Historia', '100', 4, 'D#', '110', '6/8', 1, 'chart_value_48', 'song_value_48', 'playback_value_48'),
(49, 'Vou Me Lembrar do Quanto Tu Me Amas', '80', 4, 'F#', '90', '4/4', 1, 'chart_value_49', 'song_value_49', 'playback_value_49');





