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
  
Note que o compilador fornecido, ao ser chamado passando um diretório como parâmetro, compila todos os arquivos “*.kra” daquele diretório e produz um relatório de erros. Assim, ao chamar o compilador,
            C:\Dropbox\16-2\LC\krakatoa\bin>java -cp . comp.Comp "C:\Dropbox\16-2\LC\tests"
este criará, no diretório corrente,
·       arquivos “*.kra2” correspondentes ao código gerado em Krakatoa (arquivos vazios, é sua tarefa que estes arquivos tenham códigos em Krakatoa equivalentes aos originais);
·       um arquivo report.txt contendo um relatório dos erros do compilador --- assumindo que o diretório passado como parâmetro é o diretório de testes.
 
-----------

## Observações gerais sobre o trabalho:

qualquer parte do trabalho poderá ser copiada de qualquer grupo, desde que este fato seja escrito na folha de capa do trabalho. Trabalhos com um número significativo de trechos iguais sem a devida observação na capa receberão zero. A nota do trabalho diminui com a quantidade de trechos copiados. De qualquer forma, não mais do que 10% do código pode ser copiado, mesmo com observações na folha de capa. Estes 10% se referem aos trechos feitos por você, não ao total do compilador, cuja maior parte foi fornecida na página da disciplina;
faça o seu trabalho utilizando corretamente os princípios de orientação a objetos. Procure o professor em dúvida;
não serão aceitos trabalhos atrasados.
