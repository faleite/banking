-- Insert customers
INSERT INTO customer (id, name, email) VALUES (1, 'Guilherme', 'guilherme@example.com');
INSERT INTO customer (id, name, email) VALUES (2, 'João', 'joao@example.com');

-- Insert accounts
INSERT INTO account (id, number, balance) VALUES (1, 'A1001', 1000.0);
INSERT INTO account (id, number, balance) VALUES (2, 'A2001', 2500.0);

-- Insert cards
INSERT INTO card (id, number, type) VALUES (1, '1111-2222-3333-4444', 'DEBIT');
INSERT INTO card (id, number, type) VALUES (2, '5555-6666-7777-8888', 'CREDIT');
