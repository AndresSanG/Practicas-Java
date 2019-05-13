import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalCalculadora {

    private static final LocalDate LocalDate = null;

    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);
        long resultado;
        long numeroUno;
        long numeroDos;
        final String operacion = null;
        Boolean checkUno = false;
        Boolean validarOper = false;
        EnumCalculadora operacionElegida = null;

        do {
            try {

                System.out.println("Inserte el primer núermo");
                numeroUno = entrada.nextInt();
                checkUno = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número váido");
                checkUno = true;
            }

        } while (checkUno);

        do {
            try {
                entrada = new Scanner(System.in);
                System.out.println("Inserte el segundo núermo");
                numeroDos = entrada.nextInt();
                checkUno = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número váido");
                checkUno = true;
            }
        } while (checkUno);

        do {
            try {
                entrada = new Scanner(System.in);
                System.out.println("Inserte la operación");
                System.out.println("SUMA");
                System.out.println("RESTA");
                System.out.println("DIVISION");
                System.out.println("MULTIPLICACION");
                operacion = entrada.next();

                operacionElegida = EnumCalculadora.valueOf(operacion.toUpperCase());

                validarOper = false;
            } catch (final InputMismatchException e) {
                System.out.println("Operación invalida, vuelva a intentar");
                validarOper = true;
            } catch (IllegalArgumentException | NullPointerException ex) {
                System.out.println("Operación invalida, se termina el programa, bye!!!");
                validarOper = true;
            }
        } while (validarOper);
        switch (operacionElegida) {
        case SUMA:
            resultado = numeroUno + numeroDos;
            System.out.println("El resultado de la operación " + operacionElegida.SUMA + " es: " + resultado);
            break;
        case RESTA:
            resultado = numeroUno - numeroDos;
            System.out.println("El resultado de la operación " + operacionElegida.RESTA + " es: " + resultado);
            break;
        case MULTIPLICACION:
            resultado = numeroUno * numeroDos;
            System.out.println("El resultado de la operación " + operacionElegida.MULTIPLICACION + " es: " + resultado);
            break;
        case DIVISION:
            resultado = numeroUno / numeroDos;
            System.out.println("El resultado de la operación " + operacionElegida.DIVISION + " es: " + resultado);
            break;
        default:
            System.out.println("!NO!");
            break;

        }

        if (entrada != null) {
            entrada.close();
        }

        // (
//              id serial NOT NULL,
        // varchar NULL,
        // numeric NULL,
        // numeric NULL,
        // numeric NULL,
        // date NULL,
        // varchar NULL,
        // CONSTRAINT calculadora_pk PRIMARY KEY (id)
        // );
        final String nombreMio = "Andres Santiago";
        // LocalDate date = LocalDate;
        final Conexion conectar = new Conexion();

        final Connection connection = conectar.conectarBaseDeDatos();

        final String nombreTabla = "CREATE TABLE public.calculadora";
        final String insertarPersonajes = "INSERT INTO public.\"" + nombreTabla
                + "\" (operacion,numero1,numero2,resultado,fecha,alumno) VALUES (?,?,?,?,?,?);";

        final String consultarPersonajesSelect = "SELECT * FROM public.\"" + nombreTabla + "\";";

        try {
            PreparedStatement ps = connection.prepareStatement(insertarPersonajes);
            ps.setString(1, operacion);
            ps.setLong(2, numeroUno);
            ps.setLong(3, numeroDos);
            ps.setLong(4, resultado);
            ps.setInt(5, LocalDate);
            ps.setString(6, nombreMio);
            ps.executeUpdate();
            ps = connection.prepareStatement(consultarPersonajesSelect);

            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print("//");
                System.out.print(rs.getInt("id"));
                System.out.print("//");
                System.out.print(rs.getString("operacion"));
                System.out.print("//");
                System.out.print(rs.getLong("numeroUno"));
                System.out.print("//");
                System.out.println(rs.getLong("numeroDos"));
                System.out.print("//");
                System.out.print(rs.getLong("resultado"));
                System.out.print("//");
                System.out.print(rs.getDate("fecha"));
                System.out.print("//");
                System.out.println(rs.getString("nombre"));
                System.out.print("//");
                System.out.println();
            }

        } catch (final SQLException e) {
            e.printStackTrace();

        }

    }
}