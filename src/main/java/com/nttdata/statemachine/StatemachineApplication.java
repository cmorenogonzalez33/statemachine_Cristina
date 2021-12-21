package com.nttdata.statemachine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.statemachine.circuit.Circuit;

@SpringBootApplication
public class StatemachineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StatemachineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Circuit c1 = new Circuit(20, 10, 0.2, 3, 31);
		System.out.println("El estado de la máquina es " + c1.getEstado());
		Circuit c2 = new Circuit(2, 10, 0.2, 3, 13);
		System.out.println("El estado de la máquina es " + c2.getEstado());
		
	}

}
