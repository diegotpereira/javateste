import java.sql.Connection;

import org.junit.Test;

public class TesteConexaoBancoDados {

    private static Connection testeConexao;
    private static ConexaoDAO genericoJDBCDao;

    @Test 
    public void conectarBancoDados() {

        genericoJDBCDao = new ConexaoDAO("root", "root");
        genericoJDBCDao.setBancoDadosms("mysql");
        genericoJDBCDao.setBancoDadosNome("teste");
        genericoJDBCDao.setServidorNome("localhost");
        genericoJDBCDao.setPortaNumero("3306");


        testeConexao = genericoJDBCDao.criarConexao();
        genericoJDBCDao.setCon(testeConexao);

    }

    public static Connection getConnectionTeste() {

        return testeConexao;
    }

    public static ConexaoDAO genericoJDBCDao() {

        return genericoJDBCDao;
    }
}