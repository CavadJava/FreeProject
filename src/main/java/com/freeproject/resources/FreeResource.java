package com.freeproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freeproject.model.CalculateBean;

@RestController
// @Api(tags = "FreeResource Queries", value = "FreeResource", description =
// "Controller for FreeResource Queries")
public class FreeResource {

	@GetMapping(path = { "/", "/free" })
	// @ApiOperation(value = "Create a new vehicle")
	public String free() {
		return "free";
	}

	@PostMapping("/calculate")
	// @ApiOperation(value = "house cost calculate by parameters")
	public ResponseEntity<Object> freePost(@RequestBody CalculateBean calculateBean) {
		String deep = calculateBean.getDeep();
		String width = calculateBean.getWidth();
		String length = calculateBean.getLength();
		return ResponseEntity.ok(new String("Result:" + deep + width + length));
	}
}
