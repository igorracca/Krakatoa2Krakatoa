# Krakatoa2Krakatoa

-----------

## Descricao

**Primeiro Trabalho de Laboratório de Compiladores**

A partir do analisador sintático da linguagem Krakatoa, faça um compilador que constrói a ASA, faz a análise semântica  e gera código idêntico ao original, exceto que sem os comentários. Podem existir pequenas diferenças entre o código gerado e o original, como uma declaração  "int a, b, c;"  ser desdobrada em "int a; int b; int c;". O código gerado deve estar corretamente indentado.
 
Devem existir métodos “genKra” (ou algo assim) nas classes da ASA Program, Statement, subclasses de Statement etc. Estes métodos devem gerar código em Krakatoa. O seu compilador deve passar nos testes léxicos, sintáticos e semânticos fornecidos na página Material de Aula.  Toda a análise sintática e léxica já está feita, exceto para métodos e variáveis estáticos e classes e métodos finais.
   
O seu compilador deve ter obrigatoriamente as características descritas abaixo.
O compilador deve construir uma ASA de forma semelhante à ensinada na disciplina Compiladores. Devem existir métodos genKra (ou algo parecido) na maioria das classes da ASA para a geração de código.
A classe principal do compilador deve se chamar “Comp” e estar em um pacote chamado comp. A classe principal é aquela com o método main. Na correção o professor irá copiar uma classe "Comp" dele para o diretório "src\comp". Esta classe Comp será responsável por chamar o seu compilador e produzir o relatório com os erros.
Não modifique o modo como os erros são sinalizados. Utilize sempre a variável signalError de Compiler e Lexer para sinalizar os erros.
Todos os arquivos devem ter um comentário inicial com o nome dos integrantes do grupo. Sem este comentário o trabalho não será aceito.
Faça todos os testes correspondentes aos possíveis erros léxicos, sintáticos e semânticos. 

**Importante**: métodos e variáveis estáticas e classes e métodos finais não precisam ser implementados. Há testes para estas funcionalidades no diretório tests mas estes devem ser ignorados.
  
-----------

## Execucao

A maneira mais fácil de executar este projeto é abri-lo no Eclipse e rodar passando um diretório com arquivos .kra como parâmetro.
Você pode fazer isso utilizando a opção RUN CONFIGURATIONS > ARGUMENTS. 
  
Note que o compilador fornecido, ao ser chamado passando um diretório como parâmetro, compila todos os arquivos “*.kra” daquele diretório e produz um relatório de erros. Assim, ao chamar o compilador,
            C:\Dropbox\16-2\LC\krakatoa\bin>java -cp . comp.Comp "C:\Dropbox\16-2\LC\tests"
este criará, no diretório corrente,
·       arquivos “*.kra2” correspondentes ao código gerado em Krakatoa (arquivos vazios, é sua tarefa que estes arquivos tenham códigos em Krakatoa equivalentes aos originais);
·       um arquivo report.txt contendo um relatório dos erros do compilador --- assumindo que o diretório passado como parâmetro é o diretório de testes.
 
-----------

## Observações gerais sobre o trabalho:

O intuito deste trabalho é criar a ASA (Árvore sintática abstrata) e realizar a análise semântica de um código fonte em Krakatoa. 
A ASA é uma representação abstrata (simplificada) da estrutura semântica de um código fonte escrito em uma certa linguagem de programação. Cada nó da árvore denota um construtor no código fonte. A sintaxe é abstrata no sentido que ela não representa cada detalhe que aparece na sintaxe real. Por exemplo, agrupar parênteses está implícito na estrutura da árvore, e uma construção sintática como um condicional SE cond ENTÃO expr pode ser denotada por um simples nós com suas ramificações.
Após concluída esta fase, este projeto servirá de base para a segunda fase, onde será implementada a geração de código em C, ou seja, o compilador irá gerar um código fonte em C a partir de um código fonte em Krakatoa (uma linguagem orientada a objetos, mais precisamente um subconjunto de Java).
