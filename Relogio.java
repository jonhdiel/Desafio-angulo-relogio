import java.util.Calendar;
import java.util.GregorianCalendar;

 public class Relogio {
	
	private int obterPosicaoPonteiroHora(long hora, long minuto){
		if (hora == 12)
        hora = 0;
    if (minuto == 60) 
        minuto = 0;
        
		return (int)(0.5 * (hora*60 + minuto));
	}
	
	private int obterPosicaoPonteiroMinuto(long minuto){
		if (minuto == 60) 
      minuto = 0;
		return (int)minuto*6;
	}

	public long retornaAnguloRelogio(GregorianCalendar horario){
		int posicaoPonteiroHora = obterPosicaoPonteiroHora(horario.getTime().getHours(),horario.getTime().getMinutes());
		int posicaoPonteiroMinuto = obterPosicaoPonteiroMinuto(horario.getTime().getMinutes());
		
      int angulo = Math.abs(posicaoPonteiroHora - posicaoPonteiroMinuto);
 
      angulo = Math.min(360-angulo, angulo);
		return angulo;
	} 

}
