create database rang_application;

use rang_application;

CREATE TABLE unidades
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    cnes             VARCHAR(255),
    nome             VARCHAR(255),
    faixa_cep_inicio INT,
    faixa_cep_final  INT
);

insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (1, '1', 'Primeiro', 10000, 20000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (2, '2', 'Segundo', 30000, 40000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (3, '3', 'Terceiro', 40000, 50000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (4, '4', 'Quarto', 50000, 60000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (5, '5', 'Quinto', 60000, 70000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (6, '6', 'Sexto', 70000, 80000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (7, '7', 'Sétimo', 80000, 90000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (8, '8', 'Oitavo', 90000, 100000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (9, '9', 'Nono', 100000, 110000);
insert into unidades(id, cnes, nome, faixa_cep_inicio, faixa_cep_final)
values (10, '10', 'Décimo', 110000, 120000);