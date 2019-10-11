/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

/**
 *
 * @author edwin
 */
public class Utiles {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
    public static class Nivel_1 extends IUtiles{

        @Override
        public String obtenerLista(int sexo) {
            //throw new UnsupportedOperationException("Not supported yet.");
            String lista = null;
            if (sexo==1) {
                lista="Zapatilla\nBuzo\nSoga de saltar";
            }
            else{
                lista="Zapatillas\nBuzo\n6m de elástico";
            }
            return lista;
        }
        
    }
    
    public static class Nivel_2 extends IUtiles{

        @Override
        public String obtenerLista(int sexo) {
            //throw new UnsupportedOperationException("Not supported yet.");
            String lista = null;
            if (sexo==1) {
                lista="Zapatilla\nBuzo\npelota de futbol Nro. 4";
            }
            else{
                lista="Zapatillas\nBuzo\npelota de voleybol Nro. 4";
            }
            return lista;
        }
        
    }
    
    public static class Nivel_3 extends IUtiles{

        @Override
        public String obtenerLista(int sexo) {
            //throw new UnsupportedOperationException("Not supported yet.");
            String lista = null;
            if (sexo==1) {
                lista="Bate\nPelota\nGuante";
            }
            else{
                lista="Bate\nPelota\nGuante";
            }
            return lista;
        }
        
    }
    
    public static class Nivel_4 extends IUtiles{

        @Override
        public String obtenerLista(int sexo) {
            //throw new UnsupportedOperationException("Not supported yet.");
            String lista = null;
            if (sexo==1) {
                lista="Ropa de baño\nGorro\nGoogles\nChimpunes";
            }
            else{
                lista="Ropa de baño\nGorro\nGoogles\nTutú";
            }
            return lista;
        }
        
    }
    
    public static class Nivel_5 extends IUtiles{

        @Override
        public String obtenerLista(int sexo) {
            //throw new UnsupportedOperationException("Not supported yet.");
            String lista = null;
            if (sexo==1) {
                lista="Ropa de baño\nGorro\nGoogles\nChimpunes\nSkateboard";
            }
            else{
                lista="Ropa de baño\nGorro\nGoogles\nStepper";
            }
            return lista;
        }
        
    }
    
    
    
}
