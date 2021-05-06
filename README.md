Automato Finito Não deterministico

Sobre o Projeto

Desenvolver um simulador de AFN, que seja capaz de executar qualquer AFN e
informar se uma determinada entrada ´e aceita ou rejeitada pelo AFN. Utilize
um arquivo para descrever o AFN que ser´a executado pelo simulador. O arquivo
dever´a descrever o conjunto de estados, o alfabeto, a matriz de transiço, estado
inicial e o conjunto de estados finais. Por exemplo, considere o AFN apresentado.

Tecnologias Usadas
Java
Como rodar esse projeto?
Precondition: Eclipse instalado versão mais atualizada e java 11 ou superior.

#clone repository
git clone https://github.com/kelvimsfs1/Introducao_computacao-AFN

Abra seu codigo no eclipse e de um run. A aplicação já vem com um arquivo, porém se deseja executar outro é necessario 
seguir esses passos:

O arquivo deverá ter esse padrão:

#A primeira linha é o conjunto e deve ser obrigatoriamente separada por ponto e virgula, da mesma forma a segunda linha. As linhas sequentes podem conter um ou mais valores
por linha, não precisam ser necessariamente separadas por ponto e virgula.

q1;q2;q3;q4
0;1;*;
q1 
q1 q2 
* 
q3 
*
q3
* 
q4
*
q4 
q4
*


Ao fim da execução será gerado no seu diretório de escolha um arquivo com esse layout:

Estado inicial q1 coluna 0 simbolo q1 
Estado corrente q1 coluna 1 simbolo q1;q2 
Estado corrente q1 coluna * simbolo * 
Estado corrente q2 coluna 0 simbolo q3 
Estado corrente q2 coluna 1 simbolo *
Estado corrente q2 coluna * simbolo q3
Estado corrente q3 coluna 0 simbolo * 
Estado corrente q3 coluna 1 simbolo q4
Estado corrente q3 coluna * simbolo *
Estado corrente q4 coluna 0 simbolo q4 
Estado corrente q4 coluna 1 simbolo q4
Estado final q4 coluna * simbolo *


Autores
Kelvim Silva Saidel, Matheus Walz e Jhuan.

