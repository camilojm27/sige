package sige.finance.Facturas;

import sige.db.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacturaModel {
    private JDBCConnection DB = new JDBCConnection();
    

        
        public ArrayList<ArrayList<String>> returnData(){
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        ResultSet resultSet = DB.getRecords("SELECT \r\n"
        		+ "	clientes.id, \r\n"
        		+ "	clientes.primer_nombre,  \r\n"
        		+ "	clientes.primer_apellido,\r\n"
        		+ "	clientes.email,\r\n"
        		+ "	facturas.id_contrato,\r\n"
        		+ "	facturas.fecha_expedicion,\r\n"
        		+ "	facturas.fecha_vencimiento\r\n"
        		+ "FROM clientes FULL OUTER JOIN facturas ON clientes.id=facturas.id_cliente;");
        try {
			while (resultSet.next()) {
			    ArrayList<String> usuarios = new ArrayList<>();
			    usuarios.add(resultSet.getString("id"));
			    usuarios.add(resultSet.getString("primer_nombre"));
			    usuarios.add(resultSet.getString("primer_apellido"));
			    usuarios.add(resultSet.getString("email"));
			    usuarios.add(resultSet.getString("id_contrato"));
			    usuarios.add(resultSet.getString("fecha_expedicion"));
			    usuarios.add(resultSet.getString("fecha_vencimiento"));
			    data.add(usuarios);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
        return data;
    }
        
    public Object[][] obtenerMatrizData(){
        ArrayList<ArrayList<String>> data = returnData();
        String[][] dataInfo;
        dataInfo = new String[data.size()][7];
        for(int x = 0; x < data.size(); x++){
            dataInfo[x][0] = data.get(x).get(0);
            dataInfo[x][1] = data.get(x).get(1);
            dataInfo[x][2] = data.get(x).get(2);
            dataInfo[x][3] = data.get(x).get(3);
            dataInfo[x][4] = data.get(x).get(4);
            dataInfo[x][5] = data.get(x).get(5);
            dataInfo[x][6] = data.get(x).get(6);
        }
        return dataInfo;
    }
    
    /**    
    public void updateData(int Column, String dato, String identificador){
    	String SQL = "UPDATE usuarios SET ";
        String[] params = {dato, identificador};
        
        switch (Column) {
            case 0:
                SQL += "num_documento = ? WHERE num_documento = ?";
                System.out.println(Integer.parseInt(dato));
                break;
            case 1:
                SQL += "primer_nombre = ? WHERE num_documento = ?";
                break;
            case 2:
                SQL += "primer_apellido = ? WHERE num_documento = ?";
                break;
            case 3:
                SQL += "password = ? WHERE num_documento = ?";
                break;
            case 4:
                SQL += "email = ? WHERE num_documento = ?";
                break;
            case 5:
                SQL += "activo = ? WHERE num_documento = ?";
                break;
            case 6:
                SQL += "id_rol = ? WHERE num_documento = ?";
                break;
            default:
                break;
        }
        int affectedrows = DB.updateRecord(SQL, params);
        System.out.println("Affected rows: " + affectedrows);
    } */
}