
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;


public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao=new UsuarioDAO();
        
//        Usuario userNuevo=new Usuario("matias5555","11223344");
//        usuarioDao.insertar(userNuevo);
        
        Usuario userNuevo=new Usuario(2,"matias7777","11223344");
        //usuarioDao.actualizar(userNuevo);
        
        usuarioDao.eliminar(userNuevo);
        
        
        
        List<Usuario> usuarios= usuarioDao.selecionar();
        for(Usuario x:usuarios){
            System.out.println("x = " + x);
        }
        
    }
}
