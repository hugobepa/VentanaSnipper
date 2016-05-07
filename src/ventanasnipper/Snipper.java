
package ventanasnipper;

import javax.swing.JOptionPane;


public class Snipper {
    
    int dia=0,año=0, mes=0;
    String sexo="", talla="";

    public Snipper() {
    }
    
   public void getFecha (String d, String m,String a)
   {
       this.dia=Integer.parseInt(d);
       this.mes=Integer.parseInt(m);
       this.año=Integer.parseInt(a);
       
   }
   
   public void getSexo(String r)
   {
       sexo=r;
   }
   
   public void getTalla(String t){
       talla=t;
   }
   
    public void mostrarDatos()
    {
        JOptionPane.showMessageDialog(null,"fecha: "+dia+"/"+mes+"/"+año+"\n"
                +"sexo: "+sexo+"\n"+"talla: "+talla+"\n");
        
    }
}
