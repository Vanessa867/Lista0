package Lista0;
    import java.util.Scanner;

    public class teste {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o dia:");
            int dia = scanner.nextInt();
            System.out.println("Digite o mês:");
            int mes = scanner.nextInt();
            System.out.println("Digite o ano:");
            int ano = scanner.nextInt();

            if (dataValida(dia, mes, ano)) {
                String signo = determinarSigno(dia, mes);
                System.out.println(signo);
            } else {
                System.out.println("Data Invalida");
            }
        }

        public static boolean dataValida(int dia, int mes, int ano) {
            if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
                return false;
            }
            return true;
        }

        public static int diasNoMes(int mes, int ano) {
            switch (mes) {
                case 2:
                    return isAnoBissexto(ano) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }

        public static boolean isAnoBissexto(int ano) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                return true;
            }
            return false;
        }

        public static String determinarSigno(int dia, int mes) {
            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
                return "Aries";
            } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
                return "Touro";
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                return "Gemeos";
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                return "Cancer";
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                return "Leao";
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                return "Virgem";
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                return "Libra";
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                return "Escorpiao";
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                return "Sagitario";
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
                return "Capricornio";
            } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
                return "Aquario";
            } else {
                return "Peixes";
            }
        }
    }
