package io.github.developerheart.gastosclient.client;

import io.github.developerheart.gastosclient.dto.response.GastoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gastoClient", url = "${feign.url.site}")
public interface GastoClient {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/gasto/{id}")
	GastoResponse buscar(@PathVariable("id") Integer id);

}

