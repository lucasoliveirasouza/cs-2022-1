### Tarefa 004: Git Branching - 03/06/2021

1. Qual o nome do branch padrão do Git?
<br>**R: O nome do branch padrão é <code>main</code>**<br>

2. O que o comando **<code>git branch nome</code>** realiza?
<br>**R: O comando cria um novo branch. No lugar de <code>nome</code> poderia ser qualquer outro nome para esse branch**<br>

3. Como criar um branch a partir de um commit específico?
<br>**R: Basta utilizar o comando <code>git branch (nome) (hash do commit)</code>**<br>

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
<br>**R: Irá levar para o branch <code>bugfix/234</code>**<br>

5. Qual o comando para se alternar para um branch de nome **experimento2**?
<br>**R: O comando <code>git checkout experimento2</code>**<br>

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
<br>**R: Ele mostra qual é o branch atual**<br>

7. O que o comando **<code>git checkout -b</code>** nome faz?
<br>**R: O comando cria um novo branch com o nome especificado e faz checkout (mudar) para esse branch.**<br>

8. Qual a função do <code>**comando git branch -d teste</code>**?
<br>**R: O comando deleta o branch especificado. Nesse caso, o branch <code>teste</code>.**<br>

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.


	**Criar dois branch distintos:**

	<code>git branch primeiraBranch</code>
	<code>git branch segundoBranch</code>

	**Ir para o primeiro branch**
	<code>git checkout primeiraBranch</code>

	**Criar um arquivo qualquer (arquivo1.txt) e coloca algo em seu conteúdo**
	**Adicionar o arquivo para ser comitado**

	<code>git add .</code>
	<code>git commit -m "Guardar arquivo 1"</code>
	
	**Mudar de branch**
	
	<code>git checkout segundoBranch<c/ode>

	**Criar um arquivo qualquer (arquivo2.txt) e coloca algo em seu conteúdo, editando o outro arquivo**
	**Adicionar os arquivos para serem comitados**

	<code>git add .</code>
	<code>git commit -m "Guardar arquivo 2"</code>

	**Voltar para branch principal e mesclar com os outros branch**
	<code>git checkout main</code>
	<code>git merge primeiroBranch</code>
	<code>git merge segundoBranch</code>



	



