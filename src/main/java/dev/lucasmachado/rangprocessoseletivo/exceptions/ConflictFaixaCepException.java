package dev.lucasmachado.rangprocessoseletivo.exceptions;

public class ConflictFaixaCepException extends RuntimeException {
   public ConflictFaixaCepException() {
       super("Já existe uma unidade de saúde cadastrada para o mesmo intervalo de ceps.");
   }
}
