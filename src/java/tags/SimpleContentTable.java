/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Wylianne
 */
public class SimpleContentTable extends SimpleTagSupport{
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
    
    
    @Override
        public void doTag() throws IOException, JspException{
            String[][] conteudo;
            switch (value) {
                case "5":
                    conteudo = new String[3][2];
                    conteudo[0][0] = "Wylianne";
                    conteudo[0][1] = "999346862";
                    conteudo[1][0] = "Paulo";
                    conteudo[1][1] = "907337777";
                    conteudo[2][0] = "Maria";
                    conteudo[2][1] = "990731251";
                    break;
                default:
                    conteudo = new String[1][3];
                    conteudo[0][0] = "Wylianne";
                    conteudo[0][1] = "09049013430"; 
                    conteudo[0][2] = "wylianne@gmail.com";
            }
        String table_content="<tbody>";
        
        //Saber comprimento conteudo[0].length
        for (int i = 0; i < conteudo.length; i++) {
            if(conteudo[i][0] == ""){
                break;
            }
            table_content += "<tr>";
            for (int j = 0; j < conteudo[i].length; j++) {
                table_content += "<td>"+conteudo[i][j]+"</td>";
            }
            table_content += "</tr>";
        }
        table_content += "</tbody>";
        
        getJspContext().getOut().println(table_content);        
    }
    
}
