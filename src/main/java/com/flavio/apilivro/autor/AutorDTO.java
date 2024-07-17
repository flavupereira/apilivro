package com.flavio.apilivro.autor;

import java.util.Date;

public record AutorDTO(
        String nome,
        String nascimento,
        Date Aano_falecimento
) {
}
