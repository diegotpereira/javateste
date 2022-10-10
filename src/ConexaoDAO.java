import java.sql.Connection;
import java.util.Properties;

public class ConexaoDAO {

    private Properties conexaoProp;
    private Connection con;
    private String bancoDadosms;
    private String bancoDadosNome;
    private String servidorNome;
    private String portaNumero;
    

    private static final String JDBC = "jdbc:";

    public ConexaoDAO() {
        super();
    }

    public ConexaoDAO(String usuarionome, String senha) {
        super();
        conexaoProp = new Properties();
        conexaoProp.put("usuario", usuarionome);
        conexaoProp.put("senha", senha);
    }

    public Properties getConexaoProp() {
        return conexaoProp;
    }

    public void setConexaoProp(Properties conexaoProp) {
        this.conexaoProp = conexaoProp;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getBancoDadosms() {
        return bancoDadosms;
    }

    public void setBancoDadosms(String bancoDadosms) {
        this.bancoDadosms = bancoDadosms;
    }

    public String getBancoDadosNome() {
        return bancoDadosNome;
    }

    public void setBancoDadosNome(String bancoDadosNome) {
        this.bancoDadosNome = bancoDadosNome;
    }

    public String getServidorNome() {
        return servidorNome;
    }

    public void setServidorNome(String servidorNome) {
        this.servidorNome = servidorNome;
    }

    public String getPortaNumero() {
        return portaNumero;
    }

    public void setPortaNumero(String portaNumero) {
        this.portaNumero = portaNumero;
    }

    public static String getJdbc() {
        return JDBC;
    }

    public Connection criarConexao() {

        Connection novaConnection = null;

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        return novaConnection;
    }

    
    
}
