package br.com.on.app.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.on.app.entity.dto.PessoaInsertDTO;
import br.com.on.app.service.PessoaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PessoaController.class)
class PessoaControllerTest {

    @InjectMocks
    private PessoaController pessoaController;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private PessoaService pessoaService;

    @Test
    void testCreatePessoa() throws Exception {
        // Given
        PessoaInsertDTO inputDTO = new PessoaInsertDTO();
        inputDTO.setNome("João da Silva");
        inputDTO.setEmail("joao@email.com");

        PessoaInsertDTO outputDTO = new PessoaInsertDTO();
        outputDTO.setNome("João da Silva");
        outputDTO.setEmail("joao@email.com");

        Mockito.when(pessoaService.incluirPessoa(any(PessoaInsertDTO.class))).thenReturn(outputDTO);

        // When & Then
        mockMvc.perform(post("/pessoas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(inputDTO)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("João da Silva"))
                .andExpect(jsonPath("$.email").value("joao@email.com"));
    }
}
