/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import AcessoDados.AcessoDados;
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
public class SimpleTable extends SimpleTagSupport{
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
      
    
    public void doTag() throws IOException, JspException{
       
        AcessoDados cliente = new AcessoDados();
         
            
            getJspContext().getOut().println("<div class='container'> <table class='table table-striped table-bordered'>"
                + "<thead><tr><th width=\"10%\">CPF</th><th>Nome</th><th width=\"20%\">Identidade</th><th width=\"10%\">Data de Nascimento</th><th width=\"10%\">Escolaridade</th><th width=\"10%\">Endereco</th><th width=\"10%\">telefone</th><th width=\"10%\">Views</th></tr></thead>");
    }
}
        
    


      
      

