### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?<br>
**R: O comando <code>git --version</code>**<br>

2. Qual o efeito da execução de cada um dos comandos abaixo?<br>
    a. git help 
	<br>**R: É aberto um lista de informações de ajuda sobre o git**<br>

    b. git help checkout 
	<br>**R: É aberto uma página de manual de checkout**<br>

    c. git help merge 
	<br>**R: É aberto uma página de manual de merge**<br>
  
    d. git init 
  	<br>**R: Ele transforma o diretório em repositório git**<br>

    e. git add --all 
	<br>**R: Adiciona todos os arquivos do repositório (novos, modificados e removidos) para que possam ser comitados**<br>
  
    f. git add -u 
	<br>**R: Adiciona todos arquivos modificados ou removidos ao stage para que possam ser comitados**<br>
  
    g. git config -l 
	<br>**R: Lista todas as configurações presentes no git**
  
    h. git mv a.txt b.txt 
	<br>**R: Renomeia o arquivo a.txt para b.txt**<br>
  
    i. git reset --hard 
  	<br>**R: Descarta as alterações na área de stage e reverte as alterações no diretório para o estado do commit especificado**<br>

    j. git log -27 
	<br>**R: Mostra a linha do tempo dos últimos 27 commits realizados** 
  
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
<br>**R: <code>git add</code> para acrescentar todos os arquivos modificados, e <code>git commit -m "mensagem"</code> para realizar o commit das alterações.**<br>

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
<br>**R: O comando <code>git show</code>**<br>

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
<br>**R: Com o comando <code>git status</code>**

6. Qual o comando para efetuar um _commit_?
<br>**R: O comando <code>git commit -m "mensagem"</code>**<br>

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
<br>**R: O comando <code>git stash</code>**<br>

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
<br>**R: É necessário configurar o arquivo denominado de <code>.gitignore</code> e nele deve ser adicionados os diretórios e arquivos que precisam ser ignorados.**<br>

9. O que acontece se o seu repositório local for acidentalmente removido?
<br>**R: Caso queira, pode-se clonar esse repositório, e as alterações que foram subidas anteriormente, serão perdidas.**<br>

10. Como clonar um repositório remoto?
<br>**R: Utilizar o comando <code>git clone</code> seguido da URL do repositório.**<br>

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
<br>**R: O comando <code>git log --oneline</code>**<br>

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
<br>**R: No arquivo <code>config</code> localizado na pasta <code>.git</code>**<br>

13. Qual o comando para criar um repositório local?
<br>**R: O comando <code>git init</code>**<br>

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
<br>**R: O diretório está localizado na pasta raiz onde o comando foi executado e recebe o nome de <code>.git</code>**<br>

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
<br>**R: O comando <code>git add .</code>**<br>

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
<br>**R: O SHA1 tem a função de criptografia, e com ele pode-se detectar alterações de dados, sendo assim utilizado controle de versões.**<br>

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
<br>**R: Pode-se utilizar o comando <code>git log -1</code>.**<br>

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
<br>**R: Não, uma vez que o comando <code>git add -u</code> adiciona apenas os arquivos modificados ou removidos.**<br>

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
<br>**O comando <code>git reset --soft HEAD~1</code> irá retornar para o commint anterior e manter as alterações desse commit. Já o comando <code>git reset --hard</code> irá retornar para o commit anterior e irá remover alterações realizadas neste commit**<br>

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
<br>**R: O comando <code>git clean -fd</code>**<br>

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados? 
<br>**R: O arquivo <code>.gitignore</code>**<br>

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
<br>**R: Devemos adicionar a referência dos arquivos <code>.class</code> no <code>.gitignore</code>**<br>

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
<br>**R: O repositório foi clonado utilizando o comando <code>git clone https://github.com/jquery/jquery.git</code>**<br>

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
<br>**R: Exibe os usuário, juntamento com seus e-mails, ordenados pelo número de commits.**<br>

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
<br>**R: O comando mostra a lista de repositórios remotos.**<br>

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
<br>**R: O comando <code>git tag</code>**<br>

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
<br>**R: Basta utilizar o comando <code>git tag -l "2.0"</code>**<br>

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
<br>**R: Ele irá criar a tag <code>3.4-gold</code> com a mensagem <code>minha versão ouro</code>**<br>

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
<br>**R:Irá apresentar a lista de commits associados a essa tag.**<br>

30. O que o comando **git push origin 3.4-gold** teria como efeito?
<br>**R: Realiza o envio de dados para as branch de commits que estão associados a essa tag**<br>

31. Após executar um commit, qual o efeito de **git commit --amend**?
<br>**R: O comando pode alterar a mensagem de commit já realizado.**<br>

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
<br>**R: O comando retorna o arquivo <code>x.txt</code> para o formato de <code>untracked file</code>**<br>

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
<br>**R: Ele reverte o arquivo a uma versão anterior.**<br>

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
<br>**R: O primeiro reverte mudanças e o segundo afeta somente as alterações referentes ao arquivo em questão.**<br>

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
<br>**R: Elemostra a diferença entre o primeiro e o segundo commits apresentados**<br>

