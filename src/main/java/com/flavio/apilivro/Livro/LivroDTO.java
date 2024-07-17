package com.flavio.apilivro.Livro;

public record LivroDTO(
         String titulo,
         String autor,
         String idioma,
        int numero_Downloads
) {
}
