import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalCalculadora {

    public static void main(final String[] args) {

        final Scanner entrada = new Scanner(System.in);
        // eleccionInicial;
        final long resultado = 0;
        final long numeroUno = 0;
        final long numeroDos = 0;
        final String operacionElegida;
        int casoGeneral;
        Boolean verificadorPrincipal = false;
        boolean validarOper;
        final String operacion;
        final String nombreMio = "Andres Santiago";
        final Conexion conectar = new Conexion();
        final Connection connection = conectar.conectarBaseDeDatos();
        final String nombreTabla = "calculadora";
        final String insertarValores = "INSERT INTO public.\"" + nombreTabla
                + "\" (operacion,numero1,numero2,resultado,fecha,alumno) VALUES (?,?,?,?,?,?);";
        final String consultarValores = "SELECT * FROM public.\"" + nombreTabla + "\";";


        final Menu menu = new Menu();
        final OperacionEleccion operelec = new OperacionEleccion();

        menu.principal();
        do {
            try {
        casoGeneral = entrada.nextInt();
            } catch (final InputMismatchException e) {
                System.out.println("Inserte una opcion valida");
                verificadorPrincipal = true;
            }
        } while (verificadorPrincipal);

        final OperacionInsercion opInse = new OperacionInsercion();
        switch (casoGeneral) {
        case 1:

            opInse.insercionUno ();
                numeroUno=opInse.numeroUno;
            opInse.insercionDos ();
            numeroDos=opInse.numeroDos;

            menu.operaciones();



            do {
                        try {

                            entrada = new Scanner(System.in);
                            operacion = entrada.next();

                            validarOper = false;
                        } catch (final InputMismatchException e) {
                            System.out.println("Operación invalida, vuelva a intentar");
                            validarOper = true;
                        } catch (IllegalArgumentException | NullPointerException ex) {
                            System.out.println("Operación invalida, se cierra");
                            validarOper = true;
                        }
                    } while (validarOper);
                }

                    operacionElegida = valueOf(operacion.toUpperCase());


                    final Calculadora calculadora = new Calculadora();
                    switch (operacionElegida) {
                    case SUMA:
                        resultado = calculadora.suma(numeroUno, numeroDos);

                        PreparedStatement ps = connection.prepareStatement(insertarValores);
                        ps = connection.prepareStatement(insertarValores);
                        ps.setString(1, operacion);
                        ps.setLong(2, numeroUno);
                        ps.setLong(3, numeroDos);
                        ps.setLong(4, resultado);
                        ps.setDate(5, new Date(System.currentTimeMillis()));
                        ps.setString(6, nombreMio);
                        ps.executeUpdate();
                        break;
                    case RESTA:
                        resultado = calculadora.resta(numeroUno, numeroDos);
                        break;
                    case MULTIPLICACION:
                        resultado = calculadora.multiplicacion(numeroUno, numeroDos);
                        break;
                    case DIVISION:
                        resultado = calculadora.division(numeroUno, numeroDos);
                        break;
                    default:
                        System.out.println("!NO!");
                        break;
                    }
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

                    } catch (final SQLException e) {
                        e.printStackTrace();
                    }

                    break;



            case 2:

                    try {
            ps = connection.prepareStatement(consultarValores);
            final ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ;
            } {
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
                break;
            }

        } catch (final SQLException e) {
            e.printStackTrace();
        }



            if (entrada != null) {
                entrada.close();
            }
                }

    private static void EnumCalculadora() {
        // TODO Auto-generated method stub

    }

    private static String valueOf(final String upperCase) {
        // TODO Auto-generated method stub
        return null;
    }
}}
