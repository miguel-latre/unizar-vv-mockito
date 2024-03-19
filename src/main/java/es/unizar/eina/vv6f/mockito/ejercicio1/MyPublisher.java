package es.unizar.eina.vv6f.mockito.ejercicio1;

import java.util.ArrayList;
import java.util.List;

// TODO Escribir pruebas para esta clase en JUnit4 con Mockito
public class MyPublisher implements Publisher {
	
	private final List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void add(Subscriber subscriber) {
		// TODO completar
	}

	@Override
	public void publish(String message) {
		// TODO completar
	}

}
