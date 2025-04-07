package br.com.on.app.controller.swagger;

import br.com.on.app.entity.dto.PessoaInsertDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Categoria", description = "APIs relacionadas a categorias")
public interface PessoaControllerSwagger {

    @Operation(summary = "Insere um novo pedido", description = "Insere um novo pedido no sistema")
    @ApiResponses(
            value = {
                @ApiResponse(
                        responseCode = "201",
                        description = "Pedido criado",
                        content =
                                @Content(
                                        mediaType = "application/json",
                                        schema = @Schema(implementation = PessoaInsertDTO.class))),
                @ApiResponse(responseCode = "400", description = "Dados inválidos"),
                @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            })
    ResponseEntity create(@RequestBody PessoaInsertDTO pessoaInsertDTO);

    @Operation(summary = "Detalha um pedido", description = "Retorna os detalhes de um pedido específico")
    @ApiResponses(
            value = {
                @ApiResponse(responseCode = "200", description = "Pedido encontrado"),
                @ApiResponse(responseCode = "404", description = "Pedido não encontrado")
            })
    ResponseEntity list();

    @Operation(
            summary = "Atualiza um pedido",
            description = "Atualiza as informações de um pedido existente, identificado pelo protocolo fornecido")
    @ApiResponses(
            value = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Pedido atualizado com sucesso",
                        content =
                                @Content(
                                        mediaType = "application/json",
                                        schema = @Schema(implementation = PessoaInsertDTO.class))),
                @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos para a atualização"),
                @ApiResponse(responseCode = "404", description = "Pedido não encontrado com o protocolo informado"),
                @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            })
    ResponseEntity update();

    @Operation(
            summary = "Atualiza um pedido",
            description = "Atualiza as informações de um pedido existente, identificado pelo protocolo fornecido")
    @ApiResponses(
            value = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Pedido atualizado com sucesso",
                        content =
                                @Content(
                                        mediaType = "application/json",
                                        schema = @Schema(implementation = PessoaInsertDTO.class))),
                @ApiResponse(responseCode = "400", description = "Dados inválidos fornecidos para a atualização"),
                @ApiResponse(responseCode = "404", description = "Pedido não encontrado com o protocolo informado"),
                @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
            })
    ResponseEntity delete();
}
