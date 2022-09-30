INSERT INTO restaurante(id, cep, complemento, nome) values
(1L, '0000001','Complemento Endereço Restaurante 1','REstaurante 1'),
(2L,'0000002','Complemento Endereço Restaurante 2','Restaurante 2');

INSERT INTO cliente(id, cep, complemento, nome) values
(1L,'0000001','Complemento Endereço Cliente 1','REstaurante 1'),
(2L,'0000001','Endereço HVK','HVK');


INSERT INTO produto(id,disponivel,nome,valor_unitario,restaurante_id) values
(1L,true,'Produto 1',5.0,1L),
(2L,true,'Produto 1',6.0,1L),
(3L,true,'Produto 1',7.0,2L);

INSERT INTO sacola(id,forma_pagamento,fechada,valor_total,cliente_id) values
(1L,0,false, 0.0, 1L);