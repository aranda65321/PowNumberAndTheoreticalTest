package Controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

public class CtrIndex extends SelectorComposer<Component> {
	private static final long serialVersionUID = -7862676446685085257L;
	private double baseNumber;
	private double elevateN;
	@Wire
	private Button btRaised;
	@Wire
	private Textbox textboxBase;
	@Wire
	private Textbox textboxN;
	
	public CtrIndex(double baseNumber, double elevateN) {
		super();
		this.baseNumber = baseNumber;
		this.elevateN = elevateN;
	}
	
	public CtrIndex() {
	}
	
	@Listen("onClick = #btRaised")
	public void btRaised() {
		baseNumber = Double.parseDouble(textboxBase.getValue());
		elevateN = Double.parseDouble(textboxN.getValue());
		
		alert(String.valueOf(Raised(baseNumber, elevateN)));
	}
	
	public double Raised(double number, double n) {
		double pow = 0;
		double numberSums = (Math.pow(number, n)/number);
		for(int i=0; i < numberSums; i++) {
			pow += number ;	
		}
		return pow;
	}
}
