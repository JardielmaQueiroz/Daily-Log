/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import banco.Conexao;
import dailylog.Atividade;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jardielma e Paulo Ricardo
 */
public class AtividadeBD 
{
   public Atividade salvar(Atividade atividade,int idUsuario, int idExpediente, int idSubCategoria){
        String sql = "";
        //Caso o usuário já exista ele possuí ID
        if(atividade.getId() > 0 ){
            //atualiza o usuario
            //sql = "UPDATE `daylog`.`tbl_usuario` SET `id_perfil` = '"+user.getPerfil().getId()+"', `senha` = '"+user.getSenha()+"',`flag_ativo` = '"+user.getFlagAtivo()+"',`nome` = '"+user.getNome()+"' WHERE (`id_usuario` = '"+user.getId()+"');";
        }
        else{
            //caso não seja atualização ele cria o usuário
            //Preparando váriaveis e Sql
            sql = "INSERT INTO `daylog`.`tbl_atividade` "
                    + "(`titulo`, `descricao`, `horarioInicio`, `horarioFim`, `data`, `id_usuario`, `id_expediente`, `id_subcategoria`) "
                    + "VALUES ('"+atividade.getTitulo()+"', '"+atividade.getDescricao()+"', "
                    + "'"+atividade.getHorarioInicial()+"', '"+atividade.getHorarioFinal()+"', "
                    + "'"+atividade.getData()+"', '"+idUsuario+"', "
                    + "'"+idExpediente+"', '"+idSubCategoria+"');";
        }
        try {
           //verifica se está conectado, caso não esteja conecta
           if(Conexao.getConexao().isClosed()){
               Conexao.conectar(true);
           }
           atividade.setId(Conexao.executeUpdateSql(sql));
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return atividade;   
    }
   
   public void deletar(int idAtividade){
        String sql = "";
        sql = "delete from tbl_atividade where id_atividade = "+idAtividade;
        try {
           //verifica se está conectado, caso não esteja conecta
           if(Conexao.getConexao().isClosed()){
               Conexao.conectar(true);
           }
           Conexao.executeUpdateSql(sql);
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }  
    }
   
   //Lista as permissões de acordo com o perfil informado
    public ArrayList<Atividade> listar(int idUsuario){
     ArrayList<Atividade> listaRetorno = new ArrayList<>();
        //Preparando váriaveis e Sql
        Atividade atividade = new Atividade();
        String sql = "select * from tbl_atividade where id_usuario  = "+idUsuario;
        try {
           //verifica se está conectado, caso não esteja conecta
           if(Conexao.getConexao().isClosed()){
               Conexao.conectar(true);
           }
           ResultSet rs = Conexao.executeQuerySql(sql);
           while(rs.next()){
                atividade = new Atividade();
                //Recupera valor referente ao nome
                atividade.setId(rs.getInt("id_atividade"));
                atividade.setDescricao(rs.getString("descricao"));
                
                atividade.setData(rs.getString("data"));
                atividade.setHorarioInicial(rs.getString("horarioInicio"));
                atividade.setHorarioFinal(rs.getString("horarioFim"));
                
                atividade.setTitulo(rs.getString("titulo"));
                atividade.setIdSubCategoria(rs.getInt("id_subcategoria"));
                atividade.setIdExpediente(rs.getInt("id_Expediente"));
                atividade.setIdUsuario(rs.getInt("id_Usuario"));
                
                 listaRetorno.add(atividade);
            }
           return listaRetorno;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
