insert into categoria(nome, descricao)value('eletronicos', 'dispositivos eletronicos em geral');
insert into categoria(nome, descricao)value('games', 'consoles e jogos');
insert into categoria(nome, descricao)value('perifericos', 'teclados, mouses e headsets');
insert into categoria(nome, descricao)value('monitores', 'monitores gamer e de escritorio');
insert into categoria(nome, descricao)value('audio', 'fones de ouvido e caixas de som');

insert into produto (nome, descricao, preco, estoque, categoria_id)values('Mouse Sem Fio', 'Mouse ergonomico sem fio', 85.00, 50, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id)values('Teclado Mecanico', 'Teclado RGB switch blue', 250.00, 30, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id)values('Monitor 24 Pol', 'Monitor Full HD 144Hz', 899.90, 15, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id)values('Fone Bluetooth', 'Fone de ouvido com cancelamento de ruido', 199.00, 40, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id)values('PlayStation 5', 'Console com leitor de disco 825GB', 3800.00, 8, 2);

insert into cliente(name, email, telephone)values('Ana Silva', 'ana.silva@gmail.com', '14997123456');
insert into cliente(name, email, telephone)values('Carlos Oliveira', 'carlos.o@hotmail.com', '11988223344');
insert into cliente(name, email, telephone)values('Mariana Santos', 'mari.santos@outlook.com', '21977665544');
insert into cliente(name, email, telephone)values('Roberto Souza', 'roberto.souza@gmail.com', '19991122334');
insert into cliente(name, email, telephone)values('Fernanda Lima', 'fer.lima@yahoo.com.br', '31984455667');

insert into pedido(data, status, valor_total, cliente_id)values("2026-09-02", 'ON', 250, 1);
insert into pedido(data, status, valor_total, cliente_id)values("2026-09-02", 'OFF', 899.90, 1);
insert into pedido(data, status, valor_total, cliente_id)values("2026-09-03", 'ON', 199, 1);
insert into pedido(data, status, valor_total, cliente_id)values("2026-09-03", 'ON', 3800, 1);
insert into pedido(data, status, valor_total, cliente_id)values("2026-09-04", 'OFF', 85, 1);

insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(1, 250, 1, 1);
insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(1, 899.90, 1, 2);
insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(1, 199, 1, 3);
insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(1, 3800, 1, 4);
insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(1, 85, 1, 5);

insert into pagamento(value, data, status, type, pedido_id)values(250, "2025-04-06", "on", "INTERNACIONAL", 1);
insert into pagamento(value, data, status, type, pedido_id)values(899.90, "2025-04-06", "on", "INTERNACIONAL", 2);
insert into pagamento(value, data, status, type, pedido_id)values(199, "2025-04-06", "on", "INTERNACIONAL", 3);
insert into pagamento(value, data, status, type, pedido_id)values(3800, "2025-04-06", "on", "INTERNACIONAL", 4);
insert into pagamento(value, data, status, type, pedido_id)values(85, "2025-04-06", "on", "INTERNACIONAL", 5);