insert into categoria(nome, descricao)value('informatica', 'produtos de indormatica');
insert into categoria(nome, descricao)value('iphone', 'iphone 16 pro max');
insert into categoria(nome,descricao)value('computador', 'ryzen 3600x');
insert into produto (nome, descricao, preco, estoque, categoria_id)values('Campo de Futebol', 'Um campo de futebol', 100.00, 20,2)

insert into cliente(name, email, telephone)values('Luiz', 'trovojt@gmail.com', '14998537699');

insert into pedido(data, status, valor_total, cliente_id)values("2026-09-01", 'ON', 1000, 1);

insert into item_pedido(quantity, valor_unitario, pedido_id, produto_id)values(150, 1500, 1, 1);

insert into pagamento(value, data, status, type, pedido_id)values(1000, "2025-04-06", "on", "INTERNACIONAL");