package sistemadevacinas;

public class Enfermeira extends Pessoa {

    private int coren;

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }

    public Enfermeira() {
    }

    public Enfermeira(String nome, int idade, int cpf, String eMail, String login, String senha, Endereco endereco, int coren) {
        super(nome, idade, cpf, eMail, login, senha, endereco);
        this.coren = coren;
    }

    //poderia fzer mais bonito e transformar isso num enum
    public double aplicaVacina(String vacina, int idade) {

        if (idade <= 2) {
            switch (vacina.toLowerCase()) {
                case "vacina sarampo":
                    return 0.40;
                case "vacina h1n1":
                    return 0.30;
                case "vacina meningite":
                    return 0.10;
                case "vacina malária":
                    return 0.25;
                case "vacina covid19 ":
                    return 0.20;
                default:
                    return 0.45;
            }

        } else if (idade >= 3 && idade <= 9) {
            switch (vacina.toLowerCase()) {
                case "vacina sarampo":
                    return 0.60;
                case "vacina h1n1":
                    return 0.60;
                case "vacina meningite":
                    return 0.40;
                case "vacina malária":
                    return 0.35;
                case "vacina covid19 ":
                    return 0.55;
                default:
                    return 0.55;
            }

        } else if (idade >= 10 && idade < 18) {
            switch (vacina.toLowerCase()) {
                case "vacina sarampo":
                    return 0.80;
                case "vacina h1n1":
                    return 0.90;
                case "vacina meningite":
                    return 0.60;
                case "vacina malária":
                    return 0.75;
                case "vacina covid19 ":
                    return 0.75;
                default:
                    return 0.70;
            }

        } else {
            switch (vacina.toLowerCase()) {
                case "vacina sarampo":
                    return 1.00;
                case "vacina h1n1":
                    return 1.20;
                case "vacina meningite":
                    return 0.90;
                case "vacina malária":
                    return 0.85;
                case "vacina covid19 ":
                    return 0.85;
                default:
                    return 0.95;
            }
        }
    }
}
