# _Daily-Log_

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f398b861a325477d8727dd5adf5bdcf8)](https://app.codacy.com/app/JardielmaQueiroz/Daily-Log_2?utm_source=github.com&utm_medium=referral&utm_content=JardielmaQueiroz/Daily-Log&utm_campaign=Badge_Grade_Dashboard)

<P align="justify">&nbsp&nbsp Trabalho desenvolvido para a disciplina de Programação Orientada a Objetos do curso Bacharelado em Sistemas de Informação(IFES - Campus Serra) no semestre 2018/2.</p>

### 1. COMPONENTES<br>
**Integrantes do grupo:**<br>
-  Jardielma Queiroz de Lima:<a href="url"> jardielmaqueiroz@hotmail.com </a>
-  Paulo Ricardo Viana Ferreira:<a href="url"> paulo_ricardosf@outlook.com <br></a>

### 2. JUSTIFICATIVA DO SISTEMA<br>
<P align="justify">&nbsp&nbsp O sistema tem como propósito principal fazer o controle do tempo gasto com realização de atividades durante o expediente de trabalho. Além disso, o mesmo será utilizado como mediador para tomada de decisões estratégicas referentes à organização de atividades no trabalho, uma vez que essa ferramenta terá a capacidade de medir o tempo que está sendo gasto com cada atividade.</p>

### 3.MINI-MUNDO<br>
<P align="justify">&nbsp&nbsp A principal funcionalidade do sistema é controlar as atividades que os gestores desenvolvem no decorrer do expediente de trabalho, ações necessárias ou eventos significativos que não foram capturados no dia-a-dia e mostrar para eles dados estatísticos sobre as categorias de atividades que estão demandando maior parte do seu tempo. Categoria de atividade é uma classificação para identificar as características da atividade, já as subcategorias são as especificidades de cada categoria de atividade. Uma atividade possui titulo, descrição, duração, categoria, subcategoria, data e horário em que foi iniciada e concluída. As atividades devem ser iniciadas e finalizadas durante o horário de início e fim do expediente. Caso uma atividade seja iniciada e não seja concluída até o horário de fim do expediente a mesma será considerada como concluída. Vários usuários podem participar de uma atividade, no entanto cada usuário fica responsável pela sua participação na atividade.</p>

<P align="justify">&nbsp&nbsp Após uma atividade ser inserida no sistema, ela só poderá ser editada e ou deletada durante o período (30 dias) que estiver apta a receber modificações, após esse período nenhuma alteração será permitida. Duas atividades não podem ser inseridas no mesmo horário, caso aconteça, o sistema deve alertar que já existe uma atividade agendada para fazer naquele horário, não permitindo sobrescreve-lá a menos que a pessoa confirme que deseja descartar a atividade existente e permanecer com a nova. Além disso, o sistema deve permitir que o horário do expediente de trabalho - ex: 08h às 18h ou 12h às 19h seja definido, podendo posteriormente editar o horário do expediente de acordo com a necessidade. Além de, poder inserir, atualizar, deletar e consultar atividades que realizou. Apenas as pessoas que possuírem perfil de usuário comum ou de administrador do sistema poderão executar as funcionalidades citadas acima. Perfil de usuário será uma forma de atribuir responsabilidades às pessoas que utilizaram o sistema, de modo que para cada perfil será atribuído funcionalidades específicas.</p>

<P align="justify">&nbsp&nbsp O sistema deve permitir que pessoas com perfis autorizados (Usuário Administrador e usuário de cadastro), cadastrem novas categorias e subcategorias, destacando que só é possível criar subcategoria para uma categoria já existente e uma subcategoria está associada apenas a uma categoria.</p>

<P align="justify">&nbsp&nbsp As pessoas que utilizarem o sistema, poderão consultar dados estatísticos em forma de gráfico e também relatórios semanais, trimestrais e por período específico sobre a relação de tempo que foi gasto com cada categoria de atividade e a porcentagem de  categoria de atividade em relação a carga horária de trabalho definida (semanal, mensal e por período), além de poder visualizar por categoria de atividade a subcategoria que demanda mais tempo. Apenas as pessoas que possuírem perfil de usuário comum e usuário administrador, poderão executar as funcionalidades citadas. Além disso, pessoas que possuírem perfil de administrador poderão visualizar relatórios de outras pessoas que também utilizam o sistema, destacando que essas pessoas deverão trabalhar no mesmo setor ou possuírem algum vínculo entre se.</p>

<P align="justify">&nbsp&nbspO cadastro de usuários assim como informações referentes a ele serão feitas por meio do sistema externo da STI, os registros de eventos do sistema devem ser armazenados, o sistema deverá se comportar adequadamente, independente da plataforma que será utilizada para acesso – Browser, Smartphone ou Tablet e deve possuir opções de acessibilidade, tais como, alteração no tamanho da fonte, alto contraste e uma interface intuitiva com símbolos em todos os botões.</p>

### 4.PROJECT MODEL CANVAS (PMC)<br>
 ![Alt Text](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Imagens/.PROJECT%20MODEL%20CANVAS%20(PMC).jpg)
-  [Link Para Acessar o documento no Drive.](https://drive.google.com/open?id=1BRnduh3Mi0v3PKa6mQV48JVdOMDXuDwR)

### 5.MAPA MENTAL<br>
 ![Alt Text](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Imagens/Mapa%20Mental%20do%20Sistema.PNG?raw=true)
 
### 6. TECNOLOGIAS UTILIZADAS<br>
-  **Java:** Implementação do código fonte;
-  **MySQL:** Implementação de Bando de Dados;
-  **Biblioteca Sqlite:** Implementação do Banco de Dados
-  **Balsamiq:** Protótipós;

### 7. DIÁRIO DE BORDO<br>
-  [Link Para Acessar o documento no Drive.](https://drive.google.com/open?id=1P6XwhbS9ZVZyNuUQGXmAFkPPXhGp1INxyhvCrwF9Y6E)

### 8. QUADRO KANBAN<br>
-  [Link Para Acessar o quadro no Trello.](https://trello.com/b/HZuN7nHJ/dailylog2)

### 9. JavaDoc<br>
-  [Link Para Acessar o JavDoc.]()

### 10.PROTÓTIPOS DO SISTEMA(MOCKUPS)<br>
-  [MOCKUP - PERFIL USUARIO](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Documentos/Prot-tipos/Daily%20Log%20-%20Perfil%20Usuario%20Comum%20.pdf)
-  [MOCKUP - PERFIL DE CADASTRO](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Documentos/Prot-tipos/Daily%20Log%20%20-%20Perfil%20de%20Cadastro.pdf)
-  [MOCKUP - PERFIL ADMINISTRADOR](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Documentos/Prot-tipos/Daily%20Log%20-%20Perfil%20Adiministrador.pdf)

### 11. DIAGRAMA DE CLASSES UML<br>
 ![Alt Text](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Imagens/Diagrama%20de%20Classe%20-%20Daily%20Log.jpg?raw=true)

### 12. MODELO CONCEITUAL <br>
 ![Alt Text](https://github.com/JardielmaQueiroz/Daily-Log/blob/master/Imagens/Modelo%20Conceitual%20DailyLog.png)
