import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalCalculadora {

    public static void main(final String[] args) {

        Scanner entrada = new Scanner(System.in);
        // eleccionInicial;
        long resultado = 0;
        long numeroUno = 0;
        long numeroDos = 0;
        String operacion = null;
        Boolean checkUno = false;
        Boolean validarOper = false;
        EnumCalculadora operacionElegida = null;

        // System.out.println("¿Que quieres hacer?");
//        System.out.println("Teclea 1 para Operacion");
//        System.out.println("Teclea 2 para Revisar Historial");
//        System.out.println("Teclea 3 para Salir");
//        eleccionInicial = entrada.nextInt();

        // switch (eleccionInicial) {
        // case 1:

        do {
            try {

                System.out.println("Inserte el primer núermo");
                numeroUno = entrada.nextLong();
                checkUno = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número válido");
                checkUno = true;
            }

        } while (checkUno);

        do {
            try {
                entrada = new Scanner(System.in);
                System.out.println("Inserte el segundo núermo");
                numeroDos = entrada.nextLong();
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
                System.out.println("Operación invalida, se cierra");
                validarOper = true;
            }
        } while (validarOper);

        final Calculadora calculadora = new Calculadora();
        switch (operacionElegida) {
        case SUMA:
            resultado = calculadora.suma(numeroUno, numeroDos);
            break;
        case RESTA:
            resultado = calculadora.suma(numeroUno, numeroDos);
            break;
        case MULTIPLICACION:
            resultado = calculadora.suma(numeroUno, numeroDos);
            break;
        case DIVISION:
            resultado = calculadora.suma(numeroUno, numeroDos);
            break;
        default:
            System.out.println("!NO!");
            break;
        }

        if (entrada != null) {
            entrada.close();
        }

        final String nombreMio = "Andres Santiago";
        final Conexion conectar = new Conexion();

        final Connection connection = conectar.conectarBaseDeDatos();

        final String nombreTabla = "calculadora";
        final String insertarValores = "INSERT INTO public.\"" + nombreTabla
                + "\" (operacion,numero1,numero2,resultado,fecha,alumno) VALUES (?,?,?,?,?,?);";
        final String consultarValores = "SELECT * FROM public.\"" + nombreTabla + "\";";

        try {

            PreparedStatement ps = null;
            ps = connection.prepareStatement(insertarValores);
            ps.setString(1, operacion);
            ps.setLong(2, numeroUno);
            ps.setLong(3, numeroDos);
            ps.setLong(4, resultado);
            ps.setDate(5, new Date(System.currentTimeMillis()));
            ps.setString(6, nombreMio);
            ps.executeUpdate();
            ps = connection.prepareStatement(consultarValores);
//            break;

            // case 2:
            ps = connection.prepareStatement(consultarValores);
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
//            break;

//        default:
            // System.out.println("!!");
            // break;
            // }
        }

    }
}