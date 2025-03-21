import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<String> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(String nome) {
        fila.add(nome);
        System.out.println("Paciente " + nome + " entrou na fila.");
    }

    public void chamarPacientes() {
        if (fila.isEmpty()) {
            System.out.println("Não há pacientes na fila para atender.");
            return;
        }

        System.out.println("Atendendo os pacientes:");
        
        int pacientesAtendidos = 0;
        while (pacientesAtendidos < 2 && !fila.isEmpty()) {
            String paciente = fila.poll();
            System.out.println("Atendendo: " + paciente);
            pacientesAtendidos++;
        }
    }

    public int getNumeroDePacientes() {
        return fila.size();
    }

    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Pacientes na fila: " + fila);
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionarPaciente("João");
        fila.adicionarPaciente("Maria");
        fila.adicionarPaciente("Pedro");

        fila.exibirFila();

        fila.chamarPacientes();
        fila.chamarPacientes();

        fila.exibirFila();
    }
}
