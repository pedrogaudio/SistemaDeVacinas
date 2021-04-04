package sistemadevacinas;

import java.util.ArrayList;

public class Consulta {

	Medico medico;
	Enfermeira enfermeira;
	Paciente paciente;
	Data data;
        ArrayList<String> vacinas;
        private static int i = 0;

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Enfermeira getEnfermeira() {
		return enfermeira;
	}

	public void setEnfermeira(Enfermeira enfermeira) {
		this.enfermeira = enfermeira;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
        
        public ArrayList<String> getVacinas(){
            return vacinas;
        }
        
        public void setVacinas(String vacina){
            this.vacinas.set(i, vacina);
            i++;
        }
}
