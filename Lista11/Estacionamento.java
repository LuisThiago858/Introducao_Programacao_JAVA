/*
 * Enunciado
Consultando o Estacionamento
 

    Um estacionamento lotado sempre é problemático, ainda mais quando não é evidente a falta vagas. É de interesse do dono dum estacionamento consultar o estado vagas de seu estacionamento.

    Todo estacionamento começa com suas vagas desocupadas. Para cada vaga vazia pode ou nao ser modificada para ocupada. Nesse caso uma vaga somente alterna de estado, entre o ocupado e o desocupado.

    Considere o estado duma vaga true se ocupado e false caso contrário. As vagas de identificadas a partir de 0.

    Considere ainda que a numeração das vagas sempre começa de 0 e vai até o o numero de vagas n subtraido em 1.

Entrada:

    O número de vagas n, sendo n>0, o número m de modificações de estado das vagas, sendo m>=0, m numeros inteiros separados por novas linhas, os quais indicam uma das vaga que foi modificada.

 

 


Saida:

    A configuracao final das vagas separadas por unicos espacos em ordem crescente.

Dicas
Suponha n = 3, m = 1, modificacao em 0;

Temos:

v
a
g
a
[
0
]
=
f
a
l
s
e
;
v
a
g
a
[
1
]
=
f
a
l
s
e
;
v
a
g
a
[
2
]
=
f
a
l
s
e
;

alterne vaga[0],

A configuracao final sera:

v
a
g
a
[
0
]
=
t
r
u
e
,
v
a
g
a
[
1
]
=
f
a
l
s
e
,
v
a
g
a
[
2
]
=
f
a
l
s
e
;

Exemplos de Entrada e Saída
Entrada	
3
2
0 2
Saída	
true false true
Entrada	
3
0
Saída	
false false false
 */
package Lista11;

public class Estacionamento {
    
}
