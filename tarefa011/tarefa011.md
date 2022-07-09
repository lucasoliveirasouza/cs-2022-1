# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022


### Padrões de Codificação
Padrões de codificações significa definir regras básicas para que uma equipe escreva código da mesma maneira. Isso garante facilidade no processo de desenvolvimento, facilita a retirada de bugs e a manutenção de código. O uso de padrões de codificação deve ser utilizado porque aumenta a produtividade em projetos, uma vez que melhora o entendimento do código por todos da equipe. Eles devem ser utilizados em todo o código e isso ocorre de diversas formas, como:
 * Para definir nomes de classes e interfaces;
 * Para definir nomes de métodos;
 * Definir nomes de variáveis;
 * Definir nomes de constantes;
 * Definir forma de uso de comentários;
 * Definir como declarar variáveis;
 * Definir como funciona a indentação; <br>

Um exemplo de utilização de padrões de codificação é que para nomear métodos, deve-se iniciar com letra minúscula. Caso seja um nome composto, os outros nomes deve iniciar com letra maiúscula, como exemplo: **calcularSalario( )**;
<br><br>


### Reflexão
A reflexão é a capacidade de examinar, modificar a estrutura e comportamento dede métodos, classes e interfaces em tempo de execução. Com ela, é possível obter informações sobre a classe que um determinado objeto pertence, além de métodos dessa classe que podem ser executados utilizando tal objeto. Ela pode ser utilizada quando necessita obter informações sobre classes, construtores e métodos, para obter os atributos públicos de um objeto. Também pode ser utilizada para criar bibliotecas genéricas para lidar com diferentes formatos sem reimplantação.<br> 
Um exemplo de uso é o seguinte, que pode ser usado quando necessitar saber o tipo de uma variável:<br>

<code>int num = 12;</code><br>
<code>Type tipo = num.GetType();</code><br>
<code>Console.WriteLine(tipo);</code><br>

Nesse caso, a saída seria <code>System.Int32</code>
<br><br>

### Programação defensiva
Programação defensiva pode ser definida como a criação de código com a finalidade de evitar problemas antes que eles ocorram e afetem todo o projeto. Com ela, cria-se um programa capaz de funcionar corretamente mesmo m situações inesperadas. Para isso, ela faz uso de testes extensivos e a criação de projeto que pode ser auditado e verificado facilmente. Ela deve ser utilizada nas diversas partes onde existe interação com o usuário, para evitar que ações feitas por ele, afete a integridade de dados e do sistema. <br>
Um exemplo de programação defensiva é quando existe um método que cadastra dados de um usuário. Dentro desse método, deve existir condições que verifiquem se as informações fornecidas por ele, são válidas, para que inconsistências não sejam salvas no banco de dados, evitando possíveis erros.

