package io.github.developerheart.gastosclient.controller;

import io.github.developerheart.gastosclient.client.GastoClient;
import io.github.developerheart.gastosclient.dto.response.GastoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Controller
@RequestMapping("/gasto")
public class GastoController implements Serializable {

	@Autowired
	private transient GastoClient gastoClient;

	@GetMapping("/{id}")
	public ResponseEntity<GastoResponse> bucarUmGastoPorID(@PathVariable Integer id){
		GastoResponse gastoResponse = gastoClient.buscar(id);
		return ResponseEntity.ok(gastoResponse);
	}

}
