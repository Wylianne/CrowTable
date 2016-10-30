/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import AcessoDados.AcessoDados;
import classes.Clientes;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Wylianne
 */
public class SimpleContentTable extends SimpleTagSupport {

    String table_content = "";
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void doTag() throws IOException, JspException {

        try {
            ResultSet res;
            AcessoDados cliente = new AcessoDados();
            int id = 0;
            String cpf;
            String nome;
            String identidade;
            String dataNascimento;
            String escolaridade;
            String endereco;
            String telefone;
            res = cliente.Lista();

//            while (res.next()) {
                id = res.getInt("id");
                cpf = res.getString("cpf");
                nome = res.getString("nome");
                identidade = res.getString("identidade");
                dataNascimento = res.getString("dataNascimento");
                escolaridade = res.getString("escolaridade");
                endereco = res.getString("endereco");
                telefone = res.getString("telefone");

                getJspContext().getOut().println("<tbody><tr>"
                        + "<td width=\"10%\">" + cpf + "</td><td>" + nome + "</td><td width=\"20%\">" + identidade + "</td><td width=\"10%\">" + dataNascimento + "</td><td width=\"10%\">" + escolaridade + "</td><td width=\"10%\">" + endereco + "</td><td width=\"10%\">" + telefone + "</td><td width=\"10%\">Views</td>"
                        + "</tr></tbody>");

//            }
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
