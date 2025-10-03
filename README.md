# Calculadora

Projeto Maven Java simples com uma classe `Calculadora` e testes JUnit 5.

Como rodar:

```bash
mvn test
```

Arquivos principais:
- `src/main/java/com/exemplo/Calculadora.java` - implementa as operações básicas.
- `src/test/java/com/exemplo/CalculadoraTest.java` - testes unitários com JUnit 5.

Java 11 é requerido.

## Nota sobre ambiente

Java 17 e Maven foram instalados neste macOS via Homebrew durante esta sessão. Para reproduzir o mesmo ambiente no seu computador, você pode executar:

```bash
brew install openjdk@17 maven
# adicionar OpenJDK 17 ao PATH (no zsh):
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
# reinicie o terminal ou carregue o .zshrc: source ~/.zshrc

# rodar os testes do projeto
cd /Users/felipemira/desafio/aplicativo
mvn test
```

Se preferir outra versão do Java (por exemplo, Java 11), adapte o pacote instalado (por exemplo `openjdk@11`).


## Nota sobre ambiente

Java 17 e Maven foram instalados via Homebrew. Para reproduzir neste macOS, execute:




