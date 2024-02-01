package com.biblioteca;




import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class AdicionaContato extends HttpServlet {

    public void init() {

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();

        //Pegando os parâmetros da request

        String nome = request.getParameter("form-nome");
        String endereco = request.getParameter("form-email");
        String email = request.getParameter("form-email");
        String dataEmTexto = request.getParameter("form-dataNascimento");
        Calendar dataNascimento = null;

        //fazendo conversão da data
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (ParseException e) {
            out.println("Erro de conversão na data");
            return; // para execução do método
        }

        //monta um objeto contato

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setEndereco(endereco);
        contato.setDataNascimento(dataNascimento);

        //Salva o contato

        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);

        out.print("<script>");
        out.print("alert('Contato " + contato.getNome() + " adicionado com sucesso');");
        out.print("</script>");

        out.print("<script>");
        out.print("location.href = 'index.jsp';");
        out.print("</script>");

        out.close();

    }

    public void destroy() {

    }


}
