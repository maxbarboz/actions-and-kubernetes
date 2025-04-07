-- Criação da tabela pessoa com comentários
CREATE TABLE pessoa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT 'Identificador único da pessoa',
    nome VARCHAR(255) NOT NULL COMMENT 'Nome completo da pessoa',
    email VARCHAR(255) UNIQUE NOT NULL COMMENT 'Endereço de e-mail da pessoa',
    data_nascimento DATE COMMENT 'Data de nascimento da pessoa',
    cpf VARCHAR(14) UNIQUE COMMENT 'Número do CPF da pessoa (formato: XXX.XXX.XXX-XX)',
    telefone VARCHAR(20) COMMENT 'Número de telefone da pessoa',
    endereco TEXT COMMENT 'Endereço completo da pessoa',
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT 'Data e hora da criação do registro',
    atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Data e hora da última atualização do registro'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Tabela que armazena informações sobre pessoas';

-- Índices adicionais para otimizar buscas
CREATE INDEX idx_pessoa_nome ON pessoa (nome);
CREATE INDEX idx_pessoa_email ON pessoa (email);