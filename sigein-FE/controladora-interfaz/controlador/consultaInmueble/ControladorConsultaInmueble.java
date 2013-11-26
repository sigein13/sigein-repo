package controlador.consultaInmueble;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class ControladorConsultaInmueble  extends SelectorComposer<Window>{
	@Wire Combobox comboDormitorio;
	@Wire Label labelDormitorio; 
	@Wire Combobox comboInm;
	
	public void doAfterCompose(Window comp) throws Exception{
		  super.doAfterCompose(comp);
		  
	  }
	  @Listen("onSelect=#comboInm")
	  public void visibleCombo(){
		  System.out.println("ENTRAAA!!!");
		  String combo = comboInm.getValue();
		  if(combo.equals("Galpon") || combo.equals("Terreno") || combo.equals("Local")){
			  comboDormitorio.setVisible(false);
			  labelDormitorio.setVisible(false);
		  }
		  
		  else{
			  comboDormitorio.setVisible(true);
			  labelDormitorio.setVisible(true);
		  }
		  
	  }

}
