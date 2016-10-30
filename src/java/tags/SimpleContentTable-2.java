/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import AcessoDados.AcessoDados;
import Svr.Cliente;
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
public class SimpleContentTable2 extends SimpleTagSupport{
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
    
    
    @Override
        public void doTag() throws IOException, JspException{
           try {
        ResultSet res;
            AcessoDados value = new AcessoDados();
            int id = 0;
            String cpf = "";
            String nome = "";
            String identidade = "";
            String dataNascimento = "";
            String escolaridade = "";
            String endereco = "";
            String telefone = "";
            res = value.Lista();
            
           
//         while (res.next()) {
                id = res.getInt("id");
                cpf = res.getString("cpf");
                nome = res.getString("nome");
                identidade = res.getString("identidade");
                dataNascimento = res.getString("dataNascimento");
                escolaridade = res.getString("escolaridade");
                endereco = res.getString("endereco");
                telefone = res.getString("telefone");
    
            getJspContext().getOut().println("<tbody><tr><th width=\"10%\">090909</th><th>"+nome+"</th><th width=\"20%\">"+identidade+"</th><th width=\"10%\">"+dataNascimento+"</th><th width=\"10%\">"+escolaridade+"</th><th width=\"10%\">"+endereco+"</th><th width=\"10%\">"+telefone+"</th><th width=\"10%\">Views</th></tr></tbody>"
                + "<tfoot></tfoot></table></div>");
            
             
                
//        }
    }   catch (Exception ex) {
       Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            
    }
          
    
}
}
