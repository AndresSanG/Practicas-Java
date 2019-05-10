import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalBaseDatos {
    public static void main(final String[] args) {

        final Conexion conectar = new Conexion();

        final Connection connection = conectar.conectarBaseDeDatos();

        final String nombreTabla = "Personajes";
        final String insertarPersonajes = "INSERT INTO public.\"" + nombreTabla
                + "\" (nombre,ciudad,alias) VALUES (?,?,?);";

        final String consultarPersonajesSelect = "SELECT * FROM public.\"" + nombreTabla + "\";";

        try {
            PreparedStatement ps = connection.prepareStatement(insertarPersonajes);
            ps.setString(1, "Diana Prince");
            ps.setString(2, "Temisira");
            ps.setString(3, "Wonder Woman");

            ps.executeUpdate();
            ps = connection.prepareStatement(consultarPersonajesSelect);
            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print("//");
                System.out.print(rs.getInt("id"));
                System.out.print("//");
                System.out.print(rs.getString("nombre"));
                System.out.print("//");
                System.out.print(rs.getString("ciudad"));
                System.out.print("//");
                System.out.println(rs.getString("alias"));
                System.out.print("//");
                System.out.println();
            }

        } catch (final SQLException e) {
            e.printStackTrace();

        }

    }
}
