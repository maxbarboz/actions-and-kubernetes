-- Índices adicionais para otimizar buscas
CREATE INDEX idx_pessoa_nome ON pessoa (nome);
CREATE INDEX idx_pessoa_email ON pessoa (email);